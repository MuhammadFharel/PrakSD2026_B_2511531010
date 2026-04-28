package pekan4_2511531010;

public class QueueArrayDriver_2511531010 {

	public static void main(String[] args) {
		QueueArray_2511531010 queue_1010 = new QueueArray_2511531010(1000);
		queue_1010.enqueue_1010(10);
		queue_1010.enqueue_1010(20);
		queue_1010.enqueue_1010(30);
		queue_1010.enqueue_1010(40);
		System.out.println("Item di depan " + queue_1010.front_1010());
		System.out.println("Item paling belakang " + queue_1010.rear_1010());
		System.out.println("Tampilan queue");
		queue_1010.display_1010();
		System.out.println();
		System.out.println(queue_1010.dequeue_1010() + " dihapus dari queue");
		System.out.println("Item di depan: " + queue_1010.front_1010());
		System.out.println("Item di belakang: " + queue_1010.rear_1010());
		System.out.println("Tampilan queue setelah satu data dihapus");
		queue_1010.display_1010();
	}
}