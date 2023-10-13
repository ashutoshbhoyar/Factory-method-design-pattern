package Factory_method_design_pattern;

public class WebDeveloper implements Employee {

	@Override
	public int salary() {
		System.out.println("Web developer salary ");
		return 20000;
	}

}
