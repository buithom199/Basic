package ArrayList;

import java.util.ArrayList;
import java.util.ListIterator;

public class SuDungListiteratorForArrayList {

	public static void main(String[] args) {
		// khai báo 1 ArrayList có tên là arrListChar
		//có kiểu là Character
		ArrayList<Character> arrayListCharacter = new ArrayList<>();
		
		arrayListCharacter.add('a');
		arrayListCharacter.add('e');
		arrayListCharacter.add('b');
		arrayListCharacter.add('c');
		
		//Khai báo một ListIiterator có kiểu là Character
		ListIterator<Character> listIterator = arrayListCharacter.listIterator();
		
		//Hiển thị các phần tử có trong linkedList
		//bằng các sử dụng ListIterator
		System.out.println("Các phần tử có trong arrListChar là:");
		while (listIterator.hasNext()) {
			System.out.print(listIterator.next() + "\t");
			
		}

	}

}
