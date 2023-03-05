package com.mr.codingtest;

public class CodingTestPratice {

	public static void main(String[] args) {
		
		
		// 0~100까지 더하기 
		/*
		int sum = 0;
		
		for(int i = 0; i <= 100; i++) {
			sum = sum + i;
		}
		System.out.println(sum);
		*/
		
		// 0~100까지 더하는데 5의 배수는 제외하고 더하기
		int sum = 0;
		for(int i = 0; i <= 100; i++) {
			if(i%5 != 0) {
				sum = sum+i;
			}
		}
		System.out.println(sum);
		
	}

}
