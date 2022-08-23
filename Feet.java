
public class Feet {

	private int feet;
	private int inches;
	
	public Feet(int feet, int inches) {
		this.feet = feet;
		this.inches = inches;
	}
	
	//Add f1+f2 Feet & Store in Current Feet
	public void add(Feet f1, Feet f2) {
		int totalFeet = f1.feet + f2.feet;
		int totalInches = f1.inches + f2.inches;
		int restOfFeet = totalInches %12;
		totalFeet = totalFeet + restOfFeet;
		totalInches = totalInches / 12;
		this.feet = totalFeet;
		this.inches = totalInches;
		
	}
	
	//Display a Length
	public void print() {
		System.out.println(this.feet + "' "+this.inches+ "\"");
	}
	
	public void print(String msg) {
		System.out.println(msg+": "+this.feet + "' "+this.inches+"\"");
	}
	
	public static void print(Feet f) {
		System.out.println(f.feet + "' "+f.inches+"\"");
	}
}
