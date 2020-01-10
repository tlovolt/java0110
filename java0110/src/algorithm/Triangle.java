package algorithm;

import java.util.Scanner;

public class Triangle {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("라인 수:");
		int line = sc.nextInt();
		
		//출력할 숫자 변수
		int su = 0;
		
		for(int i=0; i<line; i=i+1) {
			//공백 출력
			for(int j=0; j<line-i-1; j=j+1) {
				System.out.print("*");
			}
			//숫자와 공백 출력
			//첫번째 줄은 숫자 1개, 마지막 줄은 숫자를 2*line-1개
			//그 이외의 경우는 숫자1개 공백 숫자1개 출력
			if(i==0) {
				System.out.print(su % 10);
				su = su + 1;
			}
			//맨 마지막 줄
			else if(i==line-1) {
				for(int j=0; j<2*line-1; j=j+1) {
					System.out.print(su % 10);
					su = su + 1;
				}
			}
			//첫번째 줄도 아니고 맨 마지막 줄도 아닌 경우
			else {
				//숫자 1개 출력
				System.out.print(su % 10);
				su = su + 1;
				//중간 공백 만들기 : 2*i-1개
				for(int j=0; j<2*i-1; j=j+1) {
					System.out.print("*");
				}
				//숫자 1개 출력
				System.out.print(su % 10);
				su = su + 1;
			}
			
			//System.out.print("\n");
			System.out.println();
		}
		
		
		sc.close();
	}
}




