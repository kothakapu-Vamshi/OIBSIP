
package prog2;

import java.util.*;
public class task4
{
	Scanner sc = new Scanner(System.in);
	HashMap<String,Integer> info = new HashMap<String,Integer>();
	public void login()
	{
	    
		info.put("01",1234);
		info.put("02",2345);
		info.put("03",3456);
		info.put("04",4567);
		info.put("05",5678);
		String id;
		int pwd;
		System.out.println("Please Login your account!");
		System.out.println("Enter your respective user ID:");
		id = sc.next();
		System.out.println("Enter your respective password:");
		pwd = sc.nextInt();
		
		
		if(info.containsKey(id) && info.get(id)==pwd)
		{
			System.out.println("\nLogged in successfully!");
			menu();
		}
		
		
		else
		{
			System.out.println("\nIncorrect userID or Incorrect password!\nPlease Try again!\n");
			login();
			
		}
	}
	
	
	public void menu()
	{
		int ch;
		System.out.println("\nEnter the choice:");
		System.out.println("1.Update your profile \n2.Start the exam \n3.Logout your account ");
		ch = sc.nextInt();
		switch(ch)
		{
			case 1:
				info = update();
				menu();
				break;
			case 2:
				startExam();
				menu();
				break;
			case 3:
				System.exit(0);
				break;
			default:
				System.out.println("Choose a valid operation to be done!");
		}
		
		
	}
	
	
	public HashMap<String,Integer> update()
	{
		String update_id;
		int update_pwd;
		System.out.println("Enter your respective username:");
		update_id = sc.next();
		System.out.println("Enter your respective old password:");
		update_pwd = sc.nextInt();
		if(info.containsKey(update_id) && info.get(update_id)==update_pwd)
		{
			System.out.println("Enter your new password:");
			update_pwd = sc.nextInt();
			info.replace(update_id,update_pwd);
			System.out.println("Password had been reset successfully!");
		}
		
		
		else
		{
			System.out.println("User record has not been  found!\n");
		}
		
		
		return info;
		
	}
	public void startExam()
	{
		long startTime = System.currentTimeMillis();
		long endTime = startTime + 30;
		int score = 0,ans;
		
		
		System.out.println("Read Instructions:");
		System.out.println("1. There will be 5 questions in the given exam");
		System.out.println("2. All questions are to be answered compulsory");
		System.out.println("3. For each of the correct answer you will get 5 marks");
		System.out.println("4. For each of the wrong answer 1 mark will be deducted from your aquired marks");
		System.out.println("5. Time limit to complete the given examination is 5 minutes");
		System.out.println("\n All The Best for your exam!\n");
		System.out.println("****Exam has started****");
		
		
		
		while(System.currentTimeMillis()<endTime)
		{
			System.out.println("--------------------------------------------");
			System.out.println("Q1.Which of the following programming languages deals with the database?");
			System.out.println("1.DBMS \t2.PYTHON \t3.JAVA \t4.JS");
			System.out.print("Answer the given question:");
			ans = sc.nextInt();
			if(ans == 1)
				score+=5;
			else
				score--;
			
			
			
			System.out.println("-------------------------------------------");
			System.out.println("Q2.Which is not a programming language in the following?");
			System.out.println("1.Python\t2.Java\t3.Linux\t4.HTML");
			System.out.print("Answer the given question:");
			ans = sc.nextInt();
			if(ans == 3)
				score+=5;
			else
				score--;
			
			
			
			System.out.println("--------------------------------------------");
			System.out.println("Q3.Which of the following is not a string");
			System.out.println("1.1abhi\t2.abhi1948\t3.abhi\t4.a");
			System.out.print("Answer the given question:");
			ans = sc.nextInt();
			if(ans == 1)
				score+=5;
			else
				score--;
			
			
			
			System.out.println("--------------------------------------------");
			System.out.println("Q4.Which of the following is a python file");
			System.out.println("1.iare.pyt\t2.iare.python\t3.iare.py\t4.iare.pt");
			System.out.print("Answer the given question:");
			ans = sc.nextInt();
			if(ans == 3)
				score+=5;
			else
				score--;
			
			
			
			System.out.println("--------------------------------------------");
			System.out.println("Q5.What else also the command interpreter is also called");
			System.out.println("1.kernel\t2.prompt\t3.shell\t4.command");
			System.out.print("Answer:");
			ans = sc.nextInt();
			if(ans == 3)
				score+=5;
			else
				score--;
			System.out.println("--------------------------------------------");
			break;
		}
		
		
		System.out.println("Your exam has been ended.");
		System.out.println();
		System.out.println("Your respective score is "+score);
		if(score>10)
			System.out.println("Congratulations! you got a good score");
		else
			System.out.println("Better Luck Next Time!");
	}
	
	
	
	
	public static void main(String args[])
	{
		task4 obj = new task4();
		obj.login();
		
	}
	
}