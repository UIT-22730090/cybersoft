import java.util.Scanner;

public class Bai4 {
	public static void main(String[] args) {
		// Cho biết tên và toạ độ nhà của 3 sinh viên.
		// Cho biết tọa độ của trường đại học. Hãy viết chương trình cho máy in tên
		// sinh viên ở xa trường đại học nhất
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập tọa độ của trường đại học (x, y): ");
		double truongDaiHocX = sc.nextDouble();
		double truongDaiHocY = sc.nextDouble();
		sc.nextLine();
		
		String[] tenSV = new String[3];
		double[] toaDoX = new double[3];
		double[] toaDoY = new double[3];
		
		for(int i = 0; i < 3; i++) {
			System.out.println("Nhập tên sinh viên thứ " + (i+1) + ": ");
			tenSV[i] = sc.nextLine();
			System.out.println("Nhập tọa độ X của sinh viên thứ " + (i+1) + ": ");
			toaDoX[i] = sc.nextDouble();
			System.out.println("Nhập tọa độ Y của sinh viên thứ " + (i+1) + ": ");
			toaDoY[i] = sc.nextDouble();
			sc.nextLine();
		}
		
		String tenSVXaNhat = "";
		double maxKhoangCach = 0;
		for(int i = 0; i < 3; i++) {
			// Công thức tính khoảng cách: d = sqrt((x2-x1)^2 + (y2 - y1)^2)
			double khoangCach = Math.sqrt(Math.pow(toaDoX[i] - truongDaiHocX, 2) + Math.pow(toaDoY[i] - truongDaiHocY, 2));
			if(maxKhoangCach < khoangCach) {
				maxKhoangCach = khoangCach;
				tenSVXaNhat = tenSV[i];
			}
		}
		
		System.out.println("Sinh viên ở xa trường đại học nhất là: " + tenSVXaNhat);
		
	}
}
