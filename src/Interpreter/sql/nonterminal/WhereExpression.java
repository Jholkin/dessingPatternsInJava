package Interpreter.sql.nonterminal;

import Interpreter.sql.*;


public class WhereExpression {

    private StatementExpression statement;

    public WhereExpression(StatementExpression statement) {
        this.statement = statement;
    }

    public Void interpret(Context context) {
        context.createRowIterator();
        while (context.nextRow()) {
            if (statement == null) {
                context.addCurrentRowToResults();
            } else {
                Boolean result = (Boolean) statement.interpret(context);
                if (result) {
                    context.addCurrentRowToResults();
                }
            }
        }
        return null;
    }

    @Override
    public String toString() {
        if (statement != null) {
            return "\nWHERE " + statement.toString();
        } else {
            return "";
        }
    }
}
