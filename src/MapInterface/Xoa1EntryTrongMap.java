package MapInterface;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import javax.security.auth.kerberos.KerberosKey;

public class Xoa1EntryTrongMap {

	public static void main(String[] args) {
		Map<String, String> mapCity = new TreeMap<>();
		mapCity.put("QNg", "Quảng Ngãi");
		mapCity.put("QN", "Quảng Nam");
		mapCity.put("BD", "Bình Định");
		mapCity.put("HCM", "TP Hồ Chí Minh");
		
		System.out.println("Danh sách các thành phố trong mapCity");
		Set<Map.Entry<String, String>> setCity = mapCity.entrySet();
		System.out.println(setCity);
		
		//xóa entry có khóa là QN ra khỏi mapCity
		//sử dụng phương thức remove()
		mapCity.remove("QN");
		
		System.out.println("Danh sách các thành phố trong mapCity sau khi xóa");
		System.out.println(setCity);

	}

}
