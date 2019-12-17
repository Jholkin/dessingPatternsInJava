package Interpreter.sql.nonterminal;

import Interpreter.sql.*;
import Interpreter.sql.terminal.*;

public class FromExpression {
    
    private LiteralExpression table;
    
    public FromExpression(LiteralExpression from){
        this.table = from;
    }

    public Object interpret(Context context) {
        String tableName = 
                table.interpret(context).toString();
        if(!context.tableExist(tableName)){
        	System.out.print("The table '"+tableName+"' not exist");
        }
        return null;
    }

    @Override
    public String toString() {
        return "FROM " + table.toString();
    }
}
