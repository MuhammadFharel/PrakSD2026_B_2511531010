package pekan6_2511531010;

public class PenelusuranDLL_2511531010 {
	//fungsi penelusuran maju
    static void forwardTraversal_1010(NodeDLL_2511531010 head_1010) {
        // memulai penelusuran dari head
        NodeDLL_2511531010 curr_1010 = head_1010;
        //lanjutkan sampai akhir
        while (curr_1010 != null) {
            //print data
            System.out.print(curr_1010.data_1010 + " <-> ");
            //pindah ke node berikutnya
            curr_1010 = curr_1010.next_1010;
        }
        //print spasi
        System.out.println();
    }
    // fungsi penelusuran mundur
    static void backwardTraversal_1010(NodeDLL_2511531010 tail_1010) {
        // mulai dari akhir
        NodeDLL_2511531010 curr_1010 = tail_1010;
        //lanjut sampai head
        while (curr_1010 != null) {
            //cetak data
            System.out.print(curr_1010.data_1010 + " <-> ");
            // pindah ke node sebelumnya
            curr_1010 = curr_1010.prev_1010;
        }
        // cetak spasi
        System.out.println();
    }
    public static void main(String[] args) {
    	// cetak DLL
    	NodeDLL_2511531010 head_1010 = new NodeDLL_2511531010(1);
    	NodeDLL_2511531010 second_1010 = new NodeDLL_2511531010(2);
    	NodeDLL_2511531010 third_1010 = new NodeDLL_2511531010(3);
    	
    	head_1010.next_1010 = second_1010;
    	second_1010.prev_1010 = head_1010;
    	second_1010.next_1010 = third_1010;
    	third_1010.prev_1010 = second_1010;
    	
    	System.out.println(" Penelusuran maju:");
    	forwardTraversal_1010 (head_1010);
    	
    	System.out.println(" Penelusuran mundur:");
    	backwardTraversal_1010 (third_1010);
    }
}
