package XuLyMath;

public class PhuongThucMath10 {

	public static void main(String[] args) {
		System.out.println("Ví dụ tính tan góc 45 độ");
		int goc = 45;
		
		//đưa 1 góc về radian
		double radian = Math.PI * goc /180;
		System.out.println("tan(" + goc + ")" +Math.tan(radian));
		
		//ngoài ra chúng ta có thể tính tan = sin/cos
		double tan = Math.sin(radian)/Math.cos(radian);
		System.out.println("tan(" + goc + ")=" +tan);
		

	}

}
