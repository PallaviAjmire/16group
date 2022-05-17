package javaLec;

public class grandchild extends result {
	 int z =25;
	 char v= 'm';
	 public void multipal(int a, int b) {
		 int s= a*b;
		 System.out.println(s);
	 }
	 public static void main(String[] args) {
		grandchild obj = new grandchild();
		obj.multipal(20, 30);
		System.out.println(obj.z);
		System.out.println(obj.v);
		System.out.println(obj.m);
		System.out.println(obj.a);
	}
  }

