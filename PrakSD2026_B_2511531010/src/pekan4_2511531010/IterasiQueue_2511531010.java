package pekan4_2511531010;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class IterasiQueue_2511531010 {
	public static void main(String args[]) {
		
		Queue<String> q_1010 = new LinkedList<>();
		
		q_1010.add("Praktikum");
		q_1010.add("Struktur");
		q_1010.add("Data");
		q_1010.add("Dan");
		q_1010.add("Algoritma");
		Iterator<String> iterator_1010 = q_1010.iterator();
		while (iterator_1010.hasNext()) {
			System.out.print(iterator_1010.next() + " ");
		}
	}
}