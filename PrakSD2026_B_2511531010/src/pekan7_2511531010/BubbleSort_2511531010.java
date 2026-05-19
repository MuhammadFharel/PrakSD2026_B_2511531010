package pekan7_2511531010;

public class BubbleSort_2511531010 {
	public static void bubbleSort_2511531010(int[] arr_1010) {
        int n_1010 = arr_1010.length;
        for (int i_1010 = 0; i_1010 < n_1010; i_1010++) {
            for (int j_1010 = 0; j_1010 < n_1010 - i_1010 - 1; j_1010++) {
                if (arr_1010[j_1010] > arr_1010[j_1010 + 1]) {
                    int temp_1010 = arr_1010[j_1010];
                    arr_1010[j_1010] = arr_1010[j_1010 + 1];
                    arr_1010[j_1010 + 1] = temp_1010;
                    // System.out.println("data:"+arr_1010[j_1010]+" "+arr_1010[j_1010+1]);
                }
            }
        }
    }

    public static void main(String[] args_1010) {
        int arr_1010[] = { 23, 78, 45, 8, 32, 56, 1 };
        int n_1010 = arr_1010.length;
        System.out.print("array yang belum terurut:");
        for (int i_1010 = 0; i_1010 < n_1010; i_1010++) {
            System.out.print(arr_1010[i_1010] + " ");
        }
        System.out.println("");
        bubbleSort_2511531010(arr_1010);
        System.out.print("array yang terurut menggunakan BubleSort:");
        for (int i_1010 = 0; i_1010 < n_1010; i_1010++) {
            System.out.print(arr_1010[i_1010] + " ");
        }
        System.out.println("");
    }
}