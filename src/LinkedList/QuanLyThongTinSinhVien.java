package LinkedList;

import java.util.AbstractSequentialList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class QuanLyThongTinSinhVien {


	private static AbstractSequentialList<String> svDiemCao;
	private static AbstractSequentialList<String> svCanTim;

	public static void main(String[] args) {
		String tenSinhVien, thongTin = null;
		
		//Mảng lưu trữ thông tin sinh viên
		String arrThongTin[];
		double diemSinhVien;
		
		//Lưu trữ danh sách sinh viên
		LinkedList<String> danhSachSV = new LinkedList<>();
		
		//Lưu trữ danh sách sinh sản thi lại
		LinkedList<String> svThiLai = new LinkedList<>();
		
		Scanner scanner = new Scanner(System.in);
		
		//thêm danh sách sinh viên
		//nếu tên sinh viên khác rỗng thì còn nhập
		//ngược lại không nhập
		do {
			System.out.println("Nhập vào tên sinh viên:");
			tenSinhVien = scanner.nextLine();
			if(!tenSinhVien.isEmpty()) {
				System.out.println("Nhâp vào điểm sinh viên");
				diemSinhVien = Double.parseDouble(scanner.nextLine());
				thongTin = tenSinhVien + "\t" + diemSinhVien;
				danhSachSV.add(thongTin);
			}
		}while(!tenSinhVien.isEmpty());//khi tên còn khác rỗng thì còn nhập
		
		//hiển thị số sinh viên
		//và thông tin của các sinh viên có trong danh sách
		System.out.println("Số sinh viên có trong danh sách=" + (danhSachSV.size()));
		System.out.println("Thông tin của các sinh viên vừa nhập là:");
		System.out.println("Tên sinh viên\t Điểm");
		Iterator<String> iterator = danhSachSV.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
			
		}
		
		//Đếm số sinh viên phải thi lại
		//Và lưu thông tin những sinh viên đó vào trong svThiLai
		for(int i =0; i<danhSachSV.size(); i++) {
			//Lấy sinh viên tại vị trí i trong danhsachSV
			String sv = danhSachSV.get(i);
		
		
		//Chuyển đổi chuỗi sv thành mảng
		//mảng arrThong6Tin sẽ chứa tên và điểm của sinh viên đó
		arrThongTin = sv.split("\t");
		
		//arrThongTin[1] sẽ tương ứng với điểm của sinh viên
		//vì nó có kiểu là String nên phải ép kiểu về Double
		//sau đó gán vào biến point
		double point = Double.parseDouble(arrThongTin[1]);
		
		//nếu point <=5 thì sẽ thêm sinh viên đó
		//vào trong svThiLai
		if(point <=5) {
			svThiLai.add(sv);
		}

	}
		if(svThiLai.isEmpty()) {
			System.out.println("Không có sinh viên phải thi lại!");
		}else {
			System.out.println("Số sinh viên phải thi lại" +(svThiLai.size()));
			System.out.println("Thông tin của các sinh viên phải thi lại là:");
			System.out.println("Tên sinh viên\t Điểm");
			iterator = svThiLai.iterator();
			while (iterator.hasNext()) {
				System.out.println( iterator.next());
				
			}
			
		}
		
		
	//số điểm lớn nhất
		double maxTemp =0;
		
		//chỉ số của phần tử
		int i = 0;
		
		//Tìm điểm lớn nhất trong danh sách
		while(i<danhSachSV.size()) {
			arrThongTin = danhSachSV.get(i).split("\t");
			
			//nếu điểm của sinh viên có chỉ số i trong danh sách SV
			//lớn hơn hoặc bằng số diểm lớn nhất maxTemp
			//thì sẽ gắn maxTemp bằng điểm của sinh viên đó
			//và tăng i lên 1 sau đó quay lại vòng lặp while
			if(Double.parseDouble(arrThongTin[1]) >= maxTemp) {
				maxTemp = Double.parseDouble(arrThongTin[1]);
			}
		
		i++;
}
	//tìm sinh viên có điểm cao nhất
	i = 0;
	while(i < danhSachSV.size()) {
		arrThongTin = danhSachSV.get(i).split("\t");
		//duyệt trong danhsach SV
		//nếu có sinh viên nào có số diểm bằng với maxTemp
		//thì sẽ thêm sinh viên đó vào trong svDiemCao
		if(Double.parseDouble(arrThongTin[1]) == maxTemp) {
			svDiemCao.add(danhSachSV.get(i));
		}
		i++;
		}
	
	System.out.println("Thông tin của các sinh viên có điểm cao nhất là");
	System.out.println("Tên sinhvien\t Điểm");
	iterator = svDiemCao.iterator();
	while (iterator.hasNext()) {
		System.out.println( iterator.next());
		
	}
	
	//Tìm kiếm theo tên sinh viên
	System.out.println("Nhập tên sinh viên cần tìm:");
	String search = scanner.nextLine();
	
	i=0;
	while(i<danhSachSV.size()) {
		//tách thông tin của sinh viên thứ i trong danh sách SV
		//thành 2 mảng lư trữ tên và điểm số sinh viên
		arrThongTin = danhSachSV.get(i).split("\t");
		
		//lấy tên sinh viên trong mảng arrThongTin
		//tên sẽ tương ứng với phần tử thứ 0 trong mảng
		tenSinhVien = arrThongTin[0];
		
		//so sánh tên sinh viên cần tìm tới tenSinhVien
		//nếu trùng nhau thì sẽ thêm sinh viên đó vào trong sv cần tìm
		if(search.equalsIgnoreCase(tenSinhVien)) {
			svCanTim.add(danhSachSV.get(i));
		}
		i++;//tăng i lên 1 và quay lại đầu vòng lặp
	}
	System.out.println("Thông tin của các sinh viên tên là" + search + ":");
	System.out.println("Tên sinh viên\t Điểm");
	iterator = svCanTim.iterator();
	while(iterator.hasNext()) {
		System.out.println(iterator.next());
	}
	
	}
}