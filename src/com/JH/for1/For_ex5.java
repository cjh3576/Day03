package com.JH.for1;

import java.util.Scanner;

public class For_ex5 {

	public static void main(String[] args) {
		
		
		int x = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("분 입력");
		int min = sc.nextInt();
		System.out.println("초 입력");
		int sec = sc.nextInt();
		for(int i= 0; i<=59; i++) {
			for(x = 0; x <= 59; x++ ) {
				System.out.println(i + "분" + x + "초");
				if (min == i && sec == x) {break;}
					
			}
			
		}

	}

}
