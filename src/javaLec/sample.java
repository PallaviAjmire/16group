package javaLec;

public class sample {
	 int a=20;
	int b= 30;
	String name = "velocity";

    public void test(int a, int b) {
	 int c= a+b;
		 System.out.println(c);
	 }
	public static void main(String[] args) {
		sample obj = new sample();
		System.out.println(obj.a);
		System.out.println(obj.name);
	//	obj.a=21;
		obj.b=32;
		System.out.println(obj.b);
		obj.test(20, 30);
		}

	
}
