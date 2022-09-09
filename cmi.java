package java8;
interface myinter
{
	hello display(String say);
	
}
class hello{
 hello(String say)
	{
		System.out.println("Good morning "+say);
	}
}
public class cmi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		myinter ref= hello ::new;
		
ref.display("how are you");

	}

}
