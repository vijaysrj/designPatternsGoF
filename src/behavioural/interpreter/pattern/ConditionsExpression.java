package behavioural.interpreter.pattern;

import java.util.StringTokenizer;

public class ConditionsExpression implements Expression {

	Expression fieldExpression;

	Expression comparisonExpression;

	Expression valueExpression;

	public ConditionsExpression(Expression fieldName, Expression comparison, Expression variable) {

		this.fieldExpression = fieldName;

		this.comparisonExpression = comparison;

		this.valueExpression = variable;
	}

	@Override
	public boolean interpret(String words) {

		try {

			StringTokenizer tokenizer = new StringTokenizer(words);

			if (tokenizer.countTokens() != 3) {

				System.out.println("Number of words in conditions is incorrect , should be 3");

				return false;
			}

			String fieldName = tokenizer.nextToken();

			String equalsSign = tokenizer.nextToken();

			String variable = tokenizer.nextToken();

			boolean valid = this.fieldExpression.interpret(fieldName) && this.comparisonExpression.interpret(equalsSign)
					&& this.valueExpression.interpret(variable);

			return valid;
		} catch (Exception e) {

			return false;
		}

	}

}
