import java.util.*;
class Task3
{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		int x;
		System.out.print("Enter ending number: ");
		x=in.nextInt();
		int result=0;
		for(int i=0; i<=x; i++){
		result+=i;
		}
		System.out.println(result);
	}
}