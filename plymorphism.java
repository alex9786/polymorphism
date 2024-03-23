/**
 * 
 */
package plymorphism;
class test{
	
	public void print() {
		System.out.println(" DETAILS");
	}
	public void print(String name) {
		System.out.println("NAME    :"+name);
	}
	public void print(int roll) {
		System.out.println("ROLL NO :"+roll);
	}
	public void print(double rank) {
		System.out.println("RANK    :"+rank);
	}
	
}

public class plymorphism {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
test result = new test();
result.print();
result.print("ALEX");
result.print(21);
result.print(96.5);
		
	}

}
