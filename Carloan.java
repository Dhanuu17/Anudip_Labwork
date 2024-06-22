package com.example;

import java.util.Scanner;

public class Carloan implements LoanCalc {
	int prinamt,loanamt,roi=6;
    int year,downpay,remainbal,month,monthbal,interest,monthpayment;
    Scanner sc = new Scanner(System.in);

	public void loanAmount() {
		System.out.println("Enter the pricipal amount:");
		prinamt = sc.nextInt();
		System.out.println("Enter the year :");
		year = sc.nextInt();
		System.out.println("Enter Down Payment :");
		downpay=sc.nextInt();
	}

	public void accept() {
	
		remainbal = prinamt - downpay;
		month = year*12;
		monthbal = remainbal/month;
		interest = monthbal*(roi/100);
		monthpayment = monthbal+interest;
		System.out.println("Monthly Payment is:"+monthpayment);
		
	}

	public static void main(String[] args) {
		Carloan cl = new Carloan();
		cl.loanAmount();
		cl.accept();
	}

	@Override
	public void calculate() {
		// TODO Auto-generated method stub
		
	}
}