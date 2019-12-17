package Interpreter.sql.nonterminal;

import Interpreter.sql.Context;

public class AndExpression implements StatementExpression {

    private final StatementExpression leftStatement;
    private final StatementExpression rightStatement;

    public AndExpression(StatementExpression leftStatement,
            StatementExpression rightStatement) {
        this.leftStatement = leftStatement;
        this.rightStatement = rightStatement;
    }

    public Object interpret(Context context) {
        Boolean leftReslt = (Boolean) leftStatement.interpret(context);
        Boolean rightReslt = (Boolean) rightStatement.interpret(context);
        return leftReslt && rightReslt;
    }

    @Override
    public String toString() {
        return "( " + leftStatement.toString()
                + " AND " + rightStatement.toString() + " )";
    }
}
