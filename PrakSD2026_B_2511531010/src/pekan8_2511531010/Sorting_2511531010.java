package pekan8_2511531010;

import java.util.Scanner;

public class Sorting_2511531010 {

    Lagu_2511531010[] dataLagu_1010 = new Lagu_2511531010[20];
    int jumlah_1010 = 0;

    void inputData_1010() {
        dataLagu_1010[jumlah_1010++] = new Lagu_2511531010("Me and my", "Blackpink", 210);
        dataLagu_1010[jumlah_1010++] = new Lagu_2511531010("Lifestyle", "Lisa", 200);
        dataLagu_1010[jumlah_1010++] = new Lagu_2511531010("Damn Right", "Jennie", 190);
        dataLagu_1010[jumlah_1010++] = new Lagu_2511531010("Earthquake", "Jisoo", 180);
        dataLagu_1010[jumlah_1010++] = new Lagu_2511531010("Dance all night", "Rose", 220);
        dataLagu_1010[jumlah_1010++] = new Lagu_2511531010("Gameboy", "Rose", 230);
        dataLagu_1010[jumlah_1010++] = new Lagu_2511531010("ExtraL", "Jennie", 240);
    }

    void tampilData_1010() {
        for (int i_1010 = 0; i_1010 < jumlah_1010; i_1010++) {
            System.out.println((i_1010 + 1) + ". "
                    + dataLagu_1010[i_1010].judul_1010 + " - "
                    + dataLagu_1010[i_1010].durasi_1010 + " detik");
        }
    }
    
    //shell sort
    void shellSort_1010() {
        for (int gap_1010 = jumlah_1010 / 2; gap_1010 > 0; gap_1010 /= 2) {
            for (int i_1010 = gap_1010; i_1010 < jumlah_1010; i_1010++) {

                Lagu_2511531010 temp_1010 = dataLagu_1010[i_1010];
                int j_1010 = i_1010;

                while (j_1010 >= gap_1010 &&
                       dataLagu_1010[j_1010 - gap_1010].judul_1010
                       .compareToIgnoreCase(temp_1010.judul_1010) > 0) {

                    dataLagu_1010[j_1010] = dataLagu_1010[j_1010 - gap_1010];
                    j_1010 -= gap_1010;
                }

                dataLagu_1010[j_1010] = temp_1010;
            }
        }
    }
    
    //quick sort
    void quickSort_1010(int low_1010, int high_1010) {
        if (low_1010 < high_1010) {
            int pi_1010 = partition_1010(low_1010, high_1010);

            quickSort_1010(low_1010, pi_1010 - 1);
            quickSort_1010(pi_1010 + 1, high_1010);
        }
    }

    int partition_1010(int low_1010, int high_1010) {

        int pivot_1010 = dataLagu_1010[high_1010].durasi_1010;
        int i_1010 = low_1010 - 1;

        for (int j_1010 = low_1010; j_1010 < high_1010; j_1010++) {

            if (dataLagu_1010[j_1010].durasi_1010 < pivot_1010) {

                i_1010++;

                Lagu_2511531010 temp_1010 = dataLagu_1010[i_1010];
                dataLagu_1010[i_1010] = dataLagu_1010[j_1010];
                dataLagu_1010[j_1010] = temp_1010;
            }
        }

        Lagu_2511531010 temp_1010 = dataLagu_1010[i_1010 + 1];
        dataLagu_1010[i_1010 + 1] = dataLagu_1010[high_1010];
        dataLagu_1010[high_1010] = temp_1010;

        return i_1010 + 1;
    }
    
    //merge sort
    void mergeSort_1010(int left_1010, int right_1010) {
        if (left_1010 < right_1010) {

            int mid_1010 = (left_1010 + right_1010) / 2;

            mergeSort_1010(left_1010, mid_1010);
            mergeSort_1010(mid_1010 + 1, right_1010);

            merge_1010(left_1010, mid_1010, right_1010);
        }
    }

    void merge_1010(int left_1010, int mid_1010, int right_1010) {

        int n1_1010 = mid_1010 - left_1010 + 1;
        int n2_1010 = right_1010 - mid_1010;

        Lagu_2511531010[] L_1010 = new Lagu_2511531010[n1_1010];
        Lagu_2511531010[] R_1010 = new Lagu_2511531010[n2_1010];

        for (int i_1010 = 0; i_1010 < n1_1010; i_1010++)
            L_1010[i_1010] = dataLagu_1010[left_1010 + i_1010];

        for (int j_1010 = 0; j_1010 < n2_1010; j_1010++)
            R_1010[j_1010] = dataLagu_1010[mid_1010 + 1 + j_1010];

        int i_1010 = 0, j_1010 = 0, k_1010 = left_1010;

        while (i_1010 < n1_1010 && j_1010 < n2_1010) {

            if (L_1010[i_1010].judul_1010.compareToIgnoreCase(R_1010[j_1010].judul_1010) <= 0)
                dataLagu_1010[k_1010++] = L_1010[i_1010++];
            else
                dataLagu_1010[k_1010++] = R_1010[j_1010++];
        }

        while (i_1010 < n1_1010)
            dataLagu_1010[k_1010++] = L_1010[i_1010++];

        while (j_1010 < n2_1010)
            dataLagu_1010[k_1010++] = R_1010[j_1010++];
    }
    
    public static void main(String[] args_1010) {

        Scanner input_1010 = new Scanner(System.in);
        Sorting_2511531010 sorting_1010 = new Sorting_2511531010();

        sorting_1010.inputData_1010();

        System.out.println("=== Sorting Playlist NIM: 2511531010 ===");
        System.out.println("1. Shell Sort");
        System.out.println("2. Quick Sort");
        System.out.println("3. Merge Sort");
        System.out.print("Pilih Algoritma: ");

        int pilihan_1010 = input_1010.nextInt();

        System.out.println("\nData Sebelum Sorting:");
        sorting_1010.tampilData_1010();

        switch (pilihan_1010) {

            case 1:
                sorting_1010.shellSort_1010();
                System.out.println("\nData Setelah Shell Sort (Judul A-Z):");
                break;

            case 2:
                sorting_1010.quickSort_1010(0, sorting_1010.jumlah_1010 - 1);
                System.out.println("\nData Setelah Quick Sort (Durasi Asc):");
                break;

            case 3:
                sorting_1010.mergeSort_1010(0, sorting_1010.jumlah_1010 - 1);
                System.out.println("\nData Setelah Merge Sort (Judul A-Z):");
                break;

            default:
                System.out.println("Pilihan tidak valid!");
                return;
        }
        sorting_1010.tampilData_1010();
    }
}