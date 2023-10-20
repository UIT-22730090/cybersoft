package Bai1;

public class PhuongTrinhBac2 {
	double a, b, c;

	public PhuongTrinhBac2() {
		super();
	}

	public PhuongTrinhBac2(double a, double b, double c) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
	}

	public double getA() {
		return a;
	}

	public void setA(double a) {
		this.a = a;
	}

	public double getB() {
		return b;
	}

	public void setB(double b) {
		this.b = b;
	}

	public double getC() {
		return c;
	}

	public void setC(double c) {
		this.c = c;
	}
	
	// Phương thức tính Delta
	public double tinhDelta() {
		return b * b - 4 * a * c;
	}
	
	// Phương thức tính nghiệm phương trình
	public void tinhNghiemPhuongTrinh() {
		double delta = tinhDelta();
		
		if(a == 0) {
			if(b == 0 && c == 0) {
				System.out.println("Phương trình vô số nghiệm.");
			} else if(b == 0 && c != 0) {
				System.out.println("Phương trình vô nghiệm.");
			} else if(b != 0) {
				System.out.println("Phương trình có nghiệm: " + (-c / b));
			}
		} else {
			if(delta < 0) {
				System.out.println("Phương trình vô nghiệm.");
			} else if(delta == 0) {
				System.out.println("Phương trình có 2 nghiệm kép: " + (-b / (2 * a)));
			} else {
				double x1 = (-b +Math.sqrt(delta)) / (2 * a);
				double x2 = (-b -Math.sqrt(delta)) / (2 * a);
				System.out.println("Phương trình có 2 nghiệm phân biệt: ");
				System.out.println("x1 = " + x1);
				System.out.println("x2 = " + x2);
			}
		}
		
	}
	

}
