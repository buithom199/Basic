package SortedSeInterface;

import java.util.ArrayList;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;

public class TrichXuatPhanTuTailSet {

	public static void main(String[] args) {
		List<Integer> listInteger = new ArrayList<>();
		
		//Thêm các phần tử vào trong listInterger
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
		
		System.out.println("Các phần tử có trong sortedsetInteger:");
		System.out.println(sortedSetInteger);
		
		//Khai báo 1 SortedSet có tên là tailset
		//Có các phần tử được trích xuất
		//Từ phần tử lớn hơn hoặc bằng
		//Phần tử fromElement đến phần tử cuối cùng của sortedsetInteger
		SortedSet<Integer> tailSet = sortedSetInteger.tailSet(5);
		System.out.println("Các phần tử có trong tailset:");
		System.out.println(tailSet);
		

	}

}
