package behavioural.interpreter.pattern;

import java.util.StringTokenizer;

public class SentenceExpression implements Expression {

	Expression delete;

	Expression from;

	Expression table;

	Expression where;

	Expression condtions;

	public SentenceExpression(Expression deleteKeyword, Expression fromKeyword, Expression tableName,
			Expression whereKeyword, Expression conditions) {

		this.delete = deleteKeyword;

		this.from = fromKeyword;

		this.table = tableName;

		this.where = whereKeyword;

		this.condtions = conditions;

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

			boolean valid = this.delete.interpret(delete) && this.from.interpret(from) && this.table.interpret(table)
					&& this.where.interpret(where) && this.condtions.interpret(conditions);

			return valid;

		} catch (Exception e) {

			return false;
		}

	}

}
