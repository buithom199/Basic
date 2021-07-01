package XuLySoLieuTrongJaVa;

import java.text.DecimalFormat;

public class ViDu01 {

	public static void main(String[] args) {
		//định dạng số với 2 chữ số thập phân
		DecimalFormat dcFormat = new DecimalFormat("#.##");
		//đổi quảng dường km ra m
		double quangDuong = 120 * 1000;
		//đổi giờ ra giây
		double thoiGian = 1 *60 + 40 *60 + 35;
		//tính vận tốc
		double vanToc = quangDuong/thoiGian;
		System.out.println("Vận tốc của người đó = " + dcFormat.format(vanToc) +"m/s");
				

	}

}
