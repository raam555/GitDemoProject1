package practice.org;

import java.util.Scanner;

public class Practice {

	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the no: ");
      int num =sc.nextInt();
      int temp = num;
      int rev =0;
      while (num>0) {
    	  int rem = num%10;
		rev = (rev*10)+rem;
		//num=num/10;
		num/=10;
	}
		
	System.out.println(rev);
	if (rev==temp) {
		System.out.println("Entered no. is Palindrome");
	} else {
System.out.println("entered no. is not Palindrome");
	}
		
	
	Scanner sc1 = new Scanner(System.in);
	System.out.println("Enter the Value");
	
	String s = sc1.next();
	String s1 ="";
	for (int i = s.length()-1; i >=0; i--) {
	  s1=s1+s.charAt(i);
	}
	System.out.println(s1);
	if (s1==s) {
		System.out.println("Entered value is palindrome");
	} else {
		System.out.println("Entered value is not palindrome");
	}
	}
	
	
}
