package javaLec;

public class over extends overrading {
 public void test() {
	 System.out.println(" java");
 }
 public static  void test2(int b, int c) {	
	System.out.println(b+c);
	System.out.println(b-c);
 }
 public void test1(int b,String c) {
	 System.out.println("method");
 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
  over obj = new over();
  obj.test();
  obj.test2(5, 4);
  obj.test1(4, "katraj");
  
	}

}
