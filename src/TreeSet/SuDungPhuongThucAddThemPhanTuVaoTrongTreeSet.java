package TreeSet;

import java.util.Scanner;
import java.util.TreeSet;

public class SuDungPhuongThucAddThemPhanTuVaoTrongTreeSet {

	public static void main(String[] args) {
		int number;
		TreeSet<Integer> treeSetInteger = new TreeSet<>();
		Scanner scanner = new Scanner(System.in);
		
		//Thêm các phần tử vào treeSetInteger
		treeSetInteger.add(0);
		treeSetInteger.add(3);
		treeSetInteger.add(1);
		treeSetInteger.add(4);
		treeSetInteger.add(2);
		treeSetInteger.add(8);
		
		//Hiển thị các phần tử trong treeSetInteger
		System.out.println("Các phần tử trong treeSetInteger:");
		System.out.println(treeSetInteger);
		
		System.out.println("Nhập phần tử cần thêm:");
		number = scanner.nextInt();
		
		//Thêm một phần tử mới vào treeSetInteger từ bàn phím
		//nếu phần tử đó đã tồn tại thì thông báo đã tồn tại
		//ngược lại thì thêm vào
		if(!treeSetInteger.contains(number)) {
			treeSetInteger.add(number);
			System.out.print("Thêm thành công!");
			System.out.println("Các phần tử trong treeSetInteger sau khi thêm:");
			System.out.println(treeSetInteger);
		}else {
			System.out.println("Phần tử" + number + "đã tồn tại!");
		}

	}

}