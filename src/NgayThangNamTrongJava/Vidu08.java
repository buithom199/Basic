package NgayThangNamTrongJava;

public class Vidu08 {

	public static void main(String[] args) {
		// trả về thời gian kể ừ ngày 1/1/1970 đến nay
		//theo milli giây
		long milliSeconds = System.currentTimeMillis();
		
		//để tính giây chúng ta sẽ
		//lấy giá trị biến milliSeconds chia cho 1000L (tương ứng với số long)
		System.out.println(milliSeconds/1000L);

	}

}
