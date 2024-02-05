package Ex03;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		double div = 0;
		
		System.out.println("정수 2개 입력 >>");
		
		try {
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		
		div = (double) num1/num2;
		} catch(InputMismatchException e) {
			e.getMessage();
			e.printStackTrace();
		} catch(ArithmeticException e) {
			e.getMessage();
			e.printStackTrace();
		} catch(Exception e) {
			e.getMessage();
			e.printStackTrace();
		}
		
		System.out.println("나누기 : " + div);
		System.out.println("프로그램 종료");
		
	}

}
