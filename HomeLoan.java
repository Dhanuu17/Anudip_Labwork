package com.example;

import java.util.Scanner;

public class HomeLoan implements LoanCalc {

	public double princiAmt,loanAmount,roi=7.5;
	int years;
	Scanner sc=new Scanner(System.in);

	public void loanAmount() {
		System.out.println("Enter Principal amount: ");                                              
		princiAmt=sc.nextDouble();
		System.out.println("Enter year");
		years=sc.nextInt();		
		
	}

	public void accept() {
		loanAmount=(princiAmt*years*(7.5))/100;
		System.out.println("Your interest for said years are:"+loanAmount);
		
	}

	
	public static void main(String[] args) {
	HomeLoan hl=new HomeLoan();
	hl.loanAmount();
	hl.accept();

	}

	@Override
	public void calculate() {
		// TODO Auto-generated method stub
		
	}
}