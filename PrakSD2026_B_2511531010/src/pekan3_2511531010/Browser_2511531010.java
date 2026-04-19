package pekan3_2511531010;

import java.util.Scanner;
import java.util.Stack;

public class Browser_2511531010 {

    public static void main(String[] args) {
        Stack<Website_2511531010> history = new Stack<>();
        Scanner sc = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("=== Browser History NIM: 2511531010 ===");
            System.out.println("1. Kunjungi Website (Push)");
            System.out.println("2. Tombol Back (Pop)");
            System.out.println("3. Lihat Halaman Aktif (Peek)");
            System.out.println("4. Cek Status History");
            System.out.println("5. Keluar");
            System.out.print("Pilihan: ");
            pilihan = sc.nextInt();
            sc.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan Judul: ");
                    String judul = sc.nextLine();

                    System.out.print("Masukkan URL: ");
                    String url = sc.nextLine();

                    history.push(new Website_2511531010(judul, url));
                    System.out.println("Berhasil mengunjungi halaman!");
                    break;

                case 2:
                    if (history.isEmpty()) {
                        System.out.println("History kosong, tidak bisa kembali.");
                    } else {
                        Website_2511531010 removed = history.pop();
                        System.out.println("Kembali dari: " + removed.getJudul_1010());
                    }
                    break;

                case 3:
                    if (history.isEmpty()) {
                        System.out.println("Tidak ada halaman aktif.");
                    } else {
                        System.out.println("Halaman aktif:");
                        System.out.println(history.peek());
                    }
                    break;

                case 4:
                    if (history.isEmpty()) {
                        System.out.println("History kosong.");
                    } else {
                        System.out.println("Jumlah history: " + history.size());
                    }
                    break;

                case 5:
                    System.out.println("Terima kasih!");
                    break;

                default:
                    System.out.println("Pilihan tidak valid.");
            }

        } while (pilihan != 5);

        sc.close();
    }
}