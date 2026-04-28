package pekan4_2511531010;

public class QueueArray_2511531010 {
	int front_1010, rear_1010, size_1010;
	int capacity_1010;
	int array_1010[];
	
	public QueueArray_2511531010(int capacity_1010) {
		this.capacity_1010 = capacity_1010;
		front_1010 = this.size_1010= 0;
		rear_1010 = capacity_1010 - 1;
		array_1010 = new int[this.capacity_1010];
	}
	
	boolean isFull_1010(QueueArray_2511531010 queue) {
		return (queue.size_1010 == queue.capacity_1010);
	}
	
	boolean isEmpty_1010(QueueArray_2511531010 queue) {
		return (queue.size_1010 == 0);
	}
	
	void enqueue_1010(int item_1010) {
		if (isFull_1010(this))
			return;
		this.rear_1010 =(this.rear_1010 + 1) % this.capacity_1010;
		this.array_1010[this.rear_1010] = item_1010;
		this.size_1010=this.size_1010 + 1;
		System.out.println(item_1010 + " enqueue to queue");
	}
	
	int dequeue_1010() {
		if (isEmpty_1010(this))
			return Integer.MIN_VALUE;
		int item_1010 = this.array_1010[this.front_1010];
		this.front_1010 = (this.front_1010 + 1) % this.capacity_1010;
		this.size_1010 = this.size_1010 - 1;
		return item_1010;
	}
	int front_1010() {
		if (isEmpty_1010(this))
			return Integer.MIN_VALUE;
		
		return this.array_1010 [this.front_1010];
	}
	int rear_1010() {
		if (isEmpty_1010(this))
			return Integer.MIN_VALUE;
		
		return this.array_1010 [this.rear_1010];
	}
	// mencetak elemen antrian
	void display_1010() {
		int i;
		if (front_1010 == rear_1010) {
			System.out.printf("\nAntrian Kosong\n");
			return;
		}
		//kunjungi dari belakang dan cetak
		for (i = front_1010; i < rear_1010; i++) {
			System.out.printf(" %d <-- ", array_1010[i]);
		}
		return;
	}
}