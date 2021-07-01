package SortedSeInterface;

import java.util.ArrayList;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;

public class TrichXuat1PhanTuHeadSet {

	public static void main(String[] args) {
		List<Integer> listInteger = new ArrayList<Integer>();
		
		//Thêm các phần tử vào trong listInteger
		listInteger.add(2);
		listInteger.add(1);
		listInteger.add(4);
		listInteger.add(3);
		listInteger.add(6);
		listInteger.add(5);
		listInteger.add(8);
		listInteger.add(7);
		listInteger.add(0);
		listInteger.add(9);
		
		//Khai báo 1 SortedSet Interface có kiểu là Integer
		//có các phần tử là các phần tử của listInteger
		SortedSet<Integer> sortedSetInteger = new TreeSet<>(listInteger);
		
		System.out.println("Các phần tử có trong sortedsetInteger");
		System.out.println(sortedSetInteger);
		
		//Khai báo 1 sortedSet có tên headset
		//Có các phần tử được trích xuất
		//từ phần tử đầu tiên đến
		//phần tử đứng trước phần tử 5 trong sortedsetInteger
		SortedSet<Integer> headSet = sortedSetInteger.headSet(5);
		System.out.println("Các phần tử có trong headset");
		System.out.println(headSet);

	}

}
