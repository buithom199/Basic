package SortedSeInterface;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;

public class PhanTuNhoNhatLonNhatTrongSortedSet {

	public static void main(String[] args) {
		List<Integer> listInteger = new ArrayList<>();
		
		//Thêm các phần tử vào trong listInteger
		listInteger.add(2);
		listInteger.add(4);
		listInteger.add(1);
		listInteger.add(3);
		listInteger.add(6);
		listInteger.add(5);
		listInteger.add(9);
		listInteger.add(7);
		listInteger.add(0);
		listInteger.add(8);
		
		SortedSet<Integer> sortedSetInteger = new TreeSet<>(listInteger);
		
		System.out.println("Các phần tử có trong sortedInteger");
		System.out.println(sortedSetInteger);
		
		//Tìm phần tử lớn nhất và nhỏ nhất trong sortedsetInteger
		int phanTuLonNhat = sortedSetInteger.last();
		int phanTuNhoNhat = sortedSetInteger.first();
		System.out.println("Phần tử lớn nhất và nhỏ nhất trong" + "sortedsetInteger là" + phanTuLonNhat + "và" + phanTuNhoNhat);

	}

}
