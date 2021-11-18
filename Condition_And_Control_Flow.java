package assignment7;
import java.util.*;
public class Condition_And_Control_Flow {
	//qst1)Check whether user given input number is 1 digit or 
	//2 digit or 3 digit, 4 digit, 5 digit and more than 5 digit
	/*public static void checkDigit(int n) {
	
	int digit=0;
	while(n!=0) {
			n=n/10;
			digit++;
		}
	if(digit==1) {
			System.out.println("You have enter 1 digit");
		}else if(digit==2) {
			System.out.println("You have enter 2 digit");
		}else if(digit==3) {
			System.out.println("You have enter 3 digit");
		}else if(digit==4) {
			System.out.println("You have enter 4 digit");
		}else if(digit==5) {
			System.out.println("You have enter 5 digit");
		}else {
			System.out.println("You have enter more than 5 digit");
		}
	}*/
	
	
	
	/*2.write a method to print different grades of students by passing their score
	   Expln:
	     - less then 50 -> fail
	     - 50 - 59 -> D grade
	     - 60 - 69 -> C grade
	     - 70 - 79 -> B grade
	     - 80 - 89 -> A grade
	     - 90 - 100 -> A+ grade
	     - None of above -> Invalid*/
	/*public static void grade(int m) {
		if(m>=90&m<=100) {//number greater and equal to 90 and number less than and equal to100
			System.out.println("Your grade is A+");
		}else if (m<=89&m>=80) {//number less than and equal to 89  and greater equal to 80 
			System.out.println("Your grade is A");
		}else if(m<=79&m>=70) {//number less than and equal to 79  and greater equal to 70 
			System.out.println("Your grade is B");
		}else if(m<=69&m>=60) {//number less than and equal to 69  and greater equal to 60 
			System.out.println("Your grade is C");
		}else if(m<=59&m>=50) {//number less than and equal to 59  and greater equal to 50 
			System.out.println("Your grade is D");
		}else if(m<50){//number less than 50
			System.out.println("Your fail");
		}else {
			System.out.println("Invalid");
		}
	
	} */
	
	
	/*	3.write program to print different courses needs to be studied by students 
	 * //of different years and branch
	
    Expln:
       - Take branch(String, ie ECE, CSE, MEC) and year(int i.e 1,2,3,4) as inpurt from user and print courses user need to study
       -  1st year -> for all branches -> English, Maths, Science
       -  2nd year ->  CSE-> Operating System, Java, Data Structure
                               ECE-> Micro processors, Logic switching theory
                               MEC-> Drawing, Manufacturing Machines
      - 3rd year -> CSE ->Computer Organization, MultiMedia
                           ECE-> Fundamentals of Logic Design, Microelectronics
                           MECH->Internal Combustion Engines, Mechanical Vibration
      - 4th year -> CSE->Data Communication and Networks, MultiMedia
                          ECE->Embedded System, Image Processing
                          MECH->Production Technology, Thermal Engineering"*/
	public static void course(String branch,int yr) {
		if(yr==1) {
			System.out.println("courses user need to study  are English, Maths, Science");
		}else if((branch=="cse")&(yr==2)) {
			System.out.println("courses user need to study  are Operating System, Java, Data Structure");
		}else if((branch=="ece")&(yr==2)) {
			System.out.println("courses user need to study  are Micro processors, Logic switching theory");
		}else if((branch=="mec")&(yr==2)){
			System.out.println("courses user need to study  are Drawing, Manufacturing Machines");
		}if(branch=="cse"&yr==3) {
			System.out.println("courses user need to study  are Computer Organization, MultiMedia");
		}else if(branch=="ece"&yr==3) {
			System.out.println("courses user need to study  are  Fundamentals of Logic Design, Microelectronics");
		}else if(branch=="mec"&yr==3) {
			System.out.println("courses user need to study  are Internal Combustion Engines, Mechanical Vibration");
		}else if(branch=="cse"&yr==4) {
			System.out.println("courses user need to study  are Data Communication and Networks, MultiMedia");
		}else if(branch=="ece"&yr==4) {
			System.out.println("courses user need to study  are  Embedded System, Image Processing");
		}else if(branch=="mec"&yr==4) {
			System.out.println("courses user need to study  are Production Technology, Thermal Engineering");
		}else {
			System.out.println("Invalid input");
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//17nov

//qst1)Check whether user given input number is 1 digit or 
//2 digit or 3 digit, 4 digit, 5 digit and more than 5 digit
		 Scanner sc=new Scanner(System.in);
		/*try { 
		System.out.print("Enter any digit: ");
		 int num=sc.nextInt();
		 checkDigit(num);}
		
		catch(Exception e) {
			System.out.println("Invalid input: "+e);
		}*/
		 
		 
		/*2.write a method to print different grades of students by passing their score
		   Expln:
		     - less then 50 -> fail
		     - 50 - 59 -> D grade
		     - 60 - 69 -> C grade
		     - 70 - 79 -> B grade
		     - 80 - 89 -> A grade
		     - 90 - 100 -> A+ grade
		     - None of above -> Invalid*/
		 
	/*	 try{
		System.out.println("Enter your marks: ");
		 int marks=sc.nextInt();
		 grade(marks);}
		 catch(Exception e) {
			 System.out.println("Invalid input: "+e);
		 }*/
		 
	/*	3.write program to print different courses needs to be studied by students of different years and branch
		    Expln:
		       - Take branch(String, ie ECE, CSE, MEC) and year(int i.e 1,2,3,4) as inpurt from user and print courses user need to study
		       -  1st year -> for all branches -> English, Maths, Science
		       -  2nd year ->  CSE-> Operating System, Java, Data Structure
		                               ECE-> Micro processors, Logic switching theory
		                               MEC-> Drawing, Manufacturing Machines
		      - 3rd year -> CSE ->Computer Organization, MultiMedia
		                           ECE-> Fundamentals of Logic Design, Microelectronics
		                           MECH->Internal Combustion Engines, Mechanical Vibration
		      - 4th year -> CSE->Data Communication and Networks, MultiMedia
		                          ECE->Embedded System, Image Processing
		                          MECH->Production Technology, Thermal Engineering"*/
		 try {
			 System.out.print("Enter branch cse,ece and mec: ");
			 String br=sc.nextLine();
			 System.out.print("Enter year: ");
			 int yr=sc.nextInt();
			 course(br, yr);
		 }
		 catch(Exception e) {
			 System.out.println("Invalid input: "+e);
		 }
	}

}
