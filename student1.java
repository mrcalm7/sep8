package java8;

import java.util.function.BiFunction;


interface my 
{
public void display();

}
abstract class Addd implements my
{
	static int add(int n1,int n2) 
	{
		return n1+n2;
	}
	
	
}

public class student1 {
	public void myMethod()
	{
		System.out.println("instance method");
		System.out.println("i have been referring");
		
	}
	public static void main(String [] args)
	{
		student1 obj=new student1();
		myinterface ref=obj::myMethod;
		
		
		ref.display();
		BiFunction<Integer,Integer,Integer>addition= Addd :: add;
		int sum=addition.apply(11, 5);
		System.out.println("addition "+ sum);
		}

}
