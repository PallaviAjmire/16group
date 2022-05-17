package javaLec;

public class Testclass2 {
   int a;
   String s;
   float b;
    Testclass2( int d)
    {
    	a=24;
    	s ="class";
    }
   Testclass2(String s ,int a){
	
   }
   public static void main(String[] args) {   
	Testclass2 fd = new Testclass2(23);
	System.out.println(fd.a);
	System.out.println(fd.b);
	
	Testclass2 fd1 = new Testclass2("velocity", 54);
	System.out.println(fd1.a);
	System.out.println(fd1.s);
}
}
