package HashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class ThayTheCua1EntryTrongHashMap {

	public static void main(String[] args) {
		HashMap<Integer, Double> hashMap = new HashMap<Integer, Double>();
		hashMap.put(1, 9d);
		hashMap.put(4, 10.1d);
		hashMap.put(2, 7.2d);
		hashMap.put(8, 20.28d);
		
		System.out.println("Các phần tử có trong hashMap:");
		Set<Map.Entry<Integer, Double>> setMap = hashMap.entrySet();
		System.out.println(setMap);
		
		//thay thế value của entry có khóa là 4
		//thành 10.11d
		hashMap.replace(4, 10.11d);
		
		//ngoài ra chúng ta có thể thay thế như sau
		//câu lệnh bên dưới sẽ thay thế entry
		//có key là 2, value là 7.2d thành 2.7d
		hashMap.replace(2, 7.2d, 2.7d);
		
		System.out.println("Các phần tử có trong hashMap sau khi thay thế:");
		setMap = hashMap.entrySet();
		System.out.println(setMap);

	}

}
