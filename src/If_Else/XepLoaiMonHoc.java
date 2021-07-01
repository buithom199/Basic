package If_Else;

import java.text.DecimalFormat;
import java.util.Scanner;

public class XepLoaiMonHoc {
	
	public static void main(String[] args) {
		double diemKiemTraHS1, diemKiemTraHS2, diemThi, diemTrungBinh;
		String ketQuaXepLoai;

		
		Scanner scanner = new Scanner(System.in);
		DecimalFormat decimalFormat = new DecimalFormat("#.#");
		
		System.out.println("Nhập vào điểm kiểm tra hệ số 1:");
	    diemKiemTraHS1 = scanner.nextDouble();
	    System.out.println("Nhập vào điểm kiểm tra hệ số 2: ");
	    diemKiemTraHS2 = scanner.nextDouble();
	    System.out.println("Nhập vào điểm thi cuối kỳ: ");
	    diemThi = scanner.nextDouble();
	    
	    //Kiểm tra điểm nhập vào phải hợp lệ
	    //Toán tử OR: chỉ cần 1 biểu thức đúng thì vẫn trả về giá trị đúng
	    if((diemKiemTraHS1<0 || diemKiemTraHS1>10)||(diemKiemTraHS2<0||diemKiemTraHS2>10)
	    ||(diemThi <0 || diemThi >10)){
	    	System.out.println("Nhập điểm không hợp lệ");
	    }else {
	    	//Tính diểm trung bình
	    	diemTrungBinh = (((diemKiemTraHS1 + diemKiemTraHS2 *2.0)/3)*0.4) + (diemThi *0.6);
	    	decimalFormat.format(diemTrungBinh);
	    	
	    	//Tiến hành xếp loại điểm môn học của sinh viên
	    	//Sử dụng cấu trúc if-else if-else
	    	if(diemTrungBinh > 8.5) {
	    		ketQuaXepLoai = "Loại A";
	    	}else if ((diemTrungBinh >=7) && (diemTrungBinh < 8.5)) {
	    		//Toán tử AND: đúng khi cả hai biểu thức đều đúng
	    		ketQuaXepLoai = "Loại B";
				
			}else if ((diemTrungBinh >=5.5) && (diemTrungBinh < 7)) {
				ketQuaXepLoai ="Loại C";
				
			}else if ((diemTrungBinh > 4) && (diemTrungBinh < 5.5)) {
				ketQuaXepLoai = "Loại D";
				
			}else {
				ketQuaXepLoai ="Loại F";
			}
	    	System.out.println("Kết quả xếp loại môn học của sinh viên là" +ketQuaXepLoai);
			
		}
		

	}

}
