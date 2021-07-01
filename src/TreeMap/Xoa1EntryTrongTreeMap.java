package TreeMap;

import java.util.TreeMap;

public class Xoa1EntryTrongTreeMap {

	public static void main(String[] args) {
		TreeMap<Double, Float> treeMap = new TreeMap<Double, Float>();
		treeMap.put(6.8d, 8.6f);
		treeMap.put(1.2d, 2.1f);
		treeMap.put(0.04d, 4f);
		treeMap.put(5.1d, 1.5f);
		treeMap.put(3.227d, 7.23f);
		
		System.out.println("Các entry trong treeMap:");
		treeMap.forEach((keyInt, valueInt) ->System.out.println(
				"Key=" +keyInt + ", value=" + valueInt));
		
		//Xóa entry có khóa bằng 0.04d ra khỏi treeMap
		//Sử dụng phương thức remove()
		treeMap.remove(0.04d);
		
		System.out.println("Các entry trong treeMap sau khi xóa:");
		treeMap.forEach((keyInt, valueInt)->System.out.println(
				"Key=" + keyInt + ", value=" + valueInt));

	}

}
