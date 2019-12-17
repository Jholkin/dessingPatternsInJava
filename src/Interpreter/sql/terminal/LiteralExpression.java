package Interpreter.sql.terminal;

import Interpreter.sql.Context;
import Interpreter.sql.IAbstractSQLExpression;

public class LiteralExpression implements IAbstractSQLExpression {

    protected String literal;

    public LiteralExpression(String literal) {
        this.literal = literal;
    }

    @Override
    public Object interpret(Context context) {
        return literal;
    }

    @Override
    public String toString() {
        return literal;
    }
}
