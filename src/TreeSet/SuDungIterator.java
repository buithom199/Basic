package TreeSet;

import java.util.Iterator;
import java.util.TreeSet;

public class SuDungIterator {

	public static void main(String[] args) {
		TreeSet<String> treeSet = new TreeSet<>();
		
		//thêm vào phần tử cho treeSet
		treeSet.add("C#");
		treeSet.add("Java");
		treeSet.add("PHP");
		treeSet.add("SQL");
		treeSet.add("HTML");
		treeSet.add("CSS");
		
		//Khai báo một Iterator có kiểu là String
		Iterator<String> iterator = treeSet.iterator();
		
		//hiển thị các phần tử có trong treeSet
		//bằng cách sử dụng Iterator
		System.out.println("Các phần tử có trong treeSet là:");
		while (iterator.hasNext()) {
			System.out.print(iterator.next() + "\t");
			
		}

	}

}
