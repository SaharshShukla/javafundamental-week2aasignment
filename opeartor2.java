import java.util.Scanner;

public class opeartor2 {


//19nov21-->Operators
//qst1) write a method which takes 2 numbers and 1 char(operation +, -, *, /)
// and performs the operation and returns the ans
/*public static int operation(int a,int b,char c) {
	int rst=0;
	{if(c=='+') {
		rst=a+b;
	}else if(c=='-') {
		rst=a-b;
	}else if(c=='*') {
		rst=a*b;
	}else {
		rst=a/b;
	}}
		return(rst);
}	*/

//qst2) write a method which takes 2 numbers as input and prints their relationship
//relational operators are:!=,>=,<=,<,>,==,=
	/*public static void relation(int a,int b) {
		if(a==b) {
			System.out.println(a+" equals to "+b);
		}else if(a>b) {
			System.out.println(a+" greater than "+b);
		}else {
			System.out.println(b+" greater than "+a);
		}
		
	}*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//qst1) write a method which takes 2 numbers and 1 char(operation +, -, *, /)
// and performs the operation and returns the ans
		Scanner sc=new Scanner(System.in);
/*try{
System.out.print("Enter number1: ");
int num1=sc.nextInt();
System.out.print("Enter number2: ");
int num2=sc.nextInt();
System.out.print("Enter a char between(+,-,*,/): ");
char c=sc.next().charAt(0);
int dis=operation(num1, num2, c);
System.out.println("Answers is "+dis);}
catch(Exception e) {
	System.out.println(e);
}*/
		
//qst2) write a method which takes 2 numbers as input and prints their relationship	
		/*try {
			System.out.print("Enter number1: ");
			int num1=sc.nextInt();
			System.out.print("Enter number2: ");
			int num2=sc.nextInt();
			 relation(num1, num2);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Input is invalid: "+e);
		}
		finally {
			System.out.println("Inside finally block");
		}*/
	}

}
