package simpleprograms;

class Demo2 {

	Demo2() {
		System.out.println("Demo2 no arg");
	}
	
	Demo2(int a) {
		this();
		System.out.println("From Const " + a);
	}
	
	
}
public class Demo1 extends Demo2 {
	
//	Demo1() {
//		System.out.println("First const from demo");
//	}
	
	Demo1() {
		 super(2);
//		 this();
		 System.out.println("From demo");
	}
	
	public static void main(String[] args) {
		
		Demo1 d = new Demo1();
	}
}
