package pekan7_2511531010;

public class InsertionSort_2511531010 {
	 public static void insertionSort_2511531010(int[] arr_1010) {
		 int n_1010 = arr_1010.length;
	        for (int i_1010 = 1; i_1010 < n_1010; i_1010++) {
	            int key_1010 = arr_1010[i_1010];
	            int j_1010 = i_1010 - 1;
	            while (j_1010 >= 0 && arr_1010[j_1010] > key_1010) {
	                arr_1010[j_1010 + 1] = arr_1010[j_1010];
	                j_1010--;
	            }
	            arr_1010[j_1010 + 1] = key_1010;
	        }
	    }
	 
	 public static void main(String[] args) {
		 int arr_1010[] = { 23, 78, 45, 8, 32, 56, 1 };
	     int n_1010 = arr_1010.length;
	     System.out.printf("array yang belum terurut:\n");
	     for (int i_1010 = 0; i_1010 < n_1010; i_1010++)
	           System.out.print(arr_1010[i_1010] + " ");
	     System.out.println("");
	     insertionSort_2511531010(arr_1010);
	     System.out.printf("array yang terurut:\n");
	     for (int i_1010 = 0; i_1010 < n_1010; i_1010++)
	           System.out.print(arr_1010[i_1010] + " ");
	     System.out.println("");
	 }
}