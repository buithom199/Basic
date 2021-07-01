package MapInterface;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class LayToanBoKeyMapKeSet {

	public static void main(String[] args) {
		Map<String, String> mapLanguages = new TreeMap<>();
		mapLanguages.put("CSLT", "Cơ sở lập trình");
		mapLanguages.put("C++", "C++");
		mapLanguages.put("C#", "C Sharp");
		mapLanguages.put("PHP", "PHP");
		mapLanguages.put("Java", "Java");
		
		//Sử dụng Iterator để lấy toàn bộ key của Map
		//thông qua phương thức keySet()
		//vì các key có kiểu String
		//nên iterator cũng có kiểu là String
		Iterator<String> iterator = mapLanguages.keySet().iterator();
		
		System.out.println("Key có trong mapLanguages là:");
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
			
		}

	}

}
