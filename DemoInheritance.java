package LearnOops;

//single level inheritance
//class Ebook{
//	void fun1() {
//		System.out.println("Book Name : Learn Java within 30 days");
//	}
//}
//
//class Author extends Ebook{
//	void fun2() {
//		System.out.println("Author Name : Vasanth G");
//	}
//}

//multi-level level inheritance
class Ebook{
	void fun1() {
		System.out.println("Book Name : Learn Java within 30 days");
	}
}

class Author extends Ebook{
	void fun2() {
		System.out.println("Author Name : Vasanth G");
	}
}

class Janur extends Author{
	void fun3() {
		System.out.println("Book Janur Type : Horror");
	}
}


//Hierarchical Inheritance

class UPI{
	void money_transfer_logic() {
		System.out.println("UPI USERS ACCOUNT MONEY TRANSFER LOGIC");
	}
}


class GPAY extends UPI{
	void gpay_transfer_logic() {
		System.out.println("GPAY USERS ACCOUNT DETAILS");
	}
}

class PYTEM extends UPI{
	void pytem_transfer_logic() {
		System.out.println("PYTEM USERS ACCOUNT DETAILS");
	}
}






public class DemoInheritance {

	public static void main(String[] args) {
		//single level
//		Author an = new Author();
//		an.fun2();
//		an.fun1();
		
		// multi-level
//		Janur j = new Janur();
//		j.fun3();
//		j.fun2();
//		j.fun1();
		
		//Hierarchical Inheritance
		
		GPAY g = new GPAY();
		g.money_transfer_logic();
		g.gpay_transfer_logic();
		System.out.println("++++++++++++++++++++");
		PYTEM pt = new PYTEM();
		pt.money_transfer_logic();
		pt.pytem_transfer_logic();
		
		
		
	}

}
