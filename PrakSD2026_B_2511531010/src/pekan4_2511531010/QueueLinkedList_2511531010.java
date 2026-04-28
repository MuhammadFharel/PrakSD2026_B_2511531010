package pekan4_2511531010;

import java.util.LinkedList;
import java.util.Queue;

public class QueueLinkedList_2511531010 {
	public static void main(String[] args) {
		Queue<Integer> q_1010 = new LinkedList<>();
		// tambah elemen 0,1,2,3,4,5 ke antrian
		for (int i_1010 = 0; i_1010 < 6; i_1010++) {
			q_1010.add(i_1010);
		}
		// menampilkan isi antrian
		System.out.println("Elemen Antrian " + q_1010);
		// untuk menghapus kepala antrian
		int hapus_1010 = q_1010.remove();
		System.out.println("Hapus elemen = " + hapus_1010);
		System.out.println(q_1010);
		// untuk melihat antrian terdepan
		int depan_1010 = q_1010.peek();
		System.out.println("Kepala Antrian = " + depan_1010);
		
		int banyak_1010 = q_1010.size();
		System.out.println("Size Antrian = " + banyak_1010);
	}
}