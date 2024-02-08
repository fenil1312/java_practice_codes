package exception;

public class MultipleCatch {

	public static void main(String[] args) {

		try {
			int n1 = Integer.parseInt(args[0]);
			int n2 = Integer.parseInt(args[1]);

			int result = n1 / n2;
			System.out.println("Result = " + result);
		}

		catch (ArithmeticException e) {
			System.err.println("Divide by zero is not allowed");
		}

		catch (ArrayIndexOutOfBoundsException e) {
			System.err.println("Require two inputs");
		}

		catch (NumberFormatException e) {
			System.err.println("Enter only numbers");
		}

		catch (RuntimeException e) {
			System.err.println("Runtime exception");
		}

		catch (Exception e) {
			System.err.println("Exception occured");
		}
	}

}
