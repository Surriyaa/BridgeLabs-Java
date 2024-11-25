package com.practiceprograms;

import java.util.Stack;

public class BalancedParentheses {
    
    // Function to check if parentheses are balanced
    public static boolean isBalanced(String s) {
        Stack<Character> stack = new Stack<>();
        
        // Traverse each character in the string
        for (char c : s.toCharArray()) {
            // If it's an opening bracket, push it to the stack
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } 
            // If it's a closing bracket
            else if (c == ')' || c == '}' || c == ']') {
                // If stack is empty or top of the stack doesn't match, return false
                if (stack.isEmpty()) {
                    return false; // No corresponding opening bracket
                }
                
                char top = stack.pop();
                if ((c == ')' && top != '(') ||
                    (c == '}' && top != '{') ||
                    (c == ']' && top != '[')) {
                    return false; // Mismatched brackets
                }
            }
        }
        
        // If stack is empty, it means all opening brackets had a matching closing bracket
        return stack.isEmpty();
    }

    // Main method for testing
    public static void main(String[] args) {
        String input1 = "([{}])";
        String input2 = "([)]";
        //isBalanced(input1);
        //System.out.println("Input 1: " + input1 + " -> " + isBalanced(input1)); // true
        System.out.println("Input 2: " + input2 + " -> " + isBalanced(input2)); // false
    }
}

