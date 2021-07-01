package TreeMap;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.TreeMap;

import javax.swing.Spring;

public class ThemDuLieuVaoTrongTreeMap {

	public static void main(String[] args) {
		TreeMap<String, Float> treeMap = new TreeMap<String, Float>();
		Scanner scanner = new Scanner(System.in);
		String tenTinhThanh;
		float dienTich;
		
		//thêm thông tin của các tỉnh thành
		//vào trong treeMap
		//trong đó key là tên tỉnh, còn value là diện tích của tỉnh đó
		for(int i =1; i<=2; i++) {
			System.out.print("Nhập thông tin của tỉnh thành thứ" + i);
			System.out.println("Nhập tên tỉnh thành");
			tenTinhThanh = scanner.nextLine();
			System.out.print("Nhập diện tích:");
			dienTich = Float.parseFloat(scanner.nextLine());
			treeMap.put(tenTinhThanh, dienTich);
		}
		
		//Hiển thị danh scah1 tỉnh thành sử dụng Iterator
		System.out.println("Thông tin tỉnh thành vừa nhập:");
		System.out.println("Tên tỉnh thành\tDiện tích");
		Iterator<Map.Entry<String, Float>> iterator = treeMap.entrySet().iterator();
		while (iterator.hasNext()) {
			//Tạo 1 entry
			Map.Entry<String, Float> entry = iterator.next();
			System.out.println(entry.getKey() + "\t\t" + entry.getValue());
			
		}
		
		//Thêm 1 tỉnh thành mới vào trong treeMap
		//nếu tên tỉnh thành đó đã tồn tại thì thông báo tên đã tồn tại
		//ngược lại thì mới nhập diện tích
		//và thêm vào bình thường sau đó thông báo "Thêm thành công"
		System.out.println("Nhập tên tỉnh thành cần thêm");
		String tenTinhThanhMoi = scanner.nextLine();
		
		//phương thức containsKey() sẽ kiểm tra tên tỉnh thành mới nhập vào
		//có tồn tại trong treeMap hay chưa
		if(treeMap.containsKey(tenTinhThanhMoi)) {
			System.out.println("Tên tỉnh thành=" + tenTinhThanhMoi + "đã tồn tại!");
		}else {
			System.out.print("Nhập diện tích của tỉnh thành");
			float dienTichMoi = scanner.nextFloat();
			
			treeMap.put(tenTinhThanhMoi, dienTichMoi);
			System.out.println("Thông tin các tỉnh thành sau khi thêm");
			System.out.println("Mã tỉnh thành\tTên tỉnh thành");
			iterator = treeMap.entrySet().iterator();
			while (iterator.hasNext()) {
				Map.Entry<String, Float> entry = iterator.next();
				System.out.println(entry.getKey()+"\t\t" + entry.getValue());
			}
		}

	}

}
