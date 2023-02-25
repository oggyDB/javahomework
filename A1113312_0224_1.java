import java.util.*;

public class A1113312_0224_1
{
	public static void main(String [] argv)
	{
		int number,i;
		System.out.print("input some num:");
		Scanner sc=new Scanner(System.in);
		number=sc.nextInt();
		
		i=(number%2==0)?1:2;
		System.out.println(i==1?"it's even":"it's odd");
	}
}