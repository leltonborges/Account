package program;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class main {

	public static void main(String[] args) {
		Account acc = new Account(1001, "Alex", 0.0);
		BusinessAccount bacc = new BusinessAccount(1002, "Maria", 0.0, 500.00);
		/*
		//UPCASTING
		Account acc1 = bacc;
		Account acc2 = new BusinessAccount(1003, "Bob", 0.0, 200.00);
		Account acc3 = new SavingsAccount(1004, "Ana", 0.0, 0.01);
		
		//DOWNCASTING
		BusinessAccount acc4 = (BusinessAccount)acc2;
		acc4.loan(100.0);
		
		//BusinessAccount acc5 = (BusinessAccount)acc3;
		if(acc3  instanceof BusinessAccount) {
			BusinessAccount acc5 = (BusinessAccount)acc3;
			acc5.loan(200.00);
			System.out.println("Loan!");
		}
		if(acc3 instanceof SavingsAccount) {
			SavingsAccount acc5 = (SavingsAccount)acc3;
			acc5.updateBalance();
			System.out.println("Updade!");
		}
		*/
		
		
		//sobrecarga
		Account acc1_sobrecarga = new Account(1006, "Ana", 1000.0);
		acc1_sobrecarga.withdraw(200.0);
		System.out.println(acc1_sobrecarga.getBalance());
		//sobrecarga
		Account acc2_sobrecarga = new SavingsAccount(1007, "Thais", 1000.0, 0.01);
		acc2_sobrecarga.withdraw(200.0);
		System.out.println(acc2_sobrecarga.getBalance());
		//sobrecarga
		Account acc3_sobrecarga = new BusinessAccount(1008, "Fran", 1000.0, 500.0);
		acc3_sobrecarga.withdraw(200.0);
		System.out.println(acc3_sobrecarga.getBalance());
		
	}

}
