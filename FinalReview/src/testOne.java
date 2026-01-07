
public class testOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub\

		// continue
		// break

		for (int i = 0; i < 10; i++) {
			for(int j = 0; j < 3; j++) {
				if (i != j) {
					continue; //not execute the rest of enclosing block
				}
				System.out.println(i);
			}
			
		}

	}

}

//break means to break out of loop
//continue means to skip rest of code and redo