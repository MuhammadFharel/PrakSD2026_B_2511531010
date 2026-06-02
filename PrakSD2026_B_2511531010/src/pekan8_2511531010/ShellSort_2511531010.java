package pekan8_2511531010;

public class ShellSort_2511531010 {
	public static void shellSort(int[] A) {
		int n_1010 = A.length;
		int gap_1010 = n_1010 / 2;
		while (gap_1010 > 0) {
			for (int i_1010 = gap_1010; i_1010 < n_1010; i_1010++) {
				int temp_1010 = A[i_1010];
				int j_1010 = i_1010;
				while (j_1010 >= gap_1010 && A[j_1010 - gap_1010] > temp_1010) {
					A[j_1010] = A[j_1010 - gap_1010];
					j_1010 = j_1010 - gap_1010;
					}
				
				A[j_1010] = temp_1010;
				}
			gap_1010 = gap_1010 / 2;
			}
		}

	public static void main(String[] args) {
		int[] data_1010 = {3, 10, 4, 6, 8, 9, 7, 2, 1, 5};
		
		System.out.print("Sebelum: ");
		printArray(data_1010);
		
		shellSort(data_1010);
		
		System.out.print("Sesudah (Shell Sort): ");
		printArray(data_1010);
		}
	
	public static void printArray(int[] arr) {
		for (int i_1010 : arr) System.out.print(i_1010 + " ");
		System.out.println();
		}
}