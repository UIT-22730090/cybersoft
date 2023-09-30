import java.util.Scanner;

public class Bai1 {
	public static void main(String[] args) {
		// Nhập tên và năm sinh của 3 sinh viên. Hãy viết chương trình xuất ra tên
		// năm sinh của sinh viên trẻ nhất
		Scanner sc = new Scanner(System.in);
		String[] tenSV = new String[3];
		int[] namSinh = new int[3];
		for(int i = 0; i < 3; i++) {
			System.out.println("Nhập tên sinh viên thứ " + (i+1) + " : ");
			tenSV[i] = sc.nextLine();
			System.out.println("Nhập năm sinh sinh viên thứ " + (i+1) + " : ");
			namSinh[i] = sc.nextInt();
			sc.nextLine();
		}
		
		String tenSVTreNhat = tenSV[0];
		int namSinhTreNhat = namSinh[0];
		
		for(int i = 0; i < 3; i++) {
			if(namSinhTreNhat < namSinh[i]) {
				namSinhTreNhat = namSinh[i];
				tenSVTreNhat = tenSV[i];
			}
		} 
		
		System.out.println("Sinh viên trẻ nhất là: " + tenSVTreNhat);
		System.out.println("Năm sinh của sinh viên trẻ nhất là: " + namSinhTreNhat);
	}
}
