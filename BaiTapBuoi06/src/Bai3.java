import java.util.Scanner;

public class Bai3 {
	public static void main(String[] args) {
		//Viết chương trình tính tổng các số lẻ nguyên dương nhỏ hơn 
		//được nhập từ người dùng.
		//Chỉ cho nhập số > 0, yêu cầu nhập lại nếu không đúng yêu cầu
		
		Scanner sc = new Scanner(System.in);
		int n;
		int tong = 0;
		
		do {
			System.out.println("Nhập một số nguyên dương: ");
			n = sc.nextInt();
			if(n <= 0) {
				System.out.println("Vui lòng nhập số nguyên dương lớn hơn 0.");
			}
			
		}while(n <= 0);
		
		for(int i = 1; i < n; i+=2) {
			tong += i;
		}
		System.out.println("Tổng các số lẻ nguyên dương nhỏ hơn " + n + " là: " + tong);

	}
}
