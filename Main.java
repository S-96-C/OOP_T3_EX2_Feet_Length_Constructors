public class Main {

	public static void main(String[] args) {
		Feet.print(new Feet(3,4));
		Feet ob1 = new Feet(5, 6);
		Feet ob2 = new Feet(6, 7);
		Feet ob3 = new Feet(0, 0);
		ob3.add(ob1, ob2);
		ob3.print();
		ob3.print("Length");
		
		//ob.print();
	}

}
