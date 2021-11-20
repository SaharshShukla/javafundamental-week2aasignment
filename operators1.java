package assignment8;

import java.util.Scanner;

//18nov21->Operators
public class operators1 {
	//qst1)Program to find greatest of two no. using ternary operator
	/*public static void greatest(int a,int b) {
String s=((a>b)?("a is greater than b"):("b is greater than a"));
System.out.println(s);
	}*/
	

//qst2)Program to find greatest of three no. using ternary operator 
	/*public static void greatest_Of_Threename(int a,int b,int c) {
		String s=((a>b)?((a>c?"number1 is greater than number2 and number3":"number3 is greater than number1 and number2"))
				      :((b>c?"number2 is greater than  number1 and number3":"number3 is greater than number2 and number1")));
		System.out.println(s);
	}*/
	
	
//qst3)Program to calculate no. of digits in a number using while loop"
	public static int calculate_No_Of_Digits(int n ) {
		int count=0;
		while(n!=0) {//number must be greater than zero
			n=n/10;//we get qutioent
			count++;//digit will increse after every qutioent
		}
		return(count);}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//18nov21->Operators
		//qst1)Program to find greatest of two no. using ternary operator
	/*try {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter number1: ");
		int a=sc.nextInt();
		System.out.print("Enter number2: ");
		int b=sc.nextInt();
		greatest(a, b);
	} catch (Exception e) {
		// TODO: handle exception
		System.out.println(e);
	}*/
		
//qst2)Program to find greatest of three no. using ternary operator 
	/*	try {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter number1: ");
		int a=sc.nextInt();
		System.out.print("Enter number2: ");
		int b=sc.nextInt();
		System.out.print("Enter number3: ");
		int c=sc.nextInt();
		greatest_Of_Threename(a, b, c);
	} catch (Exception e) {
		// TODO: handle exception
		System.out.println(e);
	}*/
		
//qst3)Program to calculate no. of digits in a number using while loop
	
		try {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter  any number: ");
		int num=sc.nextInt();
	    int dis=calculate_No_Of_Digits(num);	
		System.out.println("No of digit in "+num+" is "+dis);
	} catch (Exception e) {
		// TODO: handle exception
		System.out.println(e);
	}
	
	}
	

}
