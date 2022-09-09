package java8;
interface myinterface {
public void display();

}
public class Xmen1{
	public void myMethod()
	{
		System.out.println("instance method");
		System.out.println("i have been referring");
		
	}
	public static void main(String [] args)
	{
		Xmen1 obj=new Xmen1();
		myinterface ref=obj::myMethod;
		
		
		ref.display();
	}
}