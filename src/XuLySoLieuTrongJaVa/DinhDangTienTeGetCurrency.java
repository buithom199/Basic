package XuLySoLieuTrongJaVa;

import java.text.NumberFormat;
import java.util.Locale;

public class DinhDangTienTeGetCurrency {

	public static void main(String[] args) {
		double currency = 101.999f;
		NumberFormat currencyFormat = NumberFormat.getCurrencyInstance();
		String string = currencyFormat.format(currency);
		System.out.println("Số" + currency + "sau khi định dạng =" + string);
		System.out.println("Kiểu đơn vị tiền tệ của" + System.getProperty("user.country")
		+ "là" + currencyFormat.getCurrency());
		
		long vnd = 10000000L;
		
		Locale localeVN = new Locale("vi","VN");
		NumberFormat currencyVN = NumberFormat.getCurrencyInstance(localeVN);
		String string2 = currencyVN.format(vnd);
		System.out.println("Số" + vnd + "sau khi định dạng=" +string2);
		System.out.println("Kiểu đơn vị tiền tệ của" + localeVN.getCountry()
		+ "là" + currencyVN.getCurrency());

	}

}
