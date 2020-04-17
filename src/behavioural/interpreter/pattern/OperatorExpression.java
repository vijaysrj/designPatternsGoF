package behavioural.interpreter.pattern;

import java.util.ArrayList;
import java.util.List;

public class OperatorExpression implements Expression {

	@Override
	public boolean interpret(String word) {

		List<String> operators = new ArrayList<>();

		operators.add("=");
		operators.add("<");
		operators.add(">");
		operators.add("<=");
		operators.add(">=");
		operators.add("!=");

		boolean valid = operators.contains(word);

		if (!valid) {

			System.out.println("Not a valid comparison operator");
		}

		return valid;
	}

}
