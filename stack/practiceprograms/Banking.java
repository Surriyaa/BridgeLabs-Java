package com.java;

    class Account{
    private int accNo;
    private int pass;	
	private int deposit=0;
	private int withdrawal=0;
	private int transfer;
	private int balance=0;
	// setting
	public void accNum(int accNo) {
		this.accNo=accNo;
	}
	public void accPass(int pass) {
		this.pass=pass;
	}
	public void deposit(int deposit) {		
		this.deposit+=deposit;
		balance=this.deposit;
		System.out.println(deposit +" deposited successfully");
	}
	public void withdrawal(int withdrawal) {
		this.deposit-=withdrawal;
		balance=this.deposit;
		System.out.println( withdrawal+" withdraw successfully");
	}
	public void transfer(int transfer) {
		this.deposit-=transfer;
		balance=this.deposit;
		System.out.println(transfer +" deposited successfully");
	}
	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}
	public void setPass(int pass) {
		this.pass = pass;
	}
	// getting
	public int getAccNo() {
		return accNo;
	}
	public int getPass() {
		return pass;
	}
	public int getDeposit() {
		return deposit;
	}
	public int getTransfer() {
		return transfer;
	}
	public int getBalance() {
		return balance;
	}
}
    class SavingsAcc extends Account{
    	private double interest;
    	public SavingsAcc(double interest) {
            this.interest = interest;
        }
    	public double getInterest() {
    		return interest;
    	}
    }
    class CheckingAcc extends Account{
    	private double interest;
    	public CheckingAcc(double interest) {
            this.interest = interest;

    	}
    	public double getInterest() {
    		return interest;
    	}
    }

public class Banking {

	public static void main(String[] args) {
		Account a=new Account();
		SavingsAcc s=new SavingsAcc(1.5);
		CheckingAcc c=new CheckingAcc(2.5);
		s.accNum(79099);
		s.accPass(7676);
		s.deposit(1000);
		s.deposit(200);
		s.withdrawal(200);
		s.transfer(300);
		
		c.setAccNo(1000);
		c.setPass(2000);
		c.deposit(1000);
		c.deposit(200);
		c.withdrawal(200);
		c.transfer(300);
		System.out.println("Saving Account Number: "+s.getAccNo());
		System.out.println("Savings Account balance: "+s.getBalance());
		System.out.println("Savings Account interest: "+s.getInterest());
		
		System.out.println("Checking Account Number: "+c.getAccNo());
		System.out.println("Checking Account balance: "+c.getBalance());	
		System.out.println("Checking Account interest: "+c.getInterest());
	}
}
