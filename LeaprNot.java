package guvi2;
import java.util.*;
public class LeaprNot {

	public static void main(String[] args) {
		Scanner g=new Scanner(System.in);
		int a;
		System.out.println("enter the year");
		a=g.nextInt();
		
		if(a%4==0)
		{
			System.out.println("it is a leap year");
		}
		else
		{
			System.out.println("it is not a leap year");
		}

	}

}
