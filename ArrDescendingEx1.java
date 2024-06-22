package com.example;

import java.util.Scanner;

public class ArrDescendingEx1 {
	
	int arr[]=new int[7];
	int i,j,temp;
	Scanner sc=new Scanner(System.in);
	
	public void data() 
	{
		System.out.println("Enter Seven No.:");
		for(i=0;i<7;i++)
		{
			arr[i]=sc.nextInt();
		}
		for(i=0;i<7;i++)
		{
			for(j=i+1;j<7;j++)
			{
				if(arr[i]<arr[j])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
	}
	public void display() 
	{
		System.out.println("The Sorted elements are:");
		for(i=0;i<7;i++)
		{
			System.out.println(arr[i]);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrDescendingEx1 obj=new ArrDescendingEx1();
		obj.data();
		obj.display();
	}
}
