package demo_jv04;

import java.util.Scanner;

public class Bai5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập độ C: ");
		double doC = sc.nextDouble();
		double doF = (doC * 1.8) + 32;
		System.out.println("Độ F là: " + doF);
	}
}
