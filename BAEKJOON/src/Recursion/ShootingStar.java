package Recursion;

import java.awt.List;
import java.util.ArrayList;
import java.util.Scanner;

public class ShootingStar {
	
	public static void shootingStar(int num) {
		String star3 = "***";
		String star2 = "* *";
		String empty = "   ";

		if(num > 0) {
			
			//추가
			shootingStar(num-1);
		}
	}

	public static void main(String[] args) {
		//재귀적인 패턴으로 별을 찍어 보자. N이 3의 거듭제곱(3, 9, 27, ...)이라고 할 때, 크기 N의 패턴은 N×N 정사각형 모양이다.
		//N이 3보다 클 경우, 크기 N의 패턴은 공백으로 채워진 가운데의 (N/3)×(N/3) 정사각형을 크기 N/3의 패턴으로 둘러싼 형태이다. 예를 들어 크기 27의 패턴은 예제 출력 1과 같다.
		//입력 : 첫째 줄에 N이 주어진다. N은 3의 거듭제곱이다. 즉 어떤 정수 k에 대해 N=3k이며, 이때 1 ≤ k < 8이다.
		//출력 : 첫째 줄부터 N번째 줄까지 별을 출력한다.
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		
		shootingStar(num/3);
	
	}

}
