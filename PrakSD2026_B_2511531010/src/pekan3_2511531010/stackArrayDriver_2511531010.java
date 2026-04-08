package pekan3_2511531010;

public class stackArrayDriver_2511531010 {

	public static void main(String[] args) {
		stackArray_2511531010 s= new stackArray_2511531010();
		s.push(10);
		s.push(20);
		s.push(30);
		System.out.println(s.pop() + " dikeluarkan dari stack");
		System.out.println("Elemen teratas adalah :" +s.peek());
		System.out.println("Element pada stak :");
		s.print();

	}
}