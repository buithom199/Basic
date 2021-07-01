package XuLySoLieuTrongJaVa;

import java.text.NumberFormat;
import java.util.Locale;

public class DinhDangTienTe {

	public static void main(String[] args) {
		double currency = 101.999f;
		
		//định dạng tiền tệ của khu vực mặc định của máy ảo JVN
		//khu vực mặc định này là nước Mỹ
		//nên đơn vị của tiền tệ sẽ là $
		NumberFormat currencyFormat = NumberFormat.getCurrencyInstance();
		String string = currencyFormat.format(currency);
		System.out.println("Số" + currency + "sau khi định dạng =" + string);
		long vnd = 10000000L;
		
		//tạo 1 NumberFormat để định dạng tiền tệ theo tiêu chuẩn của Viet Nam
		//đơn vị tiền tệ của VietNam là đồng
		Locale localeVN = new Locale("vi", "VN");
		NumberFormat currencyVN = NumberFormat.getCurrencyInstance(localeVN);
		String string2 = currencyVN.format(vnd);
		System.out.println("Số" + vnd +" sau khi định dạng =" + string2);
		

	}

}
