
public class PrintSomething {
	public void printSomethingMethod() {
		System.out.println("Printing from the PrintSomething method...");
		printThis();
	}
	
	protected void printThis() {
		System.out.println("Print something....");
	}
}
