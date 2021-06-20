public class Operators {
	/*
	 * TODO 1: Provide a public static final attribute of type Operator and name
	 * it ADDITION (ensure that the name is in upper case). Initialize the attribute
	 * in the same line using the anonymous class. Override the operate(int, int) method
	 * such that it add the two arguments and return the result. 
	 */
	public static final Operator ADDITION = new Operator() {
		public int operate(int a, int b) {
			return a + b;
		}
	};
	
	/*
	 * TODO 2: Provide a public static final attribute of type Operator and name
	 * it SUBTRACTION (ensure that the name is in upper case). Initialize the attribute
	 * in the same line using the anonymous class. Override the operate(int, int) method
	 * such that it subtract the two arguments (a - b) and return the result. 
	 */
	public static final Operator SUBTRACTION = new Operator() {
		public int operate(int a, int b) {
			return a - b;
		}
	};
	
	/*
	 * TODO 3: Provide a public static final attribute of type Operator and name
	 * it MULTIPLICATION (ensure that the name is in upper case). Initialize the attribute
	 * in the same line using the anonymous class. Override the operate(int, int) method
	 * such that it multiply the two arguments and return the result. 
	 */
	public static final Operator MULTIPLICATION = new Operator() {
		public int operate(int a, int b) {
			return a * b;
		}
	};
	
	/*
	 * TODO 4: Provide a public static final attribute of type Operator and name
	 * it DIVISION (ensure that the name is in upper case). Initialize the attribute
	 * in the same line using the anonymous class. Override the operate(int, int) method
	 * such that it divide the two arguments (a / b) and return the result. 
	 */
	public static final Operator DIVISION = new Operator() {
		public int operate(int a, int b) {
			return a / b;
		}
	};
}
