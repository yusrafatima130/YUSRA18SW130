import java.util.*;
class Task1
{
	public static void main(String args[])
	{	int sum,total=300;
		double percentage;
		char grade;
		Scanner sc=new Scanner(System.in);
		System.out.println("RESULT\n");

		System.out.println("ENTER MARKS IN C++");
		int x=sc.nextInt();

		System.out.println("ENTER MARKS IN DATA STRUCTURE");
		int y=sc.nextInt();

		System.out.println("ENTER MARKS IN OPERATING SYSTEM");
		int z=sc.nextInt();
		
		sum=(x+y+z);
		percentage=(100*sum/total);
		if(percentage>=90)
			grade='A';
		else if(percentage>=80 && percentage<90)
			grade='B';
		else if(percentage>=70 && percentage<80)
			grade='C';
		else if(percentage>=60 && percentage<70)
			grade='D';
		else
			grade='F';
		System.out.println("Grade = "+grade);
	}
}
