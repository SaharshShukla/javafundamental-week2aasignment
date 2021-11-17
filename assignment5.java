package class_practice;

import java.util.Iterator;
import java.util.Scanner;

public class assignment5 {
	//function side
	//qst1)write a method that multiplies 2 numbers and returns the answer
/*public static int mul(int a,int b) {
	int pro=a*b;
	return(pro);
}*/
	
	//qst2)write 3 different mathods each takes int, float, long 
	//numbers as input and returns its multiplication value
	/*public static int integerVariable(int a,int b) {//function for multipilcation of two int no
		int pro=a*b;
		return(pro);
	}*/
	/*public static float floatVariable(float a1,float b1) {//function for multipilcation of two float no
		float pro=a1*b1;
		return(pro);
	}*/
	/*public static long longVariable(long a2,long b2) {//function for multipilcation of two long no
		long pro=a2*b2;
		return (pro);
	}*/
	
	
	//qst3)write 3 different mathods each takes different
	 // number of int arguments and return its max value
	/*public  static  void method1(int a,int b) {
		if(a>b) {
			System.out.println(a+" is greater  "+b);
		}
		else if(a==b) {
			System.out.println(a+" is equal to "+b);
		}
		else if(b>a) {
			System.out.println(b+" is greater  "+a);
		}
		
	}*/
	/*public  static  void method1(int a,int b,int c) {
		if((a>b)&(a>c)) {
			System.out.println(a+" is greater "+b+" and "+c);
		}
		else if((a==b)&(a==c)) {
			System.out.println(a+" is equal to "+b+" and "+c);
		}
		else if((b>a)&(b>c)) {
			System.out.println(b+" is greater and  "+b+" and "+c);
		}
		else if((c>a)&(c>b)) {
			System.out.println(c+" is greater and  "+a+" and "+b);
		}
		}*/
	/*public  static  void method1(int a,int b,int c,int d) {
		if((a>b)&(a>c)&(a>d)) {
			System.out.println(a+" is greater "+b+" and "+c+" and "+d);
		}
		else if((a==b)&(a==c)&(a==d)) {
			System.out.println(a+" is equal to "+b+" and "+c+" and "+d);
		}
		else if((b>a)&(b>c)&(b>d)) {
			System.out.println(b+" is greater and  "+b+" and "+c+" and "+d);
		}
		else if((c>a)&(c>b)&(c>d)) {
			System.out.println(c+" is greater and  "+a+" and "+b+" and "+d);
		}
		else if((d>a)&(d>b)&(d>c)) {
			System.out.println(d+" is greater and  "+a+" and "+b+" and "+c);
		}
		
		}*/
	
	//qst4)write a method to return sum of array"*/
	/*public static int arraySum(int[]a,int[] b){
		int[] sum=new int[5];
		int i;
		for(i=0;i<4;i++) {
			 sum[i]=a[i]+b[i];}
		return(sum[i]);
	}*/
	
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
		 int disint=integerVariable(num1, num2);
		 
		 
		 System.out.print("Enter first long: ");
		 long n1=sc.nextLong();
		 System.out.print("Enter second long: ");
		 long n2=sc.nextLong();
		long dislong= longVariable(n1, n2);
		 
		 
		 System.out.print("Enter first float: ");
		 float n_1=sc.nextFloat();
		 System.out.print("Enter second float: ");
		 float n_2=sc.nextFloat();
		 float disfloat=floatVariable(n_1, n_2);
		 
		 System.out.println("Multiplication of "+num1+" and "+num2+" is "+disint);
		 System.out.println("Multiplication of "+n1+" and "+n2+" is "+dislong);
		 System.out.println("Multiplication of "+n_1+" and "+n_2+" is "+disfloat);}
		catch (Exception e) {
			System.out.println("Invalid input: "+e);
		}*/
		 
		//qst3)write 3 different mathods each takes different
		 // number of int arguments and return its max value
		/* try{
			 //it will not return max value it will compare and will display in methord
			 System.out.println("Enter number1: ");
		     int n1=sc.nextInt();
		     System.out.println("Enter number2: ");
		     int n2=sc.nextInt();
		     System.out.println("Enter number3: ");
		     int n3=sc.nextInt();
		     System.out.println("Enter number4: ");
		     int n4=sc.nextInt();
method1(n1, n2);
method1(n1, n2, n3);//methord overloading
method1(n1, n2, n3, n4);//methord overloading
		 
		 }
		 catch (Exception e) {
			// TODO: handle exception
			 System.out.println("Invalid input: "+e);
		}*/
		 
		//qst4)write a method to return sum of array"*/
		/* try {
			 int[]a= {1,2,3,4,5};
			 int[]b= {6,7,8,9,20};
			 int[]dis=new int[5];
			 
			 for(int j=0;j<4;j++)
			{dis[j]= arraySum(a, b);
			System.out.println("Sum of array "+a+" and "+b+" is "+dis[j]);}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}*/
	}

}
