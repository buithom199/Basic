package TreeSet;

import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

public class Vidu01 {

	public static void main(String[] args) {
		TreeSet<Integer> treeSetInteger = new TreeSet<>();
		
		//tạo 1 sortedset chứa các phần tử nhỏ hơn 7 của TreeSet
		SortedSet<Integer> treeHeadSet = new TreeSet<>();
		
		//Thêm phần tử vào trong treeSetInteger
		treeSetInteger.add(0);
		treeSetInteger.add(1);
		treeSetInteger.add(2);
		treeSetInteger.add(3);
		treeSetInteger.add(4);
		treeSetInteger.add(5);
		treeSetInteger.add(6);
		treeSetInteger.add(7);
		treeSetInteger.add(8);
		treeSetInteger.add(9);
		treeSetInteger.add(10);
		
		//tìm các phần tử nhỏ hơn 7
		//sử dụng phương thức headSet()
		treeHeadSet = treeSetInteger.headSet(7);
		
		//Hiển thị các phần tử trong treeHeadSet
		//sử dụng Iterator
		Iterator<Integer> iterator = treeHeadSet.iterator();
		System.out.println("Các phần tử nhỏ hơn 7 là:");
		while (iterator.hasNext()) {
			System.out.print(iterator.next() + "\t");
			
		}
		

	}

}
