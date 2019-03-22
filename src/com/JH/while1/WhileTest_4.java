package com.JH.while1;

import java.util.Scanner;

public class WhileTest_4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int bul = 0;
		int chic = 0;
		int pota = 0;
		int sal = 0;

		boolean check = true;

		while(check) {
			System.out.println("메뉴를 선택하세요");
			System.out.println("햄버거***************");
			System.out.println("1. 불고기버거 3500원");
			System.out.println("2. 치킨버거 3200원");
			System.out.println("추가**************");
			System.out.println("3. 감자튀김 1000원");
			System.out.println("4. 샐러드 2000원");

			System.out.print("메뉴선택");
			int num = sc.nextInt();
		
			
			switch(num) {
			case 1: 
				System.out.println("불고기버거를 선택하셨습니다");
				
				break;
			case 2:
				System.out.println("치킨버거를 선택하셨습니다");
				break;
			case 3:
				System.out.println("감자튀김을 선택하셨습니다");
				break;
			case 4:
				System.out.println("샐러드를 선택하셨습니다");
				break;
			default :
				System.out.println( "잘못된 선택입니다");
				
			}
			
			System.out.print("수량은 ? ");
			int total= sc.nextInt();
			
			if(num == 1) {
				bul = bul + total;
				System.out.println(total + "개 주문 하셨습니다");
			}
			else if (num == 2) {
				chic = chic + total;
				System.out.println(total + "개 주문 하셨습니다");
			}
			else if (num == 3) {
				pota = pota + total;
				System.out.println(total + "개 주문 하셨습니다");
			}
			else if (num == 4) {
				sal = sal + total;
				System.out.println(total + "개 주문 하셨습니다");
			}
			

			System.out.println(" 추가 주문 하시겠습니까? 1/0");
			int num1 = sc.nextInt();
			if(num1 == 0)
				break;


		}
		int total = bul*3500 + chic*3200 + pota*1000 + sal * 2000;
		
		if(bul >0) System.out.println("불고기버거 " +bul + "개 주문 하셨습니다 가격: " + bul * 3500);
		if(chic>0) System.out.println("치킨버거 " +chic + "개 주문 하셨습니다 가격: " + chic * 3200);
		if(pota>0) System.out.println("감자튀김 " +pota + "개 주문 하셨습니다 가격: " + pota * 1000);
		if(sal>0) System.out.println("샐러드 " +sal + "개 주문 하셨습니다 가격: " + sal * 2000);
		System.out.println( "총 가격은 : " + total + "입니다." );

	}

}
