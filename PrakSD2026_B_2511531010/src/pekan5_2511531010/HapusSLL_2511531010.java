package pekan5_2511531010;

public class HapusSLL_2511531010 {
    // Fungsi untuk menghapus head
    public static NodeSLL_2511531010 deleteHead_1010(NodeSLL_2511531010 head_1010) {
    	// jika SLL kosong
        if (head_1010 == null) {
            return null;
        }
        // Pindahkan head ke node berikutnya
        head_1010 = head_1010.next_1010;
        return head_1010;
    }
    // Fungsi menghapus node terakhir SLL
    public static NodeSLL_2511531010 removeLastNode_1010(NodeSLL_2511531010 head_1010) {
    	// jika list kosong, return null
        if (head_1010 == null) {
            return null;
        }
        // jika list satu node, hapus node dan return null
        if (head_1010.next_1010 == null) {
            return null;
        }
        // Temukan node kedua terakhir
        NodeSLL_2511531010 secondLast_1010 = head_1010;
        while (secondLast_1010.next_1010.next_1010 != null) {
            secondLast_1010 = secondLast_1010.next_1010;
        }
        // hapus node terakhir
        secondLast_1010.next_1010 = null;
        return head_1010;
    }
    // Fungsi menghapus node di posisi tertentu
    public static NodeSLL_2511531010 deleteNode_1010(NodeSLL_2511531010 head_1010, int position_1010) {
        NodeSLL_2511531010 temp_1010 = head_1010;
        NodeSLL_2511531010 prev_1010 = null;
        // jika linked list null
        if (temp_1010 == null) {
            return head_1010;
        }
        // Kasus 1: Menghapus head (posisi 1)
        if (position_1010 == 1) {
            head_1010 = temp_1010.next_1010;
            return head_1010;
        }
        // Kasus 2: menghapus node di tengah
        // Telusuri ke node yang akan dihapus
        for (int i_1010 = 1; temp_1010 != null && i_1010 < position_1010; i_1010++) {
            prev_1010 = temp_1010;
            temp_1010 = temp_1010.next_1010;
        }
        // Jika node ditemukan, hapus node
        if (temp_1010 != null) {
            prev_1010.next_1010 = temp_1010.next_1010;
        } else {
            System.out.println("Data pada posisi tersebut tidak ada");
        }
        return head_1010;
    }
    // Fungsi mencetak SLL
    public static void printList_1010(NodeSLL_2511531010 head_1010) {
        if (head_1010 == null) {
            System.out.println("List Kosong");
            return;
        }
        NodeSLL_2511531010 curr_1010 = head_1010;
        while (curr_1010 != null) {
            System.out.print(curr_1010.data_1010);
            if (curr_1010.next_1010 != null) {
                System.out.print(" --> ");
            }
            curr_1010 = curr_1010.next_1010;
        }
        System.out.println();
    }
    // Kelas main
    public static void main(String[] args) {
        // Buat SLL 1 -> 2 -> 3 -> 4 -> 5 -> 6 -> null
        NodeSLL_2511531010 head_1010 = new NodeSLL_2511531010(1);
        head_1010.next_1010 = new NodeSLL_2511531010(2);
        head_1010.next_1010.next_1010 = new NodeSLL_2511531010(3);
        head_1010.next_1010.next_1010.next_1010 = new NodeSLL_2511531010(4);
        head_1010.next_1010.next_1010.next_1010.next_1010 = new NodeSLL_2511531010(5);
        head_1010.next_1010.next_1010.next_1010.next_1010.next_1010 = new NodeSLL_2511531010(6);
        // cetak list awal
        System.out.println("List awal: ");
        printList_1010(head_1010);
        // Hapus head
        head_1010 = deleteHead_1010(head_1010);
        System.out.println("List setelah head dihapus: ");
        printList_1010(head_1010);
        // Hapus node terakhir
        head_1010 = removeLastNode_1010(head_1010);
        System.out.println("List setelah simpul terakhir dihapus: ");
        printList_1010(head_1010);
        // Hapus node at position 2
        int position_1010 = 2;
        head_1010 = deleteNode_1010(head_1010, position_1010);
        System.out.println("List setelah posisi " + position_1010 + " dihapus: ");
        printList_1010(head_1010);
    }
}