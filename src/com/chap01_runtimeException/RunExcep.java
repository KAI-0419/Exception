package com.chap01_runtimeException;

import java.util.Scanner;

public class RunExcep {
	public static void main(String[] args) {
		RunExcep re = new RunExcep();
//		re.ArithEx();
		re.ClassNArrayEx();
		
	}
	Scanner sc = new Scanner(System.in);
	
	public void ArithEx() {
		int ran = 0;
		
		System.out.print("나누는 수: ");
		int inputNum = sc.nextInt();
		
//		1. if
		
//		if(inputNum == 0) {
//			System.out.println("0이야.. 다른거 입력해줘..");
//		}else {
//			ran = (int)(Math.random()*10)+1;
//			System.out.println(ran + "/" + inputNum + "=" + ran/inputNum);
//		}
		
//		2. try-catch
		try {
			ran = (int)(Math.random()*10)+1;
			System.out.println(ran + "/" + inputNum + "=" + ran/inputNum);
		}catch(ArithmeticException e) {
			System.out.println("exception 발생");
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}
	
	public void ClassNArrayEx(){
		//classCastException
//		Object obj = new int[10];
//		Object obj = 'a';
//		System.out.println(obj);
//		String str = (String)obj;
//		System.out.println(str); 
		
		try {
		// ArrayIndexOutOfBoundsException
//		int[] arr = new int[2];
//		arr[0] = 1;
//		arr[1] = 2;
//		
//		arr[2] = 3;
//		System.out.println("arr");
		
		//NullPointerException
		String str = null;
		int length = str.length();
		
		}catch(ArrayIndexOutOfBoundsException e) {
//			e.printStackTrace();
			System.out.println("이건 배열 범위를 넘어가서 발생하는 예외야..");
			System.out.println("문제가 되는 index는! " + e.getMessage());
		}catch(NullPointerException e) {
			System.out.println("null인데?");
		}catch(ClassCastException e){
			System.out.println("형변환..어?");
		}finally {
			System.out.println("마지막에 실행!!");
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
