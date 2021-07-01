package MangMotChieu;

import java.util.Scanner;

public class TimKiemPhanTuCuaMang {

	public static void main(String[] args) {
		int n, temp, max = 100, k, c, d, l;
		Scanner scanner = new Scanner(System.in);
		
		//Khai báo và cấp phát bộ nhớ cho mảng A
		int array[] = new int[max];
		
		//Nhập số phần tử của mảng
		//Kiểm tra nếu n <=0 hoặc n> max-1
		//thì phải nhập lại
		do {
			System.out.println("Nhập số phần tử của mảng:");
			n = scanner.nextInt();
		}while (n <=0 || n > max-1);
		
		System.out.println("Nhập giá trị cho các phần tử của mảng:");
		for(int i = 0; i<n; i++) {
			System.out.print("array[" + i + "]=");
			array[i] = scanner.nextInt();
		}
		
		//Sắp xếp tăng dần các phần tử bằng phương pháp Exchange sort
		//Vòng lặp for sẽ duyệt i và j
		//i chạy từ 0 đến n-1, j chạy từ n+1 đến n-1
		//Nếu phần tử tại chỉ số j nhỏ hơn phần tử tại i
		//thì sẽ hoán đổi vị trí 2 phần tử này cho nhau
		for(int i =0; i<n-1; i++) {
			for(int j=i+1; j<=n-1; j++) {
				if(array[j] < array[i]) {
					temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
		//Tìm kiếm phần tử trong mảng
		System.out.println("Nhập số nguyên cần tìm:");
		k = scanner.nextInt();
		
		d=0;
		c= n-1;
		
		//Duyệt vòng lặp while
		//Nếu d còn nhỏ hoặc bằng c thì còn tiếp tục thực hiện thân vòng lap85
		while(d<=c) {
			l = (d+c)/2;
			//Nếu phần tử tại vị tí j bằng số nguyên k cần tìm
			//thì thông báo tìm thấy số k tại vị trí j
			//và kết thúc vòng lặp
			if(array[l] == k) {
			System.out.println("Tìm thấy phần tử" + k + "tại vị trí" +l);
			return; //Kết thúc vòng lặp while và bỏ qua các lệnh bên dưới
		}
			else if(array[l] <k){
			//Nếu phần tử tại l nhỏ hơn số nguyên k
			//thì tăng d = l+1
			//và quay lại thực hiện vòng lặp while
			d = l +1;
		}
			else {
				//Nếu phần tử tại l lơn hơn số nguyên k
				//Thì giảm d = l -1;
				//và quay lại thực hiện vòng lặp while
				c = l -1;
			}

		}
		
		//Nếu sau khi thực hiện vòng lặp while
		//mà không tìm thấy số cần tìm
		//thì hiển thị thông báo không tìm thấy
		System.out.println("Trong mảng không có phần tử nào chứa giá trị cần tìm");

	}
	}
