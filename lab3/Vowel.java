import java.util.*;
class Vowel
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter character ");
		char chr=in.next().charAt(0);
		switch(chr)
		{
			case 'A':
			System.out.print("Vowel");
			break;
	
			case 'E':
			System.out.print("Vowel");
			break;
	
			case 'I':
			System.out.print("Vowel");
			break;
	
			case 'O':
			System.out.print("Vowel");
			break;

			case 'U':
			System.out.print("Vowel");
			break;

			case 'a':
			System.out.print("Vowel");
			break;

			case 'e':
			System.out.print("Vowel");
			break;

			case 'i':
			System.out.print("Vowel");
			break;

			case 'o':
			System.out.print("Vowel");
			break;

			case 'u':
			System.out.print("Vowel");
			break;
	
			default:
			System.out.print("Consonant");
			break;
		}
	}
}