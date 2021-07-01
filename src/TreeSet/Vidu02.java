package TreeSet;

import java.util.Iterator;
import java.util.TreeSet;

public class Vidu02 {

	public static void main(String[] args) {
		TreeSet<String> treeSetColors = new TreeSet<>();
		
		treeSetColors.add("Red");
		treeSetColors.add("Green");
		treeSetColors.add("Black");
		treeSetColors.add("Pink");
		treeSetColors.add("Orange");
		treeSetColors.add("Green");
		
		System.out.println("Các phần tử trong treeSetColors trước khi đảo ngược:"
				+ treeSetColors);
		
		//Đảo ngược các phần tử trong treeSetColors
		//Sử dụng phương thức descendingInterator()
		//Kết quả của phương thức sẽ trả về 1 Iterator
		Iterator<String> iterator = treeSetColors.descendingIterator();
		
		System.out.println("Các phần tử trong treeSetColors sau khi đảo ngược:");
		while (iterator.hasNext()) {
			System.out.println(iterator.next() + "\t");
			
		}

	}

}
