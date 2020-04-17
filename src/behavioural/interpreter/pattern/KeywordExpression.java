package behavioural.interpreter.pattern;

public class KeywordExpression implements Expression {

	private String name;

	public KeywordExpression(String name) {

		this.name = name;
	}

	@Override
	public boolean interpret(String word) {

		boolean valid = word.equalsIgnoreCase(this.name);

		if (!valid) {

			System.out.println("Keyword incorrect - Keyword expected is :" + this.name);
		}

		return valid;
	}

}
