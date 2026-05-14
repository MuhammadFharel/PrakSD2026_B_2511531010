package pekan6_2511531010;

import java.util.Scanner;

public class Musik_2511531010 {

    Lagu_2511531010 head_1010, tail_1010;

    // 1. tambah lagu di akhir
    void tambahLagu_1010(String judul_1010, String penyanyi_1010) {
        Lagu_2511531010 baru_1010 = new Lagu_2511531010(judul_1010, penyanyi_1010);

        if (head_1010 == null) {
            head_1010 = tail_1010 = baru_1010;
        } else {
            tail_1010.next_1010 = baru_1010;
            baru_1010.prev_1010 = tail_1010;
            tail_1010 = baru_1010;
        }
        System.out.println("Lagu berhasil ditambahkan!");
    }
    // 2. hapus lagu awal
    void hapusLaguAwal_1010() {
        if (head_1010 == null) {
            System.out.println("Playlist kosong!");
        } else {
            System.out.println("Menghapus: " + head_1010.judul_1010);
            head_1010 = head_1010.next_1010;

            if (head_1010 != null) {
                head_1010.prev_1010 = null;
            } else {
                tail_1010 = null;
            }
        }
    }
    // 3. tampil maju
    void tampilMaju_1010() {
        if (head_1010 == null) {
            System.out.println("Playlist kosong!");
        } else {
            Lagu_2511531010 temp_1010 = head_1010;
            while (temp_1010 != null) {
                System.out.println(temp_1010.judul_1010 + " - " + temp_1010.penyanyi_1010);
                temp_1010 = temp_1010.next_1010;
            }
        }
    }
    // 4. tampil mundur
    void tampilMundur_1010() {
        if (tail_1010 == null) {
            System.out.println("Playlist kosong!");
        } else {
            Lagu_2511531010 temp_1010 = tail_1010;
            while (temp_1010 != null) {
                System.out.println(temp_1010.judul_1010 + " - " + temp_1010.penyanyi_1010);
                temp_1010 = temp_1010.prev_1010;
            }
        }
    }
    // 5. cari lagu
    void cariLagu_1010(String judul_1010) {
        if (head_1010 == null) {
            System.out.println("Playlist kosong!");
            return;
        }
        Lagu_2511531010 temp_1010 = head_1010;
        boolean ditemukan_1010 = false;

        while (temp_1010 != null) {
            if (temp_1010.judul_1010.equalsIgnoreCase(judul_1010)) {
                System.out.println("Lagu ditemukan:");
                System.out.println(temp_1010.judul_1010 + " - " + temp_1010.penyanyi_1010);
                ditemukan_1010 = true;
                break;
            }
            temp_1010 = temp_1010.next_1010;
        }
        if (!ditemukan_1010) {
            System.out.println("Lagu tidak ditemukan.");
        }
    }

    // MAIN MENU
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Musik_2511531010 musik_1010 = new Musik_2511531010();

        int pilihan_1010;

        do {
            System.out.println("=== Playlist Musik NIM: 2511531010 ===");
            System.out.println("1. Tambah Lagu");
            System.out.println("2. Hapus Lagu Pertama");
            System.out.println("3. Lihat Playlist (Maju)");
            System.out.println("4. Lihat Playlist (Mundur)");
            System.out.println("5. Cari Lagu");
            System.out.println("6. Keluar");
            System.out.print("Pilihan: ");
            pilihan_1010 = sc.nextInt();
            sc.nextLine();

            switch (pilihan_1010) {
                case 1:
                    System.out.print("Judul: ");
                    String judul_1010 = sc.nextLine();
                    System.out.print("Penyanyi: ");
                    String penyanyi_1010 = sc.nextLine();
                    musik_1010.tambahLagu_1010(judul_1010, penyanyi_1010);
                    break;

                case 2:
                    musik_1010.hapusLaguAwal_1010();
                    break;

                case 3:
                    musik_1010.tampilMaju_1010();
                    break;

                case 4:
                    musik_1010.tampilMundur_1010();
                    break;

                case 5:
                    System.out.print("Masukkan judul lagu: ");
                    String cari = sc.nextLine();
                    musik_1010.cariLagu_1010(cari);
                    break;

                case 6:
                    System.out.println("Program selesai.");
                    break;

                default:
                    System.out.println("Pilihan tidak valid!");
            }
        } while (pilihan_1010 != 6);
        sc.close();
    }
}