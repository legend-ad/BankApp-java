import java.util.Scanner;
public class BankApp {
 public static void  main(String []arg) {
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Enter the name & customer ID");
	String name=sc.nextLine();
	String id=sc.nextLine();
	 Bank b=new Bank(name,id);
	 b.menu();
	
 }
}
 class Bank{
	double bal;
	String cname;
	double prevtrans;
	String cusId;
  Bank( String cname, String cusId){
	  this.cname=cname;
	  this.cusId=cusId;
		}
  void Deposit(double amount) {
	 if(amount!=0 ) {
		  bal += amount;
		  prevtrans=amount;
	 }
	 
  }
  void Withdraw(double amt) {
	  if(amt!=0 && bal>=amt) {
		  bal -= amt;
		  prevtrans= -amt;
	  }
	  else if (bal<amt) {
		  System.out.println("Insuffcient Balance");
	  }
	  }
  void getprevtrans() {
	  if(prevtrans<0) {
		  System.out.println("Withdrewal : "+prevtrans);
	  }
	  else if(prevtrans>0) {
		  System.out.println("Deposited"+Math.abs(prevtrans));
	  }
	  else {
		  System.out.println("No transaction occured");
	  }
  }
  void menu() {
	  char option;
	  Scanner sc =new Scanner(System.in);
	  System.out.println("Welcome "+cname);
	  System.out.println("Your ID "+cusId);
	  System.out.println("\n");
	  
	  System.out.println("********************************************");
	  System.out.println("a- Check Balance");
	  System.out.println("b- Deposit");
	  System.out.println("c- Withdrawal");
	  System.out.println("d- Previous transaction");
	  
	  do {
		  System.out.println("********************************************");
		  System.out.println("SELECT AN OPTION");
		  System.out.println("\n");
		  option=sc.next().charAt(0);
		  switch(option) {
		  case 'a':{
			  System.out.println("..........................................");
			  System.out.println("                BALANCE");
			  System.out.println("..........................................");
			  System.out.println("YOUR BALANCE IS : "+bal);
			  System.out.println("********************************************");
			  System.out.println("\n");
			  break;
		  }
		  case 'b':{
			  System.out.println("..........................................");
			  System.out.println("                DEPOSIT");
			  System.out.println("..........................................");
			  
			System.out.println("ENTER THE AMONT YOU WANT TO DEPOSIT :-");
			double amt=sc.nextDouble();
			Deposit(amt);
			  System.out.println("********************************************");
			  System.out.println("\n");
			  break;
		  }
		  case 'c':{
		  System.out.println("..........................................");
		  System.out.println("                WITHDRAW");
		  System.out.println("..........................................");
		  
		System.out.println("ENTER THE AMONT YOU WANT TO WITHDRAW : ");
		double amtw=sc.nextDouble();
		Withdraw(amtw);
		  System.out.println("********************************************");
		  System.out.println("\n");
		  break;
	  }
		  case 'd':{
			  System.out.println("..........................................");
			  System.out.println("                PREVIOUS TRANSACTION");
			  System.out.println("..........................................");
			  
			
			getprevtrans();
			  System.out.println("********************************************");
			  System.out.println("\n");
			  break;
			  }
		  case 'e':{
			  System.out.println("THANK YOU FOR USING OUR SERVICE");
		  }
		  }
		  
	  }
	  while(option!='e');{
		  
	  }
  }
  	
	}