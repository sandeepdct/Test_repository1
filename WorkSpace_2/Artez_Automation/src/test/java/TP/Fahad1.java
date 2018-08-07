package TP;



public class Fahad1 {
	
	Fahad1(int a, float b){
		
		System.out.println("A is "+a+" B is "+b );
		System.out.println("Sum is "+(a+b));
	}
	
	Fahad1(int a, int b){
		
		System.out.println("A is "+a+" B is "+b );
		System.out.println("Sum is "+(a+b));
	}
	
	Fahad1(int a, float b, int c){
		
		System.out.println("A is "+a+" B is "+b+" C is "+c );
		System.out.println("Sum is "+(a+b+c));
	}
	
	//int a = 10;
	//float b = 20.5f;
	
	void m1 (int a, float b) {
		
		//System.out.println(this.a + this.b);
		System.out.println(a+b);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x = 1000;
		float y = 2000.5f;
		int z= 2000;
		
		Fahad1 f = new Fahad1(x, y, z);
		
		//f.m1(100, 200.5f);
		

	}

}
