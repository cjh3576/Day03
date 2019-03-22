package com.JH.for1;

import java.util.Scanner;

public class For_ex6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		for(int i = 1; i <=3; i ++) {
			System.out.println("모드 변경 1. 단발 2. 점사");
			
			int num = sc.nextInt();
			int count = 30;
			if(num == 2) 
				count = 10;
			
			
			for(int j = 1; j<=count; j++ ) {
				if(num == 1)
					System.out.println("탕");
				else if(num == 2)
					System.out.println("타타탕");
				
			}
		
		
			
		}
		

	}

}
