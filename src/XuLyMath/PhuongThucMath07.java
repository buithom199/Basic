package XuLyMath;

public class PhuongThucMath07 {

	public static void main(String[] args) {
		System.out.println("Ví dụ tính tan góc 45 độ");
		int goc = 45;
		
		//đưa 1 góc về randian
		double randian = Math.PI*goc/180;
		System.out.println("tan(" + goc + ")=" +Math.tan(randian));
		
		//ngoài ra chúng ta có thể tính tan = sin/cos
		double tan = Math.sin(randian)/Math.cos(randian);
		System.out.println("tan(" + goc +")" + tan);

	}

}
