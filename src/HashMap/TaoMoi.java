package HashMap;

import java.util.HashMap;
import java.util.TreeMap;

public class TaoMoi {

	public static void main(String[] args) {
		// khai báo 1 hashMap ten hashMap1
		//mỗi phần tử trong hashMap1 bao gồm 2 phần
		//key (integer) và  value (Float)
		HashMap<Integer, Float> hashMap1 = new HashMap<>();
		
		//Khai báo 1 hashMap tên hashMap2
		//Mỗi phần tử trong hashMap2 bao gồm 2 phần
		//key (String) và value (String)
		//có kích thuco71 khởi tạo =10
		HashMap<String, String> hashMap2 = new HashMap<>(10);
		
		//Khai báo 1 HashMap có kích thước khởi tạo =4
		//và yếu tố tải = 0.75f (mặc định)
		//Chi tiết về khích thước khởi tạo và yếu tố tải
		//xem lại bài HashSet
		HashMap<Double, Double> hashMap3 = new HashMap<>(4, 0.75f);
		
		//Khai báo 1 HasMap được tạo thành từ 1 collection khác
		HashMap<Float, Integer> hashMap4 = new HashMap<>(new TreeMap<>());

	}

}
