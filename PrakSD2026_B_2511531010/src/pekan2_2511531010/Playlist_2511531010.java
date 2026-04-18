package pekan2_2511531010;

import java.util.ArrayList;
import java.util.Scanner;

public class Playlist_2511531010 {

    public static void main(String[] args) {
        ArrayList<Musik_2511531010> playlist = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("=== Playlist Musik NIM: 2511531010 ===");
            System.out.println("1. Tambah Lagu");
            System.out.println("2. Lihat Playlist");
            System.out.println("3. Hapus Lagu");
            System.out.println("4. Cek Jumlah Lagu");
            System.out.println("5. Keluar");
            System.out.print("Pilihan: ");
            pilihan = sc.nextInt();
            sc.nextLine(); 

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan Judul: ");
                    String judul = sc.nextLine();

                    System.out.print("Masukkan Penyanyi: ");
                    String penyanyi = sc.nextLine();

                    System.out.print("Masukkan Durasi (detik): ");
                    int durasi = sc.nextInt();

                    playlist.add(new Musik_2511531010(judul, penyanyi, durasi));
                    System.out.println("Data berhasil ditambahkan!");
                    break;

                case 2:
                    if (playlist.isEmpty()) {
                        System.out.println("Playlist kosong.");
                    } else {
                        System.out.println("Daftar Lagu:");
                        for (int i = 0; i < playlist.size(); i++) {
                            Musik_2511531010 m = playlist.get(i);
                            System.out.println((i + 1) + ". " 
                                + m.getJudul_1010() + " - " 
                                + m.getPenyanyi_1010() + " (" 
                                + m.getDurasi_1010() + " detik)");
                        }
                    }
                    break;

                case 3:
                    if (playlist.isEmpty()) {
                        System.out.println("Playlist kosong.");
                    } else {
                        System.out.print("Masukkan nomor lagu yang ingin dihapus: ");
                        int index = sc.nextInt();

                        if (index > 0 && index <= playlist.size()) {
                            playlist.remove(index - 1);
                            System.out.println("Lagu berhasil dihapus.");
                        } else {
                            System.out.println("Nomor tidak valid.");
                        }
                    }
                    break;

                case 4:
                    System.out.println("Jumlah lagu dalam playlist: " + playlist.size());
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