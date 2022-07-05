package String_Search;

import java.util.Scanner;

public class SearchEmail {

	public static void main(String[] args) {
		int count =0;
		Scanner sc = new Scanner(System.in);
		String[] str1 = {"Ravi@gmail.com","Raj@gmail.com","Kumar@gmail.com"};
		System.out.println("Enter the email address to be search:");
		String str2 = sc.next();
		for(int i=0;i<str1.length;i++)
		{
			if(str2.equals(str1[i]))
			{
				System.out.println("Email exist: "+str1[i]);
				count++;
				break;
			}
			else
				if(i==str1.length-1 && count==0)
				{
					System.out.println("Email does not exist");
				}
				
		}

	}

}
