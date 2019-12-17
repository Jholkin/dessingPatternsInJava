package Interpreter.sql;

public interface IAbstractSQLExpression {

	public Object interpret(Context context);
}
