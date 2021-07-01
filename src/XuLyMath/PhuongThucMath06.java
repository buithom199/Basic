package XuLyMath;

public class PhuongThucMath06 {

	public static void main(String[] args) {
		System.out.println("Ví dụ tính cos góc 45 độ");
		int goc =45;
		
		//đưa 1 góc về randian
		double randian = Math.PI*goc/180;
		System.out.println("cos (" + goc +") = " + Math.cos(randian));

	}

}
