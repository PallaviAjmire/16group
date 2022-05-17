package javaLec;

public class overrading {
   public void test() {
	   System.out.println("hello");
   }
  public void test1(int a, String c) {
	   System.out.println("Hello java class");
  }
   public static void test2(int b, int c) {
	   System.out.println("hii");
   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
  overrading obj = new overrading();
  obj.test();
  obj.test2(5, 4);
  obj.test1(4, "velocity");
  
	}

}
