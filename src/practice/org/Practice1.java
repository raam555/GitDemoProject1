package practice.org;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

public class Practice1 {
public static void main(String[] args) throws ParseException {
	
	//*increase the date
	Scanner s = new Scanner(System.in);
	System.out.println("Enter the Date: ");
String dt = s.nextLine();
	SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
	Calendar c = Calendar.getInstance();
			c.setTime(sdf.parse(dt));
	c.add(Calendar.YEAR, 27);
	dt= sdf.format(c.getTime());
	System.out.println(dt);

	//*reverse the string
	/*Scanner sc = new Scanner(System.in);
	System.out.println("Enter the Name: ");
	String name = sc.nextLine();
	String rev ="";
	for (int i = name.length()-1; i >=0; i--) {
		rev = rev+name.charAt(i);
		System.out.println(rev);
	}*/
	
	
	//*Reverse the number and Palindrome
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the Number: ");
	int num =sc.nextInt();
	int temp=num;
	int rev=0;
	while (num>0) {
		rev = (rev*10)+num%10;
		num/=10;
	}System.out.println(rev);
	if (rev==temp) {
		System.out.println("Palindrome");
	} else {
System.out.println("not palindrome");
	}
	


}
}

