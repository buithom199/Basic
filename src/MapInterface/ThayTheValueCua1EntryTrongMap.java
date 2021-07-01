package MapInterface;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class ThayTheValueCua1EntryTrongMap {

	public static void main(String[] args) {
		Map<String, String> mapCity = new TreeMap<>();
		mapCity.put("QNg", "Quảng Ngãi");
		mapCity.put("QN", "Quảng Nam");
		mapCity.put("BD", "Bình Định");
		mapCity.put("HCM", "TP Hồ Chí Minh");
		
		System.out.println("Danh sách các thành phố trong mapCity");
		Set<Map.Entry<String, String>> setCity = mapCity.entrySet();
		System.out.println(setCity);
		
		//thay thế value của entry có khóa là QN
		//thành Quảng Ninh
		mapCity.replace("QN", "Quảng Ninh");
		
		//Ngoài ra chúng ta có thể thay thế như sau
		//Câu lệnh bên dưới sẽ thay thế entry
		//Có key là BD, value là Bình Định thành Bình Dương
		mapCity.replace("BD", "Bình Định", "Bình Dương");
		
		System.out.println("Danh sách các thành phố trong mapCity sau khi thay thế:");
		System.out.println(setCity);

	}

}
