package pekan8_2511531010;

public class QuickSort_2511531010 {
	static void swap(int[] arr_1010, int i_1010, int j_1010) {
		int temp_1010 = arr_1010[i_1010];
		arr_1010[i_1010] = arr_1010[j_1010];
		arr_1010[j_1010] = temp_1010;
	}
	// Metode tambahan untuk mengatur pivot menggunakan Median-of-Three
	static void medianOfThree (int[] arr_1010, int low_1010, int high_1010) {
		int mid_1010 = low_1010 + (high_1010 - low_1010) / 2;
		
		//Urutkan elemen low, mid, dan high
		if (arr_1010[low_1010] > arr_1010[mid_1010]) {
			swap(arr_1010, low_1010, mid_1010);
		}
		if (arr_1010[low_1010] > arr_1010[high_1010]) {
			swap(arr_1010, low_1010, high_1010);
		}
		if (arr_1010[mid_1010] > arr_1010[high_1010]) {
			swap(arr_1010, mid_1010, high_1010);
		}
		swap(arr_1010, mid_1010, high_1010);
	}
	static int partition(int[] arr_1010, int low_1010, int high_1010) {
		// Panggil fungsi medianOfThree sebelum menentukan pivot
		medianOfThree(arr_1010, low_1010, high_1010);
		
		int pivot_1010 = arr_1010[high_1010]; // Sekarang arr[high] sudah berisi nilai median
		int i_1010 = (low_1010 - 1);
		
		for (int j_1010 = low_1010; j_1010 <= high_1010 - 1; j_1010++) {
			// Jika elemen saat ini lebih kecil dari atau sama dengan pivot
			if (arr_1010[j_1010] <= pivot_1010) {
				// Increment indeks elemen yang lebih kecil
				i_1010++;
				swap(arr_1010, i_1010, j_1010);
				}
			}
		swap(arr_1010, i_1010 + 1, high_1010);
		return (i_1010 + 1);
		}
	static void quickSort(int[] arr_1010, int low_1010, int high_1010) {
		if (low_1010 < high_1010) {
			int pi_1010 = partition(arr_1010, low_1010, high_1010);
			quickSort(arr_1010, low_1010, pi_1010 - 1);
			quickSort(arr_1010, pi_1010 + 1, high_1010);
			}
		}
	
	public static void printArray(int[] arr_1010) {
		for (int i_1010 = 0; i_1010 < arr_1010.length; i_1010++) {
			System.out.print(arr_1010[i_1010] + " ");
			}
		System.out.println();
		}
	
	public static void main(String[] args) {
		int[] arr_1010 = { 10, 7, 8, 9, 1, 5 };
		int N_1010 = arr_1010.length;
		System.out.print("Data sebelum diurutkan: ");
		printArray(arr_1010);
		
		quickSort(arr_1010, 0, N_1010 - 1);
		
		System.out.print("Data Terurut quicksort: ");
		printArray(arr_1010);
	}
}
