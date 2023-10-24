/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class AlgorithmPerformanceTester {
    public static void main(String[] args) {
        String result = "Iterations\tAlgorithm A\tAlgorithm B\tAlgorithm C\n";

        //10 iterations
        long startTime = System.nanoTime();
        Algorithm.AlgorithmA(10);
        long endTime = System.nanoTime();
        long elapse = endTime - startTime;
        result += "10\t\t" + elapse;
        
        startTime = System.nanoTime();
        Algorithm.AlgorithmB(10);
        endTime = System.nanoTime();
        elapse = endTime - startTime;
        result += "\t\t" + elapse;
        
        startTime = System.nanoTime();
        Algorithm.AlgorithmC(10);
        endTime = System.nanoTime();
        elapse = endTime - startTime;
        result += "\t\t" + elapse + "\n";
        
        //100 iterations
        startTime = System.nanoTime();
        Algorithm.AlgorithmA(100);
        endTime = System.nanoTime();
        elapse = endTime - startTime;
        result += "100\t\t" + elapse;
        
        startTime = System.nanoTime();
        Algorithm.AlgorithmB(100);
        endTime = System.nanoTime();
        elapse = endTime - startTime;
        result += "\t\t" + elapse;
        
        startTime = System.nanoTime();
        Algorithm.AlgorithmC(100);
        endTime = System.nanoTime();
        elapse = endTime - startTime;
        result += "\t\t" + elapse + "\n";
        
        //1000 iterations
        startTime = System.nanoTime();
        Algorithm.AlgorithmA(1000);
        endTime = System.nanoTime();
        elapse = endTime - startTime;
        result += "1000\t\t" + elapse;
        
        startTime = System.nanoTime();
        Algorithm.AlgorithmB(1000);
        endTime = System.nanoTime();
        elapse = endTime - startTime;
        result += "\t\t" + elapse;
        
        startTime = System.nanoTime();
        Algorithm.AlgorithmC(1000);
        endTime = System.nanoTime();
        elapse = endTime - startTime;
        result += "\t\t" + elapse + "\n";
        
        System.err.println(result);
    }
}
