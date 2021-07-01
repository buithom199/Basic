package XuLyMath;

public class ChuongTrinhHienThiNgauNhien1KyTuInHoa {

	public static void main(String[] args) {
		//n là mã ASCII của ký tự in hoa từ A..Z
		//Math.randon() trả về 1 giá trị double ngẫu nhiên nằm trong khoảng [0.0...1.0)
		//ví dụ giả sử Math.randon() sinh ra số double = 0.0
		// thì n =65 + 0.0 *26 =65 (mã ASCII của ký tự A)
		int n = (int) (65 + Math.random()*26);
		
		//tìm ký tự ứng với mã ASCII tương ứng
		char ktUpper = (char) n;
		System.out.println("Khý tự in hoa là" + ktUpper);
		

	}

}
