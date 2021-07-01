package XuLyMath;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class ChuongTrinhTimSoLonNhatNhoNhat {

	public static void main(String[] args) {
		double randomNumber, minNumber, maxNumber, average, sum = 0.0;
		DecimalFormat dcFormat = new DecimalFormat("#.##");
		ArrayList<Double> arrayList = new ArrayList<Double>();
		
		//sinh ra 2 số thực ngẫu nhiên trong đoạn [0,1)
		for(int i =0; i<2; i++) {
			randomNumber = Math.random();
			arrayList.add(randomNumber);
		}
		
		System.out.println("Hai số vừa được sinh ra là:");
		for(int i =0; i<arrayList.size();i++){
			System.out.println(dcFormat.format(arrayList.get(i)));
		}
		
		//tìm số nhỏ nhất
		minNumber = Math.min(arrayList.get(0), arrayList.get(1));
		System.out.println("Số nhỏ nhất trong 2 số trên là" + dcFormat.format(minNumber));
		
		//tìm số lớn nhất
		maxNumber = Math.max(arrayList.get(0), arrayList.get(1));
		System.out.println("Số lớn nhất trong 2 số trên là" +dcFormat.format(maxNumber));
		
		//tính trung bình cộng 2 số trên
		for(int i =0; i<arrayList.size();i++) {
			sum += arrayList.get(i);
		}
		average = sum/(arrayList.size());
		System.out.println("Trung bình cộng =" + dcFormat.format(average));

	}

}
