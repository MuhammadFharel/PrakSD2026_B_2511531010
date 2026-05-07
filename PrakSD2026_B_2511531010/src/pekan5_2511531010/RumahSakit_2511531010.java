package pekan5_2511531010;

import java.util.Scanner;

public class RumahSakit_2511531010 {

    static Pasien_2511531010 head_1010 = null;
    static int counter_1010 = 0;

    // INSERT (Daftar Pasien)
    static void insert_1010(String nama_1010, String penyakit_1010) {
        counter_1010++;
        Pasien_2511531010 newNode_1010 = new Pasien_2511531010(nama_1010, penyakit_1010, counter_1010);

        if (head_1010 == null) {
            head_1010 = newNode_1010;
        } else {
            Pasien_2511531010 temp_1010 = head_1010;
            while (temp_1010.next_1010 != null) {
                temp_1010 = temp_1010.next_1010;
            }
            temp_1010.next_1010 = newNode_1010;
        }

        System.out.println("Pasien berhasil didaftarkan! Nomor Antrian: " + counter_1010);
    }

    // DELETE HEAD (Panggil Pasien)
    static void deleteHead_1010() {
        if (head_1010 == null) {
            System.out.println("Antrian kosong!");
            return;
        }

        System.out.println("Memanggil pasien:");
        System.out.println(head_1010.namaPasien_1010 + " (" + head_1010.penyakit_1010 + ")");

        head_1010 = head_1010.next_1010;
    }

    // DISPLAY
    static void display_1010() {
        if (head_1010 == null) {
            System.out.println("Antrian kosong!");
            return;
        }

        Pasien_2511531010 temp_1010 = head_1010;
        while (temp_1010 != null) {
            System.out.println("No: " + temp_1010.nomorAntrian_1010 +
                    " | Nama: " + temp_1010.namaPasien_1010 +
                    " | Keluhan: " + temp_1010.penyakit_1010);
            temp_1010 = temp_1010.next_1010;
        }
    }

    // SEARCH (Case Insensitive)
    static void search_1010(String nama_1010) {
        Pasien_2511531010 temp_1010 = head_1010;
        boolean found_1010 = false;

        while (temp_1010 != null) {
            if (temp_1010.namaPasien_1010.equalsIgnoreCase(nama_1010)) {
                System.out.println("Pasien ditemukan!");
                System.out.println("No Antrian: " + temp_1010.nomorAntrian_1010);
                found_1010 = true;
                break;
            }
            temp_1010 = temp_1010.next_1010;
        }

        if (!found_1010) {
            System.out.println("Pasien tidak ditemukan!");
        }
    }

    // STATUS
    static void status_1010() {
        if (head_1010 == null) {
            System.out.println("Antrian kosong!");
            return;
        }

        int jumlah_1010 = 0;
        Pasien_2511531010 temp_1010 = head_1010;

        while (temp_1010 != null) {
            jumlah_1010++;
            temp_1010 = temp_1010.next_1010;
        }

        System.out.println("Jumlah pasien: " + jumlah_1010);
        System.out.println("Pasien terdepan: " + head_1010.namaPasien_1010);
    }

    // MAIN MENU
    public static void main(String[] args) {
        Scanner input_1010 = new Scanner(System.in);
        int pilihan_1010;

        do {
            System.out.println("=== Antrian Rumah Sakit NIM: 2511531010 ===");
            System.out.println("1. Daftarkan Pasien");
            System.out.println("2. Panggil Pasien");
            System.out.println("3. Tampilkan Antrian");
            System.out.println("4. Cari Pasien");
            System.out.println("5. Cek Status Antrian");
            System.out.println("6. Keluar");
            System.out.print("Pilihan: ");

            pilihan_1010 = input_1010.nextInt();
            input_1010.nextLine();

            switch (pilihan_1010) {
                case 1:
                    System.out.print("Masukkan Nama Pasien: ");
                    String nama_1010 = input_1010.nextLine();
                    System.out.print("Masukkan Keluhan: ");
                    String penyakit_1010 = input_1010.nextLine();
                    insert_1010(nama_1010, penyakit_1010);
                    break;

                case 2:
                    deleteHead_1010();
                    break;

                case 3:
                    display_1010();
                    break;

                case 4:
                    System.out.print("Cari nama: ");
                    String cari_1010 = input_1010.nextLine();
                    search_1010(cari_1010);
                    break;

                case 5:
                    status_1010();
                    break;

                case 6:
                    System.out.println("Keluar...");
                    break;

                default:
                    System.out.println("Pilihan tidak valid!");
            }

        } while (pilihan_1010 != 6);
    }
}