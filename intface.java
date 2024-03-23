/**
 * 
 */
package plymorphism;

interface ad{
	 void show();
	 void display();
}
 class let implements ad{

	@Override
	public void show() {
		System.out.println("ADD SHOW");
		
	}

	@Override
	public void display() {
		System.out.println("ADD DISPLAY");
		
	}
	
}


public class intface {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 ad obj =new let();
		obj.show();
		obj.display();
	}

}
