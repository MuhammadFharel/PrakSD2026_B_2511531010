package pekan4_2511531010;

public class AntrianLoket_2511531010 {
	
	String queue_1010[];
	int front_1010, rear_1010, max_1010;
	
	// constructor
	public AntrianLoket_2511531010(int max_1010) {
		this.max_1010 = max_1010;
		queue_1010 = new String[max_1010];
		front_1010 = 0;
		rear_1010 = -1;
	}
	
	boolean isEmpty_1010() {
		return (rear_1010 < front_1010);
	}
	
	boolean isFull_1010() {
		return (rear_1010 == max_1010 - 1);
	}
	
	void enqueue_1010(String data_1010) {
		if (isFull_1010()) {
			System.out.println("Antrian penuh!");
			return;
		}
		queue_1010[++rear_1010] = data_1010;
		System.out.println("Data berhasil ditambahkan ke antrian");
	}
	
	void dequeue_1010() {
		if (isEmpty_1010()) {
			System.out.println("Antrian kosong!");
			return;
		}
		System.out.println(queue_1010[front_1010] + " telah dilayani");
		front_1010++;
	}
	
	void display_1010() {
		if (isEmpty_1010()) {
			System.out.println("Antrian kosong!");
			return;
		}
		
		System.out.println("Isi antrian:");
		int no_1010 = 1;
		for (int i_1010 = front_1010; i_1010 <= rear_1010; i_1010++) {
			System.out.println(no_1010 + ". " + queue_1010[i_1010]);
			no_1010++;
		}
	}
	
	void reverse_1010() {
		if (isEmpty_1010()) {
			System.out.println("Antrian kosong!");
			return;
		}
		
		int start_1010 = front_1010;
		int end_1010 = rear_1010;
		
		while (start_1010 < end_1010) {
			String temp_1010 = queue_1010[start_1010];
			queue_1010[start_1010] = queue_1010[end_1010];
			queue_1010[end_1010] = temp_1010;
			
			start_1010++;
			end_1010--;
		}
		
		System.out.println("Antrian berhasil dibalik");
	}
}