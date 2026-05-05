package pekan5_2511531010;

public class TambahSLL_2511531010 {
	
	public static NodeSLL_2511531010 insertAtFront(NodeSLL_2511531010 head_1010, int value_1010) {
		NodeSLL_2511531010 new_node_1010 = new NodeSLL_2511531010(value_1010);
		new_node_1010.next_1010 = head_1010;
		return new_node_1010;
	}

	public static NodeSLL_2511531010 insertAtEnd(NodeSLL_2511531010 head_1010, int value_1010) {
		NodeSLL_2511531010 newNode_1010 = new NodeSLL_2511531010(value_1010);
		if (head_1010 == null) {
			return newNode_1010;
		}
		NodeSLL_2511531010 last_1010 = head_1010;
		while (last_1010.next_1010 != null) {
			last_1010 = last_1010.next_1010;
		}
		last_1010.next_1010 = newNode_1010;
		return head_1010;
	}

	static NodeSLL_2511531010 GetNode_1010 (int data_1010) {
		return new NodeSLL_2511531010(data_1010);
	}
	
	static NodeSLL_2511531010 insertPos_1010(NodeSLL_2511531010 headNode_1010, int position_1010, int value_1010) {
		NodeSLL_2511531010 head_1010 = headNode_1010;
		if (position_1010 < 1)
			System.out.print("Invalid position");
		if (position_1010 == 1) {
			NodeSLL_2511531010 new_node_1010 = new NodeSLL_2511531010(value_1010);
			new_node_1010.next_1010 = head_1010;
			return new_node_1010;
		} else {
			while (position_1010-- != 0) {
				if (position_1010 == 1) {
					NodeSLL_2511531010 newNode_1010 = GetNode_1010(value_1010);
					newNode_1010.next_1010 = headNode_1010.next_1010;
					headNode_1010.next_1010 = newNode_1010;
					break;
				}
				headNode_1010 = headNode_1010.next_1010;
			}
		}
		if (position_1010 != 1)
			System.out.print("Posisi di luar jangkauan");
		return head_1010;
	}

	public static void printList_1010(NodeSLL_2511531010 head_1010) {
		NodeSLL_2511531010 curr_1010 = head_1010;
		while (curr_1010.next_1010 != null) {
			System.out.print(curr_1010.data_1010 + " --> ");
			curr_1010 = curr_1010.next_1010;
		}
		if (curr_1010.next_1010 == null) {
			System.out.print(curr_1010.data_1010);
		}
		System.out.println();
	}

	public static void main(String[] args) {
		NodeSLL_2511531010 head_1010 = new NodeSLL_2511531010(2);
		head_1010.next_1010 = new NodeSLL_2511531010(3);
		head_1010.next_1010.next_1010 = new NodeSLL_2511531010(5);
		head_1010.next_1010.next_1010.next_1010 = new NodeSLL_2511531010(6);
		
		System.out.print("Senarai berantai awal: ");
		printList_1010(head_1010);

		System.out.print("tambah 1 simpul di depan: ");
		int data_1010 = 1;
		head_1010 = insertAtFront(head_1010, data_1010);
		printList_1010(head_1010);

		System.out.print("tambah 1 simpul di belakang: ");
		int data2_1010 = 7;
		head_1010 = insertAtEnd(head_1010, data2_1010);
		printList_1010(head_1010);
		
		System.out.print("Tambah 1 simpul data ke 4 : ");
		int data3_1010 = 4;
		int pos_1010 = 4;
		head_1010 = insertPos_1010(head_1010, pos_1010, data3_1010);
		printList_1010(head_1010);
	}
}