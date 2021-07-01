package TreeMap;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class LayDuLieuValueTrongTreeMapKhiBietDuocKey {

	public static void main(String[] args) {
		TreeMap<Integer, String> treeMap = new TreeMap<Integer, String>();
		treeMap.put(2,"Two");
		treeMap.put(1,"One");
		treeMap.put(4,"Four");
		treeMap.put(5,"Five");
		treeMap.put(3,"Three");
		
		System.out.println("Danh sách các entry trong treeMap");
		Set<Map.Entry<Integer, String>> setTreeMap = treeMap.entrySet();
		System.out.println(setTreeMap);
		
		//lấy entry có key =3
		//và hiển thị value
		System.out.println("3:" + treeMap.get(3));
		
		//lấy entry có key =7
		//vì trong treeMap không có key=7
		//nên sẽ hiển thị giá trị null
		System.out.println("7" + treeMap.get(7));
		
		//Để kiểm tra xem 1 value có trong TreeMap hay không
		//chug1 ta sẽ dùng phương thức containsValue()
		if(treeMap.containsKey("Two")) {
			System.out.println("Có Two trong treeMap");
		}

	}

}
