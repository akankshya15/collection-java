package akankshya;

import java.util.Scanner;

public class AccountApplication1 {
	public static void main(String[] args) {
		System.out.println("1.Deposit");
		System.out.println("2.WithDraw");
		System.out.println("3.Check Balance");
		System.out.println("4.Exit");
		System.out.println("Enter your choice");
		Scanner sc= new Scanner(System.in);
		int p= sc.nextInt();
		AccountDetails ad= new AccountDetails();
		switch(p)
		{
		case 1:
			System.out.println("enter the account no");
			Scanner s= new Scanner(System.in);
			int acc=  s.nextInt();
			System.out.println("Enter the amount to be deposited =");
			double dep= s.nextInt();
			ad.deposit(acc, dep);
			
			break;
		case 2:
			System.out.println("enter the account no");
			Scanner q= new Scanner(System.in);
			int acc1= q.nextInt();
			System.out.println("Enter the amount to be withdrawn.=");
			double with= q.nextInt();
			ad.withDraw(acc1, with);
			break;
			
		case 3:
			System.out.println("enter the account no=");
			Scanner a= new Scanner(System.in);
			int acc2= a.nextInt();
			ad.checkBalance(acc2);
			break;
		case 4:
			return;
			
		}
		AccountDetails del = new AccountDetails();
		
	}

	private static void exit(int i) {
		// TODO Auto-generated method stub
		
	}

}
