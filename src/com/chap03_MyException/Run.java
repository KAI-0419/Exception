package com.chap03_MyException;

import java.util.Scanner;

public class Run {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 하나 입력: ");
		int no = sc.nextInt();
		
		try {
		checkNum(no);
		}catch(MyException e) {
//			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		
	}
	public static void checkNum(int num) throws MyException {
	if(num<10) {
//		MyException me = new MyException();
//		throw me;
		throw new MyException(num + "은 10보다 작은 수잖아!!!");
	}else {
		System.out.println(num+"은 10보다 크거나 같은 숫자야!!");
	}
	}
}
