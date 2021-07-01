package HashSet;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.TreeSet;

public class SapXepCacPhanTuCuaHashSetTheoThuTuTangDan {

	public static void main(String[] args) {
		HashSet<String> hashSetString = new HashSet<>();
		
		//thêm các phần tử cho hashSetString
		hashSetString.add("Orange");
		hashSetString.add("Apple");
		hashSetString.add("Banana");
		hashSetString.add("Guava");
		hashSetString.add("Pear");
		
		System.out.print("Các phần tử có trong hashSetString trước khi sắp xếp:");
		System.out.println(hashSetString);
		
		//Cách 1: Sắp xếp HashSet sử dụng List InterFace
		List<String> listString = new ArrayList<>(hashSetString);
		Collections.sort(listString);
		System.out.println("Các phần tử có trong hashSetString sau khi sắp xếp sử dụng List:");
		System.out.println(listString);
		
		//Cách 2: Sắp xếp HashSet sử dụng TreeSet
		TreeSet<String> treeSetString = new TreeSet<>(hashSetString);
		System.out.print("Các phần tử có trong hashSetString sau khi sắp xếp sử dụng TreeSet:");
		System.out.println(treeSetString);
		

	}

}
