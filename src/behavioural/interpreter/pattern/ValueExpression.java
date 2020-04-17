package behavioural.interpreter.pattern;

import java.util.regex.Pattern;

public class ValueExpression implements Expression {

	@Override
	public boolean interpret(String word) {

		Pattern pattern = Pattern.compile("[0-9]+");

		boolean isValidPattern = pattern.matcher(word).matches();

		if (!isValidPattern) {

			System.out.println("Incorrect value for condition value - An Integer value expected");
		}

		return isValidPattern;
	}

}
