package javaLec;

public class child extends sample{
 int a=25;
 String s= "katraj";
 
 public void test(int a, int b) {
	 int c = a+b;
	System.out.println(c);
 }
 public void test1() {
	 System.out.println(a);
	 System.out.println(super.a);
	 System.out.println(super.name);
	 System.out.println(s);
 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 child obj = new child();
 System.out.println(obj.a);
 System.out.println(obj.s);
// obj.test(20, 30);
 obj.test1();
 
	}

}
