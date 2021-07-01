package Bai_01;

import org.omg.CORBA.PUBLIC_MEMBER;

public class F {
	public void test() {
		System.out.println("Constant=" + E.MY_CONSTANT);
		E e = new E();
		e.myField = 2000;
		e.myMethod();
	}

}
