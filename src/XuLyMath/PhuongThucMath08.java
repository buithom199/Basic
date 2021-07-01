package XuLyMath;

public class PhuongThucMath08 {

	public static void main(String[] args) {
		System.out.println("Ví dụ tính sin gốc 90 độ");
		int goc = 90;
		
		//đưa 1 góc về radian
		double radian = Math.PI*goc/180;
		System.out.println("sin(" + goc + ")=" +Math.sin(radian));

	}

}
