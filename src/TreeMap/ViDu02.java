package TreeMap;

import java.util.TreeMap;

public class ViDu02 {

	public static void main(String[] args) {
		TreeMap<Float, Double> treeMap = new TreeMap<Float, Double>();
		treeMap.put(1.5f,5.1d);
		treeMap.put(3.23f, 3.32d);
		treeMap.put(1.16f,6.11d);
		treeMap.put(7f, 8d);
		treeMap.put(7.25f,0.4d);
		
		//Tìm khóa nhỏ nhất lớn hơn bằng 1.5f
		System.out.println("Khóa cần tìm=" +treeMap.ceilingKey(1.5f));
		
		//Tìm khóa nhỏ nhất lớn hơn bằng 1.5f
				System.out.println("Khóa cần tìm=" +treeMap.ceilingKey(1.5f));
				
				//Tìm khóa nhỏ nhất lớn hơn bằng 6.9f
				System.out.println("Khóa cần tìm=" +treeMap.ceilingKey(6.9f));
				
				//Tìm khóa nhỏ nhất lớn hơn bằng 7.26f
				//kết quả sẽ trả về null
				System.out.println("Khóa cần tìm=" +treeMap.ceilingKey(7.26f));

	}

}
