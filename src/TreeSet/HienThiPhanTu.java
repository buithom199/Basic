package TreeSet;

import java.util.HashSet;
import java.util.TreeSet;

public class HienThiPhanTu {

	public static void main(String[] args) {
		// Khai báo 1 TreeSet có tên là treeSetChracter
		//được tạo thành từ 1 class Cllection khác
		TreeSet<Character> treeSetCharacter = new TreeSet<>(new HashSet<>());
		
		//Thêm các phần tử vào trong treeSetCharacter
		//sử dụng phương thức add()
		treeSetCharacter.add('R');
		treeSetCharacter.add('A');
		treeSetCharacter.add('B');
		treeSetCharacter.add('R');
		
		//Hiển thị các phần tử có trong treeSetCharacter
		//trong treeSetCharacter có 2 phần tử là 'R'
		//mà các phần tử trong treeSetCharacter là không trùng hau
		//nên sẽ chỉ có 1 phần tử 'R' được hiển thị
		//các phần tử trong treeSetCharacter
		//mặc định được sắp xếp theo thứ tự tăng dần
		System.out.println("Các phần tử có trong treeSetCharacter là" + treeSetCharacter);

	}

}
