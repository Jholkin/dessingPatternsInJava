package Interpreter.sql.nonterminal;

import Interpreter.sql.IAbstractSQLExpression;
import java.util.List;
import Interpreter.sql.Context;


public class SelectExpression implements IAbstractSQLExpression{

    private final TargetExpression target;
    private final FromExpression from;
    private final WhereExpression where;
    
    public SelectExpression(TargetExpression columns,
            FromExpression table,WhereExpression where){
        this.target = columns;
        this.from = table;
        this.where = where;
    }
    
    public SelectExpression(TargetExpression columns,
            FromExpression table){
        this.target = columns;
        this.from = table;
        this.where = new WhereExpression(null);
    }
    
    @Override
    public List<Object[]> interpret(Context context) {
        from.interpret(context);
        where.interpret(context);
        target.interpret(context);
        return context.getResultArray();
    }

    @Override
    public String toString() {
        return "SELECT " + target.toString() + " " + 
                from.toString() + " " +  where.toString();
    }
}
