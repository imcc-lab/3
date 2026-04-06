package MultiInterfacePkg;

public class Document implements Printable, Showable{

	@Override
	public void show() {
		
		System.out.println("This is show method");
		
	}

	@Override
	public void print() {
		
		System.out.println("This is print method");
		
	}
	
	public static void main(String[] args) {
		
		Document d=new Document();
		d.print();
		d.show();
	}

}
