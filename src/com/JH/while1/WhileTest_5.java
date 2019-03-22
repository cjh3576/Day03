package com.JH.while1;

import java.util.Scanner;

public class WhileTest_5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int lv = 1;
		int gold = 0;
		int id = 1234;
		int pw = 5678;
		int yId;
		int yPw;
		int mon = 3;  //몬스터 마리수
		int i; //while문 변수
		boolean check = true;
		
		//로그인 처리
		System.out.println("로그인하시겠습니까? 1/0");
		int login= sc.nextInt();
		while(check) {

			if(login == 1){
				System.out.println("아이디를 입력하세요");
				yId=sc.nextInt();
				System.out.println("패스워드를 입력하세요");
				yPw=sc.nextInt();

				if(id==yId && pw == yPw) {
					System.out.println("로그인 성공");
					break;
				}
				else
					System.out.println("로그인 실패");

			}

			else if(login == 0) {
				System.out.println("프로그램을 종료합니다");
				break;
				
			}

		} // 로그인 처리 끝
		
		 if(login == 0) 
			 check = false; // 0번 프로그램 종료시

		//게임 시작
		while(check) {
			for(i = 1; i<=mon; i++) {
				System.out.println(i + "마리 사냥");
				if(i==mon) {
					lv += 1;
					System.out.println(lv + "  레벨 달성");
				} 

			}// for 문 끝

			if(lv % 5 == 0) {
				System.out.println(lv*200 + " 골드 지급");
				gold = gold + lv*200;
			}
			mon += 3;
			if(lv == 15) {
				System.out.println( "최종 레벨  :  " + lv);
				System.out.println( "최종 골드  :  " + gold);
				break;
			}
				

		}//while 문 끝
		
 

	}
}

