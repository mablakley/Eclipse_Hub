
public class Excercise1 {
	
	static public Bobslife bobby;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		bobby = new Bobslife("home", 0, 4, 5);
		
		bobby.move("gym");
		bobby.nextTime();
		System.out.println(bobby.toString());
		
	}

	

}
