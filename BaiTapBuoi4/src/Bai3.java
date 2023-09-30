import java.util.Scanner;

public class Bai3 {
	public static void main(String[] args) {
		// Cho biết tên, năm sinh, giới tính của 3 cán bộ. Hãy viết chương trình tìm
		// và in tên cán bộ trẻ nhất
		Scanner sc = new Scanner(System.in);
		String[] tenCB = new String[3];
		int[] namSinh = new int[3];
		String[] gioiTinh = new String[3];
		for(int i = 0; i < 3; i++) {
			System.out.println("Nhập tên cán bộ thứ " + (i+1) + ": ");
			tenCB[i] = sc.nextLine();
			System.out.println("Nhập năm sinh cán bộ thứ " + (i+1) + ": ");
			namSinh[i] = sc.nextInt();
			System.out.println("Nhập giới tính cán bộ thứ " + (i+1) + ": ");
			gioiTinh[i] = sc.nextLine();
			sc.nextLine();
		}
		
		String tenCBTreNhat = tenCB[0];
		int namSinhTreNhat = namSinh[0];
		
		for(int i = 0; i < 3; i++) {
			if(namSinhTreNhat < namSinh[i]) {
				namSinhTreNhat = namSinh[i];
				tenCBTreNhat = tenCB[i];
			}
		} 
		
		System.out.println("Cán bộ trẻ nhất là: " + tenCBTreNhat);

	}
}
