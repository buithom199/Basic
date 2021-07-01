package HashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import javax.activation.MailcapCommandMap;

public class VongLapForHienThiCacPhanTuCoTrongHashMap {

	public static void main(String[] args) {
		// Khai báo 1 HashMap có tên là hashMap
		// kiểu dữ liệu của key và value là String
		HashMap<String, String> hashMap = new HashMap<>();
		
		//Thêm value vào trong hashMap vói key tương ứng
		//Sử dụng phương thức put()
		//Đối số thứ nhất trong put là key có kiểu là String
		//Và đối số thứ hau là value có kiểu là String
		hashMap.put("CSDL", "Cơ sở dữ liệu");
		hashMap.put("C++", "C++");
		hashMap.put("C#", "C sharp");
		hashMap.put("PHP", "PHP");
		hashMap.put("Java", "Java");
		
		//Tạo 1 set có 1 Set có tên là setHashMap
		//Chứa toàn bộ các entry (vừa key vừa value)
		//của hashmap
		Set<Map.Entry<String, String>> setHashMap = hashMap.entrySet();
		
		System.out.println("Các entry có trong setHashMap:");
		System.out.println(setHashMap);

	}

}
