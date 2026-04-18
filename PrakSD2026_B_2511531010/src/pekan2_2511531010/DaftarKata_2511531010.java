package pekan2_2511531010;

import java.util.ArrayList;
public class DaftarKata_2511531010 {
	private final ArrayList<String> data;
	// Konstruktor: inisialisasi list kosong
	public DaftarKata_2511531010 () {
		this.data = new ArrayList<>();
	}
	/** Menambahkan elemen di akhir list.*/
	public void tambah_2511531010(String elemen) {
		data.add(elemen);
	}
	/** Menambahkan elemen pada indeks tertentu (menyisipkan).*/
	public void tambahPada_2511531010(int index, String elemen) {
		data.add(index, elemen);
	}
	/**
	 * Mengubah elemen pada posisi 'index' menjadi 'nilaiBaru'.
	 * Bertindak sebagai "setter" untuk elemen tertentu.
	 */
	public void ubahElemen_2511531010(int index, String nilaiBaru) {
		data.set(index, nilaiBaru);
	}
	/**
	 * Menghapus elemen pada posisi 'index' dan mengembalikan nilai yang dihapus.
	 */public String hapusElement_2511531010(int index) {
		 return data.remove(index);
	 }
	 /**
	  * Melakukan
	  * 
	  */
	public void iterasiCetak() {
		for (int i = 0; i < data.size(); i++) {
			System.out.print(data.get(i) + " ");			
		}
	}
	public String get(int index) {
		return data.get(index);
	}
	public String toString() {
		return data.toString();
	}
	
}
