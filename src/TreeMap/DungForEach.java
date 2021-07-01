package TreeMap;

import java.util.TreeMap;

public class DungForEach {

	public static void main(String[] args) {
		TreeMap<Integer, Integer> treeMap = new TreeMap<Integer, Integer>();
		treeMap.put(0, 6);
		treeMap.put(1, 5);
		treeMap.put(2, 4);
		treeMap.put(3, 3);
		treeMap.put(4, 2);
		treeMap.put(5, 1);
		
		//Cách duyệt treeMap với forEach() trong java8
		//dối dố thứ nhất bên trong forEach là key
		//dối số thứ hai bên trong forEach là value
		System.out.println("Các entry có trong treeMap là:");
		treeMap.forEach((keyInt, valueInt) ->System.out.println(
				"Key=" + keyInt +", value = " + valueInt));

	}

}
