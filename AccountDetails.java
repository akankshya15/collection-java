package akankshya;

import java.util.Scanner;

public class AccountDetails {
	Account1[] accounts= new Account1[5];
	public AccountDetails(){
		accounts[0]= new Account1(1001,"deloitte",6000);
		accounts[1]= new Account1(1002,"nexwave",1000);
		accounts[2]= new Account1(1003,"parhi",2000);
		accounts[3]= new Account1(1004,"akankshya",9000);
		accounts[4]= new Account1(1005,"vssut",8000);
		
	}
	void deposit(int accNo, Double amount){
	
		int flag = 0 ;
		
		for(int i=0;i<accounts.length;i++)
		{
			if(accNo==accounts[i].getAccNo())
		{
			flag=1;
			double balance= accounts[i].getBalance();
			System.out.println("BALANCE IS="+balance);
			balance=balance+amount;
			System.out.println("successfully Deposited :)");
			System.out.println("new balance is= "+balance);
		}
		
		}
		//System.out.println("flag value"+ flag);
		try{
			if(flag==0)
				throw new AccountNotFoundException();
		}
		catch(AccountNotFoundException e)
		{e.printStackTrace();}
		}
		
	
	
	
	void withDraw(int accNo, double amount){
		int flag = 0;
		for(int i=0;i<accounts.length;i++)
		{
			if(accNo==accounts[i].getAccNo())
		{
			flag = 1;
			double balance= accounts[0].getBalance();
			balance=balance-amount;
			System.out.println("Successfully withdrawn ");
			System.out.println("new balance is= "+balance);
				
		}
		}
		try{
			if(flag==0)
				throw new AccountNotFoundException();}
		catch(AccountNotFoundException e)
		{e.printStackTrace();}
	}

	void checkBalance(int accNo){
		//System.out.println(accNo);
		int flag = 0;
		for(int i=0;i<accounts.length;i++)
		{
			if(accNo==accounts[i].getAccNo())
		{
			flag=1;
			double balance= accounts[0].getBalance();
			System.out.println("Balance is="+ balance);
		}
		}
		try{
			if(flag==0)
				throw new AccountNotFoundException();
		}
		catch(AccountNotFoundException e)
		{e.printStackTrace();}
		
		}

}

