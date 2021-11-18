package class_practice;

import java.util.Iterator;
import java.util.Scanner;

public class assignment5 {
	//qst1)write a method that multiplies 2 numbers and returns the answer
/*public static int mul(int a,int b) {
	int pro=a*b;
	return(pro);
}*/
	
	//qst2)write 3 different mathods each takes int, float, long 
	//numbers as input and returns its multiplication value
	/*public static int variable(int a,int b) {//function for multipilcation of two int no
		int pro=a*b;
		return(pro);
	}*/
	/*public static float variable(float a1,float b1) {//function for multipilcation of two float no
		float pro=a1*b1;
		return(pro);
	}*/
	/*public static long variable(long a2,long b2) {//function for multipilcation of two long no
		long pro=a2*b2;
		return (pro);
	}*/
	
	
	//qst3)write 3 different mathods each takes different
	 // number of int arguments and return its max value
	public  static  int method1(int a,int b) {
		int rst=Math.max(a, b);
		return(rst);
		
	}
	public  static  int method1(int a,int b,int c) {
		int rst=Math.max(Math.max(a, b),c);
		return(rst);
		}
	public  static  int method1(int a,int b,int c,int d) {
		int rst=Math.max(Math.max(Math.max(a, b),c),d);
		return (rst);
		
		}
		
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//15nov aasignment
		//qst1)write a method that multiplies 2 numbers and returns the answer
		 Scanner sc=new Scanner(System.in);
		/* try {
			 System.out.print("Enter any integer: ");
			 int num1=sc.nextInt();
			 System.out.print("Enter any integer: ");
			 int num2=sc.nextInt();
			 int dis=mul(num1,num2);
			 System.out.println("Multiplication of "+num1+" and "+num2+" is "+dis);
		 }
		 catch(Exception e) {
			 System.out.println("Invalid input: "+e);
		 }*/
		 
		 
		//qst2)write 3 different mathods each takes int, float, long 
	   //numbers as input and returns its multiplication value
		/*try { 
		 System.out.print("Enter first integer: ");
		 int num1=sc.nextInt();
		 System.out.print("Enter second integer: ");
		 int num2=sc.nextInt();
		 int disint=variable(num1, num2);
		 
		 
		 System.out.print("Enter first long: ");
		 long n1=sc.nextLong();
		 System.out.print("Enter second long: ");
		 long n2=sc.nextLong();
		long dislong= variable(n1, n2);
		 
		 
		 System.out.print("Enter first float: ");
		 float n_1=sc.nextFloat();
		 System.out.print("Enter second float: ");
		 float n_2=sc.nextFloat();
		 float disfloat=variable(n_1, n_2);
		 
		 System.out.println("Multiplication of "+num1+" and "+num2+" is "+disint);
		 System.out.println("Multiplication of "+n1+" and "+n2+" is "+dislong);
		 System.out.println("Multiplication of "+n_1+" and "+n_2+" is "+disfloat);}
		catch (Exception e) {
			System.out.println("Invalid input: "+e);
		}*/
		 
		//qst3)write 3 different mathods each takes different
		 // number of int arguments and return its max value
		 try{
			 //it will not return max value it will compare and will display in methord
			 System.out.println("Enter number1: ");
		     int n1=sc.nextInt();
		     System.out.println("Enter number2: ");
		     int n2=sc.nextInt();
		     System.out.println("Enter number3: ");
		     int n3=sc.nextInt();
		     System.out.println("Enter number4: ");
		     int n4=sc.nextInt();
int dis1=method1(n1, n2);
int dis2=method1(n1, n2, n3);//methord overloading
int dis3=method1(n1, n2, n3, n4);//methord overloading
System.out.println("Maximum of "+n1+" and "+n2+" is "+dis1);
System.out.println("Maximum of "+n1+" , "+n2+" and "+n3+" is "+dis2);		
System.out.println("Maximum of "+n1+" , "+n2+" , "+n3+" and "+" is "+dis3);		
		 }
		 catch (Exception e) {
			// TODO: handle exception
			 System.out.println("Invalid input: "+e);
		}
		 
		
	}

}
