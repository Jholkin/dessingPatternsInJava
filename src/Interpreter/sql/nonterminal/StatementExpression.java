package Interpreter.sql.nonterminal;

import Interpreter.sql.*;


public interface StatementExpression extends IAbstractSQLExpression {

    @Override
    public Object interpret(Context context);
}