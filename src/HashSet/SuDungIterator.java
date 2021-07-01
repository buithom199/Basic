

package HashSet;

import java.util.HashSet;
import java.util.Iterator;

public class SuDungIterator {

	public static void main(String[] args) {
		// Khai báo 1 hashSaet có tên là hashSet
		// có kiểu là Integer
		HashSet<Integer> hashSet = new HashSet<>();
		
		//thêm các phần tử vào hashSet sử dụng phương thức add()
		hashSet.add(1);
		hashSet.add(2);
		hashSet.add(1);
		hashSet.add(6);
		
		//Khai báo một Iterator có kiểu Integer
		Iterator<Integer> iterator = hashSet.iterator();
		
		//Hiển thị các phần tử có trong linkedList
		//bằng cách sử dụng Iterator
		System.out.println("Các phần tử có trong hashSet là:");
		while (iterator.hasNext()) {
			System.out.print(iterator.next());
			
		}

	}

}
