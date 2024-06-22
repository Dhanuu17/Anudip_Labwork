package com.example;
import  java.util.Scanner;

public class LinearSearchLabEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i, len, key, array[];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Array length:");
		len = sc.nextInt();
		array = new int[len];
		
		System.out.println("Enter" +  len + "elemnts :");
		for (i = 0; i < len; i++)
		{
			array[i] = sc.nextInt();
		}
		
		System.out.println("Enter the search key value:");  // 10 40 30 70 30
		key = sc.nextInt();
		for (i=0; i < len; i++)
		{
			if (array[i] == key)
			{
				System.out.println(key+ " is present at location :" + (i+1));
				break;
			}
		}
		if (i == len)
			System.out.println(key+ "doesn't exist in array.");

	}

}