package pekan8_2511531010;

public class MergeSort_2511531010 {
	void merge(int arr_1010[], int l_1010, int m_1010, int r) {
		//Find sizes of two subarrays to be merged
		int n1_1010 = m_1010 - l_1010 + 1;
		int n2_1010 = r - m_1010;
		/* Create temp arrays */
		int L_1010[] = new int[n1_1010];
		int R_1010[] = new int[n2_1010];
		/* Copy data to temp arrays */
		for (int i_1010 = 0; i_1010 < n1_1010; ++i_1010)
			L_1010[i_1010] = arr_1010[l_1010 + i_1010];
		for (int j_1010 = 0; j_1010 < n2_1010; ++j_1010)
			R_1010[j_1010] = arr_1010[m_1010 + 1 + j_1010];
		int i_1010 = 0, j_1010 = 0;
		// Initial index of merged subarray array
		int k_1010 = l_1010;
		while (i_1010 < n1_1010 && j_1010 < n2_1010) {
			if (L_1010[i_1010] <= R_1010[j_1010]) {
				arr_1010[k_1010] = L_1010[i_1010];
				i_1010++;
				} else {
					arr_1010[k_1010] = R_1010[j_1010];
					j_1010++;
					}
			k_1010++;
			}
		/* Copy remaining elements of L[] if any */
		while (i_1010 < n1_1010) {
			arr_1010[k_1010] = L_1010[i_1010];
			i_1010++;
			k_1010++;
			}
		/* Copy remaining elements of R[] if any */
		while (j_1010 < n2_1010) {
			arr_1010[k_1010] = R_1010[j_1010];
			j_1010++;
			k_1010++;
			}
		}
	void sort(int arr_1010[], int l_1010, int r_1010) {
		if (l_1010 < r_1010) {
			// Find the middle point
			int m_1010 = (l_1010 + r_1010) /2;
			// Sort first and second halves
			sort(arr_1010, l_1010, m_1010);
			sort(arr_1010, m_1010 + 1, r_1010);
			// Merge the sorted halves
			merge(arr_1010, l_1010, m_1010, r_1010);
		}
	}
	/* A utility function to point array of size n */
	static void printArray(int arr_1010[]) {
		int n_1010 = arr_1010.length;
        for (int i_1010 = 0; i_1010 < n_1010; ++i_1010)
            System.out.print(arr_1010[i_1010] + " ");
        System.out.println();
    }

    public static void main(String args[]) {
        int arr_1010[] = { 12, 11, 13, 5, 6, 7 };
        System.out.println("Sebelum terurut");
        printArray(arr_1010);
        
        MergeSort_2511531010 ob_1010 = new MergeSort_2511531010();
        ob_1010.sort(arr_1010, 0, arr_1010.length - 1);
        
        System.out.println("\nSesudah Terurut menggunakan merge Sor");
        printArray(arr_1010);
	}
}