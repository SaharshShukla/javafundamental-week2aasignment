package class_practice;

import java.util.Scanner;

public class assign6 {
	//functionside
	//qst1)"WAP to caluclate no. of digits in a number entered by user.
	/*public static void noOfDigit(int n) {
		int digit=0;
		while(n!=0) {
			n=n/10;//dividing number by 10 to reduce it
			digit++;//variable do counting of digit
			}
		System.out.println("Number of digit is "+digit);
		}*/
	
	//qst3)WAP to creat a fuction that check if no. is odd or even. 
    //call this function from main method"
	/*public static void num(int n) {
		if(n%2!=0) {
			System.out.println(n+" is odd number");
		}
		else {
			System.out.println(n+" is even number");
		}
	}*/
	
	//qst2)Apply do while loop to calculat 
	//factorial of a number such that, program asks  user, 
	//if he wants to continue, if yes, program should run again
	/* public static void fact(int x) {
		
		 Scanner sc=new Scanner(System.in);
		 char c;//global variable can be access from any where
		
		do {
			 int f=1;
			 if(x==1) {
				 System.out.println("Factorial of "+x+" is "+x);
			 }
			 for(int i=x;i>=1;i--) {
				 f=f*i;	 
			 }
			 System.out.println("Factorial of "+x+" is "+f);
			 System.out.print("Do you want to continue: y/n");
			  c=sc.next().charAt(0);
			 
		} while (c=='y');
		

	 } */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//16nov
		//qst1)"WAP to caluclate no. of digits in a number entered by user.
		Scanner sc=new Scanner(System.in);
		/*try{
			System.out.print("Enter any digit: ");
			int num=sc.nextInt();
			noOfDigit(num);
			}
		catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}*/
		
		//qst2)Apply do while loop to calculat 
		//factorial of a number such that, program asks  user, 
		//if he wants to continue, if yes, program should run again
		
		/*try {
			System.out.print("ENter any number: ");
			int n=sc.nextInt();
			fact(n);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Invalid Input: "+e);
		}*/
		
		//qst3)WAP to creat a fuction that check if no. is odd or even. 
		//call this function from main method"
		/*try {
			System.out.print("Enter any integer: ");
			int num=sc.nextInt();
			num(num);
		}
		catch (Exception e) {
			// TODO: handle exception
			System.out.println("Invalid input: "+e);
		}*/
	}

}
