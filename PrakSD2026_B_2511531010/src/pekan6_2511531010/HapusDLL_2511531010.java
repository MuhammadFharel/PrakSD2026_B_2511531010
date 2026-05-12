package pekan6_2511531010;

public class HapusDLL_2511531010 {
	// fungsi menghapus node awal
    public static NodeDLL_2511531010 delHead_1010(NodeDLL_2511531010 head_1010) {
        if (head_1010 == null) {
            return null;
        }
        head_1010 = head_1010.next_1010;
        if (head_1010 != null) {
            head_1010.prev_1010 = null;
        }
        return head_1010;
    }
    // fungsi menghapus di akhir
    public static NodeDLL_2511531010 delLast_1010(NodeDLL_2511531010 head_1010) {
        if (head_1010 == null) {
            return null;
        }
        if (head_1010.next_1010 == null) {
            return null;
        }
        NodeDLL_2511531010 curr_1010 = head_1010;
        while (curr_1010.next_1010 != null) {
            curr_1010 = curr_1010.next_1010;
        }
        // update pointer previous node
        if (curr_1010.prev_1010 != null) {
            curr_1010.prev_1010.next_1010 = null;
        }
        return head_1010;
    }
    // fungsi menghapus node posisi tertentu
    public static NodeDLL_2511531010 delPos_1010(NodeDLL_2511531010 head_1010, int pos_1010) {
    	// jika DLL kosong
    	if (head_1010 == null) {
    		return head_1010;
    	}
    	NodeDLL_2511531010 curr_1010 = head_1010;
    	// telusuri sampai ke node yang akan dihapus
    	for (int i_1010 = 1; curr_1010 != null && i_1010 < pos_1010; i_1010++) {
    		curr_1010 = curr_1010.next_1010;
    	}
    	// jika posisi tidak ditemukan
    	if (curr_1010 == null) {
    		return head_1010;
    	}
    	// update pointer
    	if (curr_1010.prev_1010 != null) {
    		curr_1010.prev_1010.next_1010 = curr_1010.next_1010;
    	}
    	if (curr_1010.next_1010 != null) {
    		curr_1010.next_1010.prev_1010 = curr_1010.prev_1010;
    	}
    	// jika yang dihapus head
    	if (head_1010 == curr_1010) {
    		head_1010 = curr_1010.next_1010;
    	}
    	return head_1010;
    }
    // fungsi mencetak DLL
    public static void printList_1010 (NodeDLL_2511531010 head_1010) {
    	NodeDLL_2511531010 curr_1010 = head_1010;
    	while (curr_1010 != null) {
    		System.out.print(curr_1010.data_1010 + " <-> ");
    		curr_1010 = curr_1010.next_1010;
    	}
    	System.out.println();
    }
    public static void main(String[] args) {
        // buat sebuah DLL
        NodeDLL_2511531010 head_1010 = new NodeDLL_2511531010(1);
        head_1010.next_1010 = new NodeDLL_2511531010(2);
        head_1010.next_1010.prev_1010 = head_1010;
        head_1010.next_1010.next_1010 = new NodeDLL_2511531010(3);
        head_1010.next_1010.next_1010.prev_1010 = head_1010.next_1010;
        head_1010.next_1010.next_1010.next_1010 = new NodeDLL_2511531010(4);
        head_1010.next_1010.next_1010.next_1010.prev_1010 = head_1010.next_1010.next_1010;
        head_1010.next_1010.next_1010.next_1010.next_1010 = new NodeDLL_2511531010(5);
        head_1010.next_1010.next_1010.next_1010.next_1010.prev_1010 = head_1010.next_1010.next_1010.next_1010;

        System.out.print("DLL Awal: ");
        printList_1010(head_1010);

        System.out.print("Setelah head dihapus: ");
        head_1010 = delHead_1010(head_1010);
        printList_1010(head_1010);

        System.out.print("Setelah node terakhir dihapus: ");
        head_1010 = delLast_1010(head_1010);
        printList_1010(head_1010);

        System.out.print("menghapus node ke 2: ");
        head_1010 = delPos_1010(head_1010, 2);

        printList_1010(head_1010);
    }
}
