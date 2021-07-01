package MapInterface;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class LayToanBoValueCuaMapPhuongThucValue {

	public static void main(String[] args) {
	 Map<String, String> mapLanguages = new TreeMap<>();
	 mapLanguages.put("C++", "C++");
	 mapLanguages.put("C#", "C Sharp");
	 mapLanguages.put("PHP", "PHP");
	 mapLanguages.put("Java","Java");
	 
	 //Sử dụng Iterator để lấy toàn bộ value của Map
	 //Thông qua phương thức values()
	 //Vì các value có kiểu là String
	 //Nên iterator cũng có kiểu là String
	 
	 Iterator<String> iterator = mapLanguages.values().iterator();
	 
	 System.out.println("Value có trong mapLanguages là");
	 while(iterator.hasNext()) {
		 System.out.println(iterator.next());
	 }
	 

	}

}
