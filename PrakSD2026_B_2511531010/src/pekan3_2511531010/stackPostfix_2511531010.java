package pekan3_2511531010;

import java.util.Scanner;
import java.util.Stack;

public class stackPostfix_2511531010 {
    public static int postfixEvaluate_2511531010(String expression) {
        Stack<Integer> s = new Stack<Integer>();
        Scanner input = new Scanner(expression);
        while (input.hasNext()) {
            if (input.hasNextInt()) {  // operand
                s.push(input.nextInt());
            } else {
                String operator_2511531010 = input.next();
                int operand2_2511531010 = s.pop();
                int operand1_2511531010 = s.pop();

                if (operator_2511531010.equals("+")) {
                    s.push(operand1_2511531010 + operand2_2511531010);
                } else if (operator_2511531010.equals("-")) {
                    s.push(operand1_2511531010 - operand2_2511531010);
                } else if (operator_2511531010.equals("*")) {
                    s.push(operand1_2511531010 * operand2_2511531010);
                } else {
                    s.push(operand1_2511531010 / operand2_2511531010);
                }
            }
        }

        input.close();
        return s.pop();
    }

    public static void main(String[] args) {
        System.out.println("hasil postfix = " + postfixEvaluate_2511531010("5 2 4 * + 7 -"));
    }
}