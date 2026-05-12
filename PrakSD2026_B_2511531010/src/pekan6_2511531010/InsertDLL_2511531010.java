package pekan6_2511531010;

public class InsertDLL_2511531010 {
	// menambahkan node di awal DLL
    static NodeDLL_2511531010 insertBegin(NodeDLL_2511531010 head_1010, int data_1010) {
        // buat node baru
        NodeDLL_2511531010 new_node_1010 = new NodeDLL_2511531010(data_1010);
        // jadikan pointer nextnya head
        new_node_1010.next_1010 = head_1010;
        // jadikan pointer prev head ke new_node
        if (head_1010 != null) {
            head_1010.prev_1010 = new_node_1010;
        }
        return new_node_1010;
    }
    // fungsi menambahkan node di akhir
    public static NodeDLL_2511531010 insertEnd(NodeDLL_2511531010 head_1010, int newData_1010) {
        // buat node baru
        NodeDLL_2511531010 newNode_1010 = new NodeDLL_2511531010(newData_1010);
        // jika dll null jadikan head
        if (head_1010 == null) {
            head_1010 = newNode_1010;
        }
        else {
            NodeDLL_2511531010 curr_1010 = head_1010;
            while (curr_1010.next_1010 != null) {
                curr_1010 = curr_1010.next_1010;
            }
            curr_1010.next_1010 = newNode_1010;
            newNode_1010.prev_1010 = curr_1010;
        }
        return head_1010;
    }
    // fungsi menambahkan node di posisi tertentu
    public static NodeDLL_2511531010 insertAtPosition(NodeDLL_2511531010 head_1010, int pos_1010, int new_data_1010) {
        // buat node baru
        NodeDLL_2511531010 new_node_1010 = new NodeDLL_2511531010(new_data_1010);
        if (pos_1010 == 1) {
            new_node_1010.next_1010 = head_1010;
            if (head_1010 != null) {
                head_1010.prev_1010 = new_node_1010;
            }
            head_1010 = new_node_1010;
            return head_1010;
        }
        NodeDLL_2511531010 curr_1010 = head_1010;
        for (int i_1010 = 1; i_1010 < pos_1010 - 1 && curr_1010 != null; ++i_1010) {
            curr_1010 = curr_1010.next_1010;
        }
        if (curr_1010 == null) {
            System.out.println("Posisi tidak ada");
            return head_1010;
        }
        new_node_1010.prev_1010 = curr_1010;
        new_node_1010.next_1010 = curr_1010.next_1010;
        curr_1010.next_1010 = new_node_1010;

        if (new_node_1010.next_1010 != null) {
            new_node_1010.next_1010.prev_1010 = new_node_1010;
        }

        return head_1010;
    }
    public static void printList(NodeDLL_2511531010 head_1010) {
        NodeDLL_2511531010 curr_1010 = head_1010;
        while (curr_1010 != null) {
            System.out.print(curr_1010.data_1010 + " <-> ");
            curr_1010 = curr_1010.next_1010;
        }
        System.out.println();
    }
    public static void main(String[] args) {
    	// membuat dll 2 <-> 3 <-> 5
        NodeDLL_2511531010 head_1010 = new NodeDLL_2511531010(2);
        head_1010.next_1010 = new NodeDLL_2511531010(3);
        head_1010.next_1010.prev_1010 = head_1010;
        head_1010.next_1010.next_1010 = new NodeDLL_2511531010(5);
        head_1010.next_1010.next_1010.prev_1010 = head_1010.next_1010;
        // cetak DLL awal
        System.out.print("DLL Awal: ");
        printList(head_1010);
        // tambah 1 di awal
        head_1010 = insertBegin(head_1010, 1);
        System.out.print("simpul 1 ditambah di awal: ");
        printList(head_1010);
        // tambah 6 di akhir
        System.out.print("simpul 6 ditambah di akhir: ");
        int data_1010 = 6;
        head_1010 = insertEnd(head_1010, data_1010);
        printList(head_1010);

        // tambah node 4 di posisi 4
        System.out.print("tambah node 4 di posisi 4: ");
        int data2_1010 = 4;
        int pos_1010 = 4;
        head_1010 = insertAtPosition(head_1010, pos_1010, data2_1010);
        printList(head_1010);
    }
}