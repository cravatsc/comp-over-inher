
public class RunnerClass {
	public static void main(String ... args) {
		//inheritance
		PrintSomething something = new PrintSomething();
		something.printSomethingMethod();
		PrintSomething somethingElse = new PrintSomethingElse();
		somethingElse.printSomethingMethod();
		//composition
		Printerface print = printerfaceFactory(args.length > 0 ? args[0]:null);
		print.printSomethingMethod();
		
		
	}
	
	private static Printerface printerfaceFactory(String type) {
		if("something".equalsIgnoreCase(type)) {
			return new PrintSomethingImpl();
		}else {
			return new PrintSomethingElseImpl();
		}
	}
}
