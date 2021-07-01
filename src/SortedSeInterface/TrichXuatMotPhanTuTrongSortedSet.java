package SortedSeInterface;

import java.util.ArrayList;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;

public class TrichXuatMotPhanTuTrongSortedSet {

	public static void main(String[] args) {
		List<Integer> listInteger = new ArrayList<Integer>();
		
		// Thêm các phần tử vào trong
		listInteger.add(2);
		listInteger.add(4);
		listInteger.add(3);
		listInteger.add(5);
		listInteger.add(6);
		listInteger.add(8);
		listInteger.add(7);
		listInteger.add(0);
		listInteger.add(9);
		
		//Khai báo 1 sotedSet Interface có kiểu là Interger
		//Có các phần tử là các phần tử của listInteger
		SortedSet<Integer> sortedsetInteger = new TreeSet<>(listInteger);
		
		System.out.println("Các phần tử có trong sortedsetInteger:");
		System.out.println(sortedsetInteger);
		
		//khai báo 1 sotedSet có tên là subset
		//có các phần tử được trích xuất
		//trong đoạn [3,7] của sortedsetInteger
		SortedSet<Integer> subset = sortedsetInteger.subSet(3, 7);
		System.out.println("Các phần tử có trong sunset:");
		System.out.println(subset);
		
		
		//Nếu phần tử đầu và phần tử cuối bằng nhau 
		//thì kết quả của phương thức subSet()
		//sẽ trả về subset không có phần tử nào
		subset = sortedsetInteger.subSet(3, 3);
		System.out.println("Các phần tử có trong subset:");
		System.out.println(subset);
		
		

	}

}
