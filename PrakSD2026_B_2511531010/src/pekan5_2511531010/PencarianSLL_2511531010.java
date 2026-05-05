package pekan5_2511531010;

public class PencarianSLL_2511531010 {
    static boolean searchKey_1010(NodeSLL_2511531010 head_1010, int key_1010) {
        NodeSLL_2511531010 curr_1010 = head_1010;
        while (curr_1010 != null) {
            if (curr_1010.data_1010 == key_1010)
                return true;
            curr_1010 = curr_1010.next_1010;
        }
        return false;
    }

    public static void traversal_1010(NodeSLL_2511531010 head_1010) {
        // mulai dari head
        NodeSLL_2511531010 curr_1010 = head_1010;
        // telusuri sampai pointer null
        while (curr_1010 != null) {
            System.out.print(" " + curr_1010.data_1010);
            curr_1010 = curr_1010.next_1010;
        }
        
        System.out.println();
    }

    public static void main(String[] args) {
        NodeSLL_2511531010 head_1010 = new NodeSLL_2511531010(14);
        head_1010.next_1010 = new NodeSLL_2511531010(21);
        head_1010.next_1010.next_1010 = new NodeSLL_2511531010(13);
        head_1010.next_1010.next_1010.next_1010 = new NodeSLL_2511531010(30);
        head_1010.next_1010.next_1010.next_1010.next_1010 = new NodeSLL_2511531010(10);

        System.out.print("Penelusuran SLL : ");
        traversal_1010(head_1010);

        // data yang akan dicari
        int key_1010 = 30;
        System.out.print("cari data " + key_1010 + " = ");
        if (searchKey_1010(head_1010, key_1010))
            System.out.println("ketemu");
        else
            System.out.println("tidak ada");
    }
}