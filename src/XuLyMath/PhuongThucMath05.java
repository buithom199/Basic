package XuLyMath;

public class PhuongThucMath05 {

	public static void main(String[] args) {
		System.out.println("Ví dụ sin góc 90 độ");
		int goc = 90;
		
		//đưa 1 góc về radian
		double randian = Math.PI * goc/180;
		System.out.println("sin(" + goc + ") = " + Math.sin(randian));
	}

}
