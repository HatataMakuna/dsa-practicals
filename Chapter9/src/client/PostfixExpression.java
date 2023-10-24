/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client;

import adt.BinaryTree;
import java.util.Stack;

/**
 *
 * @author user
 */
public class PostfixExpression {
    public static void main(String[] args) {
        Stack<BinaryTree<String>> stack = buildPostFixExpressionBinaryTree("abc*+");
        stack.peek().postorderTraverse();
    }
    
    public static Stack<BinaryTree<String>> buildPostFixExpressionBinaryTree(String expression){
        Stack<BinaryTree<String>> stack = new Stack<>();
        for (int i = 0; i < expression.length(); i++) {
            char ch = expression.charAt(i);
            if(!Character.isWhitespace(ch)){
                if(Character.isDigit(ch) || Character.isAlphabetic(ch)){
                    BinaryTree<String> operandTree = new BinaryTree<>(ch + "");
                    stack.push(operandTree);
                }else if (isOperator(ch)){
                    BinaryTree<String> rightSubTree = stack.pop();
                    BinaryTree<String> leftSubTree = stack.pop();
                    BinaryTree<String> binaryTree = new BinaryTree<>(ch + "", leftSubTree, rightSubTree);
                    stack.push(binaryTree);
                }else{
                    return null;
                }
            }else{
                return null;
            }
        }
        return stack;
    }
    
    public static boolean isOperator(char ch){
        if(ch == '+' || ch == '-' || ch == '*' || ch == '/'){
            return true;
        }else{
            return false;
        }
    }
}
