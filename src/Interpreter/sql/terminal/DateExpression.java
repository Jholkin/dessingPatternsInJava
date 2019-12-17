package Interpreter.sql.terminal;

import java.text.SimpleDateFormat;
import Interpreter.sql.Context;


public class DateExpression extends LiteralExpression {

    public DateExpression(String literal) {
        super(literal);
    }

    public Object interpret(Context context) {
        try {
            SimpleDateFormat dateFormat = context.getDateFormat();
            return dateFormat.parse(literal);
        } catch (Exception e) {
            return "Invalid date format '"+literal+"'";
        }
    }

    @Override
    public String toString() {
        return "'"+literal+"'";
    }
}
