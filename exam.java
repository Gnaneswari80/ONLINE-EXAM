package onlineExamination;

import java.util.Scanner;

public class exam {
	String pro[][]=new String[5][5];
 int sol[]=new int[5];
 int usersol[]=new int[5];
 static boolean log=false;
 static Scanner sc=new Scanner(System.in);
 static String NAME;
	public exam() {
		
		
		pro[0][0]=" 1)first names of JAVA??";
		pro[0][1]="1.Cofee";
		pro[0][2]="2.oak";
		pro[0][3]="3.java";
		pro[0][4]="4.Tea";
		
		pro[1][0]="2)What is java  OOPS";
		pro[1][1]="1.Inheritance";
		pro[1][2]="2.class and object";
		pro[1][3]="3.Polymorphism";
		pro[1][4]="4.all the above";
		
		
		pro[2][0]="3)whick language is easy to learn";
		pro[2][1]="1.c";
		pro[2][2]="2.java";
		pro[2][3]="3.python";
		pro[2][4]="4.c++";
		
	
		pro[3][0]="4)whick language Called as 'Mother Language'";
		pro[3][1]="1.c";
		pro[3][2]="2.java";
		pro[3][3]="3.python";
		pro[3][4]="4.c++";

		
		pro[4][0]="5)System.out.println('h'+10+10);\n"
				+ " What Is The Out put of these";
		pro[4][1]="1.h20";
		pro[4][2]="2.h1010";
		pro[4][3]="3.h 20";
		pro[4][4]="4.none of the above";
		
				
		sol[0]=2;
		sol[1]=4;
		sol[2]=3;
		sol[3]=1;
		sol[4]=2;
		if(log)
		{////////////if log is true
		        System.out.println("Welcome "+NAME);
		        System.out.println("You Can take the Test now");
	 
		        for(int i=0;i<5;i++)
		          {
			          for(int j=0;j<5;j++) {
			            	System.out.println(pro[i][j]);
		             	}
			          System.out.println("Enter Option");
			          usersol[i]=sc.nextInt();
		           } 
		          ///checking answers
		           int score=0;
		           for(int i=0;i<5;i++)
		             {
		                if(usersol[i]==sol[i])
			           score++; 
		                  }
	                     	System.out.println("YourScore "+score);
	                     	exam.logout();
		
	     }//log true
		else
		{
			System.out.println("Login Failed...");

			
		}
		
	}
	public static void login()
	{
		System.out.println("Enter User name to login");
		String nm=sc.nextLine().toLowerCase();
		if(nm.equals(NAME.toLowerCase()))
		log=true;
		
		//else
		//log=false;	
	}
	public static void logout()
	{
		log=false;
	}
	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter User name");
		 NAME=sc.nextLine(); 
		login();
		exam ex=new exam();

	}

}
