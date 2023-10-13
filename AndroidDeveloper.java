package Factory_method_design_pattern;

public class AndroidDeveloper implements Employee {

	@Override
	public int salary() {
		System.out.println("Android developer salary");
		return 30000;
	}

}
