package pack1;

public class Class1 
{
	   //properties
		int a=10, b=20, result;
		
		//behaviours
		public void add()
		{
			result = a+b;
			System.out.println("Add of A & B  is : " + result);
		}
		
		public void sub()
		{
			result =a-b;
			System.out.println("Sub of A & B is : " + result);
		}

	public static void main(String[] args) 
	{
		Class1 c1 = new Class1();
		c1.add();
		c1.sub();
	}

}
