package pekan1_2511531010;

import java.util.Scanner;

public class JamDriver2_2511531010 {
	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("=== Program Driver Objek Jam ===");
       
        System.out.println("\n--- Input Jam 1 ---");
        Jam_2511531010 j1 = buatJamDariInput(input);
  
        System.out.println("\n--- Input Jam 2 ---");
        Jam_2511531010 j2 = buatJamDariInput(input);

        System.out.println("\n--- Hasil Operasi ---");
        System.out.println("Jam 1 (String)           : " + j1.toString());
        System.out.println("Jam 2 (String)           : " + j2.toString());
        System.out.println("Jam 1 dalam detik        : " + j1.toSeconds());
        System.out.println("Jam 2 dalam detik        : " + j2.toSeconds());
        
        int perbandingan = j1.compareTo(j2);
        if (perbandingan > 0) {
            System.out.println("Status : Jam 1 lebih besar dari Jam 2"); 
        } else if (perbandingan < 0) {
            System.out.println("Status : Jam 1 lebih kecil dari Jam 2");
        } else {
            System.out.println("Status : Jam 1 sama dengan Jam 2");
        }
        
        System.out.println("Durasi (j1 ke j2) : " + Jam_2511531010.durasiDetik(j1, j2) + " detik");
        
        System.out.println("Jam 1 Detik Berikutnya : " + j1.nextSecond());
        System.out.println("Jam 1 Detik Sebelumnya : " + j1.prevSecond());
        
        Jam_2511531010 jHasilPlus = j1.plus(j2);
        System.out.println("Hasil j1 + j2 : " + jHasilPlus);
    }

    private static Jam_2511531010 buatJamDariInput(Scanner sc) {
        int h, m, s;
        while (true) {
            System.out.print("Masukkan Jam (0-23)   : ");
            h = sc.nextInt();
            System.out.print("Masukkan Menit (0-59) : ");
            m = sc.nextInt();
            System.out.print("Masukkan Detik (0-59) : ");
            s = sc.nextInt();

            if (Jam_2511531010.isValid(h, m, s)) {
                return new Jam_2511531010(h, m, s);
            } else {
                System.out.println("Input tidak valid! Silakan coba lagi.");
            }
        }
    }
} 