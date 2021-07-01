package Bai_01;

public class BienLocal {
	// 1. Biến local trong java
			// - Biến local được khai báo trong các phương thức, hàm contructor hoặc trong các block.
			// - Biến local được tạo bên trong các phương thức, contructol, block và sẽ bị phá hủy khi kết thúc các phương thức, constructor và block
			// - Không được sử dụng "access modifier" khi khai báo biến local
			// - Các biến local được lưu trên vùng nhớ stack của bộ nhớ
			// - Bạn cần khởi tạo giá trị mặc định cho biến local trước khi có thể sử dụng
			
	public void sayHello() {
		//Đây là biến local
		int n = 10;
		System.out.println("Giá trị của n là: " + n);
	}

	public static void main(String[] args) {
		Bien bienlocal = new Bien();
		bienlocal.sayHello();

	}

}
