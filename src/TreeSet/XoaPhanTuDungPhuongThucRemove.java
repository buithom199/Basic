package TreeSet;

import java.util.Scanner;
import java.util.TreeSet;

public class XoaPhanTuDungPhuongThucRemove {

	public static void main(String[] args) {
		double number;
		TreeSet<Double> treeSetDouble = new TreeSet<>();
		Scanner scanner = new Scanner(System.in);
		
		//Thêm các phần tử vào treeSetDouble
		treeSetDouble.add(0.5d);
		treeSetDouble.add(8.33d);
		treeSetDouble.add(1.2d);
		
		//Hiển thị các phần tử trong treeSetDouble
		System.out.println("Các phần tử trong treeSetDouble:");
		System.out.println(treeSetDouble);
		
		System.out.println("Nhập phần tử cần xóa");
		number = scanner.nextDouble();
		
		//nếu phần tử cần xóa
		//có tồn tại treeSetDouble thì sẽ thông báo xóa thành công
		//và hiển thị các phần tử còn lại
		//ngược lại thông báo xóa không thành công
		if(treeSetDouble.contains(number)) {
			treeSetDouble.remove(number);
			System.out.println("Xóa thành công!");
			System.out.println("Các phần tử còn lại trong treeSetDouble:");
		}else {
			System.out.println("Xóa không thành công!");
		}

	}

}
