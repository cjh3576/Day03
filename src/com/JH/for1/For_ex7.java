package com.JH.for1;

public class For_ex7 {

	public static void main(String[] args) {
		for(int i=0; i<10; i++) {
			System.out.println(i);
			switch(i) {
			case 3:
				i=10;
				break;
			case 12 :
				break;
			}
		}
		System.out.println("end");

	}

}
