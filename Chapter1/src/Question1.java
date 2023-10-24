
import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class Question1 extends JFrame{
    List<Integer> scoreList = new ArrayList<>();
    public Question1(){
        JButton jbtDisplayScoreList = new JButton("Score List");
        JButton jbtAddScore = new JButton("Add Score");
        JButton jbtLowestScore = new JButton("Lowest Score");
        JButton jbtHigestScore = new JButton("Highest Score");
        JButton jbtScoreAverage = new JButton("Score Average");
        
        add(jbtDisplayScoreList);
        jbtDisplayScoreList.addActionListener(new jbtDisplayScoreListListener());
        add(jbtAddScore);
        jbtAddScore.addActionListener(new jbtAddScoreListener());
        add(jbtLowestScore);
        jbtLowestScore.addActionListener(new jbtLowestScoreListener());
        add(jbtHigestScore);
        jbtHigestScore.addActionListener(new jbtHigestScoreListener());
        add(jbtScoreAverage);
        jbtScoreAverage.addActionListener(new jbtScoreAverageListener());
        
        setLayout(new GridLayout(5, 1));
        setTitle("Score Management System");
        setSize(350,300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    
    private class jbtDisplayScoreListListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            StringBuilder list = new StringBuilder();
            for (int i = 0; i < scoreList.size(); i++) {
                list.append(i+1 + ". " + scoreList.get(i) + "\n");
            }
            JOptionPane.showMessageDialog(null, list, "Score List", JOptionPane.INFORMATION_MESSAGE);
        }
    }
    
    private class jbtAddScoreListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            String score = JOptionPane.showInputDialog(null,"Enter the score");
            if(score != null){
                try{
                    scoreList.add(Integer.parseInt(score));
                }catch(Exception ex){
                    JOptionPane.showMessageDialog(null, "Invalid Input", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
        
    }
    
    private class jbtLowestScoreListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            if(scoreList.size() > 0){
                JOptionPane.showMessageDialog(null, "The lowest score is " + computeLowestScore(), "Lowest Score", JOptionPane.INFORMATION_MESSAGE);
            }else{
                JOptionPane.showMessageDialog(null, "No score founded", "Lowest Score", JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }
    
    private class jbtHigestScoreListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            if(scoreList.size() > 0){
                JOptionPane.showMessageDialog(null, "The highest score is " + computeHigestScore(), "Highest Score", JOptionPane.INFORMATION_MESSAGE);
            }else{
                    JOptionPane.showMessageDialog(null, "No score founded", "Highest Score", JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }
    
    private class jbtScoreAverageListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            if(scoreList.size() > 0){
                JOptionPane.showMessageDialog(null, "The score average is " + computeScoreAverage(), "Score Average", JOptionPane.INFORMATION_MESSAGE);
            }else{
                    JOptionPane.showMessageDialog(null, "No score founded", "Score Average", JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }
    
    public int computeLowestScore(){
        int lowestScore = scoreList.get(0);
        for (int i = 0; i < scoreList.size(); i++) {
            if(lowestScore > scoreList.get(0)){
                lowestScore = scoreList.get(0);
            }
        }
        return lowestScore;
    }
    
    public int computeHigestScore(){
        int highestScore = scoreList.get(0);
        for (int i = 0; i < scoreList.size(); i++) {
            if(highestScore < scoreList.get(i)){
                highestScore = scoreList.get(i);
            }
        }
        return highestScore;
    }
    
    public double computeScoreAverage(){
        int total = 0;
        for (int i = 0; i < scoreList.size(); i++) {
            total += scoreList.get(i);
        }
        return (double)total / scoreList.size();
    }
    
    
    public static void main (String arg[]){
        new Question1();
    }
}
