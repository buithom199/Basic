package TreeSet;

import java.util.SortedSet;
import java.util.TreeSet;

public class PhuongThucTailSet {

	public static void main(String[] args) {
		TreeSet<Float> treeSetFloat = new TreeSet<>();
		
		//thêm các phần tử vào trong TreeSet
		treeSetFloat.add(2.45f);
		treeSetFloat.add(1.9f);
		treeSetFloat.add(4.6f);
		treeSetFloat.add(3.20f);
		treeSetFloat.add(6.3f);
		treeSetFloat.add(5.17f);
		
		System.out.println("Các phần tử có trong treesetFloat");
		System.out.println(treeSetFloat);
		
		//khai báo 1 SortedSet có tên là tailset
		//có các phần tử được trích xuất
		//từ phần tử lớn hơn mặt bằng
		//phần tử 4,6f đến phần tử cuối cùng của treeSetFloat
		SortedSet<Float> tailset = treeSetFloat.tailSet(4.6f);
		System.out.println("Các phần tử có trong tailset:");
		System.out.println(tailset);

	}

}
