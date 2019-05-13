import java.util.*;
class Numbers
{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		System.out.print("Enter number for table: ");
		int number=in.nextInt();
		System.out.print("Enter starting number :");
		int sn=in.nextInt();
		System.out.print("Enter Ending number :");
		int en=in.nextInt();
		for(int a=sn; a<=en; a++)
		{
			System.out.println(number+"x"+a+"="+(number*a));
        }
}
}