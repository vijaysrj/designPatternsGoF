package behavioural.interpreter.pattern;

import java.util.regex.Pattern;

public class VariableExpression implements Expression {

	@Override
	public boolean interpret(String word) {

		Pattern pattern = Pattern.compile("[a-zA-Z_]+");
		boolean valid = pattern.matcher(word).matches();

		if (!valid) {

			System.out.println("Table name or field name has restricted characters");
		}
		return valid;

	}

}
