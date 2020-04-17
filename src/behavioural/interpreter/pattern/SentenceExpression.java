package behavioural.interpreter.pattern;

import java.util.StringTokenizer;

public class SentenceExpression implements Expression {

	Expression deleteExp;

	Expression fromExp;

	Expression tableExp;

	Expression whereExp;

	Expression condtionsExp;

	public SentenceExpression(Expression deleteKeyword, Expression fromKeyword, Expression tableName,
			Expression whereKeyword, Expression conditions) {

		this.deleteExp = deleteKeyword;

		this.fromExp = fromKeyword;

		this.tableExp = tableName;

		this.whereExp = whereKeyword;

		this.condtionsExp = conditions;

	}

	@Override
	public boolean interpret(String sentence) {

		try {

			StringTokenizer tokenizer = new StringTokenizer(sentence);

			String delete = tokenizer.nextToken();

			String from = tokenizer.nextToken();

			String table = tokenizer.nextToken();

			String where = tokenizer.nextToken();

			String conditions = sentence.substring(sentence.indexOf(where) + where.length()).trim();

			boolean valid = this.deleteExp.interpret(delete) && this.fromExp.interpret(from)
					&& this.tableExp.interpret(table) && this.whereExp.interpret(where)
					&& this.condtionsExp.interpret(conditions);

			return valid;

		} catch (Exception e) {

			return false;
		}

	}

}
