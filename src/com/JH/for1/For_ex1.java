package com.JH.for1;

import java.util.Scanner;

public class For_ex1 {

	public static void main(String[] args) {
		/*
		int total=0;
		for(int i = 1; i<=10; i++) {
			total += i;
		}
		System.out.println(total);
		*/
		
		
		Scanner sc = new Scanner(System.in);
		int time = sc.nextInt();
		for(int i = 0; i<=59; i++) {
			System.out.println(i);
			if(i==time) {
				System.out.println("OK");
				break;
			}
		}
	}

}
