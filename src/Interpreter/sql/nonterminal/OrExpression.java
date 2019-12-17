package Interpreter.sql.nonterminal;

import Interpreter.sql.*;

public class OrExpression implements StatementExpression{
    private StatementExpression leftStatement;
    private StatementExpression rightStatement;

    public OrExpression(StatementExpression leftStatement, 
            StatementExpression rightStatement) {
        this.leftStatement = leftStatement;
        this.rightStatement = rightStatement;
    }

    @Override
    public Object interpret(Context context) {
        Boolean leftReslt = (Boolean) leftStatement.interpret(context);
        Boolean rightReslt = (Boolean) rightStatement.interpret(context);
        return leftReslt || rightReslt;
    }

    @Override
    public String toString() {
        return "( "+leftStatement.toString()
                + " OR " + rightStatement.toString() + " )";
    }
}
