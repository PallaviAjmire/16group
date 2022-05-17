package javaLec;

public class Testclass {
	int a;
	double f;
	Testclass()
	{
		a=45;
		  f =56.87;
	}
    Testclass(int s)
    {
    	a=65;
    	f= .85;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Testclass tc = new Testclass();
      System.out.println(tc.a);
      System.out.println(tc.f);
     
      
      Testclass tc1 =new Testclass(3);
      System.out.println(tc1.a);
      System.out.println(tc1.f);
	}

}
