package module7Retry;

public class mod7main {
	//and module 8
	private static double x;
	private static int n, m, p, q;
	private static double b, a, c; 
	
	public static void main(String[] args) {
		
		x = 3.2;
		
		n = 34;
		n /= 6;
		
		m = 64;
		m *= 3;
		
		a = 2;
		b = 16;
		c = 4;
		
		
		System.out.println(n);
		System.out.println(m);
		System.out.println(Math.PI);
		System.out.println(Math.E);
		
		//quadratic equation
		System.out.println( (-b + Math.sqrt(Math.pow(b, 2)-4*a*c) ) /(2*a) );
		System.out.println( (-b - Math.sqrt(Math.pow(b, 2)-4*a*c) ) /(2*a) );
		
	}

}
