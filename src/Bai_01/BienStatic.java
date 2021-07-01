package Bai_01;

public class BienStatic {
	// 3. Biến stattic trong java
	// - Biến static được khai báo trong một class với từ khóa "static", phía bên ngoài phương thức, constructor và block
	// - Sẽ chỉ có duy nhất một bản sao của các biến static được tạo ra, dù bạn tạo bao nhiêu đối tượng từ lớp tương ứng
	// - Biến static được lưu trữ trong bộ nhớ static riêng
	// - Biến static được tạo khi chương trình bắt đầu chạy và phá hủy khi chương trình dừng
	// - Giá trị mặc định của biến static phụ thuộc vào kiểu dữ liệu bạn khai báo tương tự biến instance
	// - Biến static được truy cập thông qua tên của class chứa nó, với cú pháp: TenClass.tenBien
	// - Trong class, các phương thức sử dụng biến static bằng cách gọi tên của nó khi phương thức đó cũng được khai báo với từ khóa "static"
	
	//Biến static 'ten'
	public static String ten = "Nguyen Van A";
	
	//Biến static 'tuoi'
	public static int tuoi = 21;

	public static void main(String[] args) {
		//Sử dụng biến static bằng cách gọi trực tiếp
		System.out.println("Ten: " +ten);
		
		System.out.println("Ten: " + BienStatic.tuoi);

	}

}
