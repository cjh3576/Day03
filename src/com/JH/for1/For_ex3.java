package com.JH.for1;

import java.util.Scanner;

public class For_ex3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int id = 1234;
		int pw = 5678;
		
		
		
		for(int i = 0; i <= 5; i++) {
			System.out.println("아이디 입력");
			int id1 = sc.nextInt();
			System.out.println("패스워드 입력");
			int pw1 = sc.nextInt();
			
			
			if(id == id1 && pw == pw1) {
				System.out.println("로그인 성공");
				System.out.println("어떤 업무를 할까요");
				int num = sc.nextInt();

				
				switch(num) {
				
				case 1:
					System.out.println("1. 계좌조회");
					break;
				case 2:
					System.out.println("2. 계좌이체");
					break;
				case 3:
					System.out.println("3. 대출");
					break;
				}
				break;
				}
			else
				System.out.println("다시 로그인 해주세요");
			if(i == 5) 
				System.out.println("비밀번호 오류 초과, 은행방문");
			
			
			String result;
			
			
		}

	}

}
