package MapInterface;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class SuDungIteratorLayToanBoCacEntryCuaMap {

	public static void main(String[] args) {
		Map<String, String> mapLanguges = new TreeMap<>();
		mapLanguges.put("CSLT", "Cơ sở lập trình");
		mapLanguges.put("C++", "C++");
		mapLanguges.put("C#", "C sharp");
		mapLanguges.put("PHP", "PHP");
		mapLanguges.put("Java", "Java");
		
		//Sử dụng Iterator để lấy toàn bộ entry của Mapp
		//Vì 1 entry toàn bộ key và value
		//nên kiểu dữ liệu của Iterator
		//bao gồm kiểu dữ liệu của key và value
		Iterator<Map.Entry<String, String>>iterator = mapLanguges.entrySet().iterator();
		
		System.out.println("Các entry có trong mapLanguages là:");
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}

	}

}
