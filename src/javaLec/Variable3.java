package javaLec;

public class Variable3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   int a = +1;
   System.out.println(a);//1
   System.out.println(a--);//1
   System.out.println(a);//0
   System.out.println(a++);//0
   System.out.println(a);//1
   System.out.println(--a);//0
   System.out.println(a);//0
   System.out.println(++a);//1
   
   boolean c = a<0;
   System.out.println(c);//false
   boolean d = a>0;
   System.out.println(d);//true
   boolean s = a<=0;
   System.out.println(s);//false
   boolean z = a>= 0;
   System.out.println(z);//true
   
	}

}