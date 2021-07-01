package TreeMap;

import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class HienThiToanBoCacEntryCuaTreeMap {

	public static void main(String[] args) {
		// Khai báo 1 treeMap có tên là treeMap
		//Kieu dữ liệu của key là Integer
		//va value của Character
		TreeMap<Integer, Character> treeMap = new TreeMap<>();
		
		//Thêm value vào trong treeMap với key tương ứng
		//Sử dụng phương thức put()
		//đối số thứ nhất trong put là key có kiểu là Integer
		//và đối số thứ hai là value có kiểu là Character
		treeMap.put(6,'A');
		treeMap.put(5,'B');
		treeMap.put(1,'C');
		treeMap.put(2,'D');
		treeMap.put(8,'E');
		
		//tạo 1 Set có tên là setTreeMap
		//chứa toàn bộ các entry (vừa key vừa value)
		//của treeMap
		Set<Entry<Integer, Character>> setTreeMap = treeMap.entrySet();
		
		//các entry trong setTreeMap sẽ được sắp xếp tăng dần theo khóa
		System.out.println("Các entry có trong setTreeMap:");
		System.out.println(setTreeMap);

	}

}
