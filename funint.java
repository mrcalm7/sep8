package java8;

import java.util.function.IntBinaryOperator;

interface myfun
{
	public int addmet(int a, int b);
	
}
public class funint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//lamda operation
		myfun sum=(a,b)->a+b;
		System.out.println("RESULT IS "+sum.addmet(12, 100));
		//opredefined fun interface
		IntBinaryOperator add=(a,b) -> a+b;
		System.out.println("result is " +add.applyAsInt(12,100));
	}

}
