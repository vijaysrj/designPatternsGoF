package behavioural.interpreter.pattern;

public class Client {

	public static void main(String a[]) {

		Expression deleteKeyword = new KeywordExpression("DELETE");

		Expression fromKeyword = new KeywordExpression("FROM");

		Expression tableName = new VariableExpression();

		Expression whereKeyword = new KeywordExpression("WHERE");

		Expression fieldName = new VariableExpression();

		Expression compare = new OperatorExpression();

		Expression variable = new ValueExpression();

		Expression conditions = new ConditionsExpression(fieldName, compare, variable);

		Expression expression = new SentenceExpression(deleteKeyword, fromKeyword, tableName, whereKeyword, conditions);

		String sqlQuery = "DELETE FROM BLOG WHERE VIEW_COUNT hello 2";

		boolean valid = expression.interpret(sqlQuery);

		if (valid) {
			System.out.println("Your Delete Query is Valid!");
		} else {

			System.out.println("Your Delete Query is Invalid");
		}
	}

}
