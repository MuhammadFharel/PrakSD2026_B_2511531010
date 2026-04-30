package pekan4_2511531010;

import java.util.Scanner;

public class AntrianLoketDriver_2511531010 {

	public static void main(String[] args) {
		Scanner input_1010 = new Scanner(System.in);
		AntrianLoket_2511531010 antrian_1010 = new AntrianLoket_2511531010(100);
		
		int pilihan_1010;
		
		do {
			System.out.println("=== PROGRAM ANTRIAN LOKET ===");
			System.out.println("1. Tambah Antrian");
			System.out.println("2. Hapus Antrian");
			System.out.println("3. Tampilkan Antrian");
			System.out.println("4. Reverse");
			System.out.println("5. Keluar");
			System.out.print("Pilih menu: ");
			
			pilihan_1010 = input_1010.nextInt();
			input_1010.nextLine();
			
			switch (pilihan_1010) {
				
				case 1:
					System.out.print("Masukkan nama pelanggan: ");
					String nama_1010 = input_1010.nextLine();
					antrian_1010.enqueue_1010(nama_1010);
					break;
					
				case 2:
					antrian_1010.dequeue_1010();
					break;
					
				case 3:
					antrian_1010.display_1010();
					break;
					
				case 4:
					antrian_1010.reverse_1010();
					antrian_1010.display_1010();
					break;
					
				case 5:
					System.out.println("Program selesai");
					break;
					
				default:
					System.out.println("Pilihan tidak valid!");
			}
			
		} while (pilihan_1010 != 5);
		
		input_1010.close();
	}
}