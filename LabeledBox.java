/*
 * TODO 3: Extend the Box class and implement the Drawable interface.
 */
public class LabeledBox extends Box implements Drawable {
	private String label;
	
	/*
	 * TODO 4: Provide a constructor which take three arguments
	 * 		length: int
	 * 		width: int
	 * 		label: String
	 * Use super() to initialize length and width attributes of Box.
	 * Initialize the label attribute with the third argument of constructor.
	 */
	public LabeledBox(int length, int width, String label) {
		super(length, width);
		this.label = label;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	/*
	 * TODO 5: Implement the draw() method inherited from the Drawable interface.
	 * The method should return the following String (without double quotes).
	 * "Drawing Box with dimensions: (<length>, <width>) with label: <label>"
	 * 
	 * For this, you have to access the length and width attributes of the Box
	 * class. You can access these two attributes using getLength() and getWidth()
	 * methods. These two methods can be accessed directly or with this keyword or
	 * with super keyword.
	 */
	public String draw() {
		return "Drawing Box with dimensions: ("
				+ super.getLength() + ", " + super.getWidth() +
				") with label: " + this.getLabel();
	}
}
