package pekan4_2511531010;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReverseData_2511531010 {
	public static void main(String[] args) {
		Queue<Integer> q_1010 = new LinkedList<Integer>();
		q_1010.add(1);
		q_1010.add(2);
		q_1010.add(3); // [1, 2, 3]
		System.out.println("sebelum reverse " + q_1010);
		Stack<Integer> s_1010 = new Stack<Integer>();
		while (!q_1010.isEmpty()) { // Q -> S
			s_1010.push(q_1010.remove());
		}
		while (!s_1010.isEmpty()) { // S -> Q
			q_1010.add(s_1010.pop());
		}
		System.out.println("sesudah reverse " + q_1010); // [3, 2, 1]
	}
}