package If_Else;

import java.util.Scanner;

public class SoSanhDiem2Mon {

	public static void main(String[] args) {
		float diemJava, diemWeb;
        Scanner scanner = new Scanner(System.in);
         
        System.out.println("Nhập vào điểm môn Lập trình Java: ");
        diemJava = scanner.nextFloat();
        System.out.println("Nhập vào điểm môn Lập trình Web: ");
        diemWeb = scanner.nextFloat();
         
        if (diemJava < diemWeb) {
            System.out.println("Điểm Lập trình Java nhỏ hơn điểm Lập trình Web");
        } else if (diemJava == diemWeb) {
            System.out.println("Điểm Lập trình Java bằng điểm Lập trình Web");
        } else {
            System.out.println("Điểm Lập trình Java lớn hơn điểm Lập trình Web");
        }
    }
}
