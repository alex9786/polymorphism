
package plymorphism;

  interface god{
	void gift() ;
	void god();
	void list();
  }	
  abstract class main{
	  
	  }
	  
 class rest implements god{

	@Override
	public void gift() {
		
		System.out.println("HELLO WORLT");
	}

	@Override
	public void god() {
		System.out.println(" WELCOME");
	}

	@Override
	public void list() {
		
		System.out.println(" FOR YOU");
	}
	 
 }
  
public class overriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		rest r1 = new rest();
	
		r1.gift();
		r1.god();
		r1.list();
		
		
	}

}
