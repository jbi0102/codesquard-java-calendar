package jbi0102.calendar;

import java.util.Scanner;

public class Sum {
	public static void main(String[] args) {
		System.out.println("두 수를 입력하세요");
		Scanner sc = new Scanner(System.in);
		int first;
		int second;
		first = Integer.parseInt(sc.next());
		second = Integer.parseInt(sc.next());
		System.out.println("두 수의 합은 " + (first + second) + "입니다");
		System.out.printf("%d와 %d의 합은 %d", first, second, (first + second));
		sc.close();
	}
}
