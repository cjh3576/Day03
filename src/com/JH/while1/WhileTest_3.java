package com.JH.while1;

import java.util.Scanner;

public class WhileTest_3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int id = 1234;
		int pw = 5678;
		boolean check = false;
		
		do{
			System.out.println("id : ");
			int yId = sc.nextInt();
			System.out.println("pw : ");
			int yPw = sc.nextInt();
			if(id==yId && yPw==pw)
				System.out.println("로그인 성공");
				break;
		}while(check);

	}

}
