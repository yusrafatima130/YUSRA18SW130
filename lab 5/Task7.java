public class Task7{
	public static void main(String[]args)
	{
		String s="yusra, 18, BE-Software;dua, 19, BE-software";
		//split function return value in array
		String []str=s.split(";");
		str[0]="yusra, 18, BE-Software";
		str[1]="dua, 19, BE-software";
		String str1[]=str[0].split(",");
		String str2[]=str[1].split(",");
		System.out.println("Student: 1");
		System.out.println("Name: "+str1[0]);
		System.out.println("Age: "+str1[1]);
		System.out.println("Program"+str1[2]);
		System.out.println("Student: 2");
		System.out.println("Name: "+str2[0]);
		System.out.println("Age: "+str2[1]);
		System.out.println("Program: "+str2[2]);
	}
}