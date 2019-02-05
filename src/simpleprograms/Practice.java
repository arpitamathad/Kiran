package simpleprograms;

class Demo {
	
	Demo() {
		System.out.println("from demo no arg");
	}
	
	Demo(int i) {
		this();
		System.out.println("from demo with arg");
	}
}

public class Practice extends Demo {
	
	public Practice() {
		this(5);
		System.out.println("from practice without arg");
	}
	
	Practice(int j) {
		super(5);
		System.out.println("from practice with arg");
	}

	public static void main(String[] args) {

		Practice p = new Practice();
		Demo d = new Demo(10);

	}

}

