import java.util.Scanner;

public class Bai2 {
	public static void main(String[] args) {
		// Cho 3 số nguyên. Hãy viết chương trình xuất ra bao nhiêu số lẻ
		// và bao nhiêu số chẵn
		Scanner sc = new Scanner(System.in);
		int[] soNguyen = new int[3];
		for(int i = 0; i < 3; i++) {
			System.out.println("Nhập số nguyên thứ " + (i+1) + ": ");
			soNguyen[i] = sc.nextInt();
		}
		
		int soLe = 0;
		int soChan = 0;
		for(int i = 0; i < 3; i++) {
			if(i % 2 == 0) {
				soChan++;
			} else {
				soLe++;
			}
		}
		System.out.println("Số lẻ: " + soLe);
		System.out.println("Số Chẵn: " + soChan);
	}
}
