package java8;

import java.util.Arrays;

public class example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] stringarrays=
			{
					"rishi","shashank","tisha"
			};
Arrays.sort(stringarrays, String ::comparetoignorecase);
	}

}
