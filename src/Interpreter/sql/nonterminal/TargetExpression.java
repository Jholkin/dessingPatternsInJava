package Interpreter.sql.nonterminal;

import java.util.*;
import org.apache.poi.ss.usermodel.*;
import Interpreter.sql.*;
import Interpreter.sql.terminal.LiteralExpression;


public class TargetExpression {

    private List<LiteralExpression> targets = new ArrayList<LiteralExpression>();

    public TargetExpression(LiteralExpression... expressions) {
        this.targets = Arrays.asList(expressions);
    }

    public Void interpret(Context context) {
        context.createResultArray(targets.size());

        List<Row> resultRow = context.getResultRow();
        for (Row row : resultRow) {
            Object[] result = context.createRow();
            int col = 0;
            
            for (LiteralExpression literalExpression : targets) {
                String column = literalExpression.interpret(context).toString();
                context.tableColumn(column);
                int columnIndex = context.columnIndex(column);
                Cell cell = row.getCell(columnIndex);
                cell.setCellType(Cell.CELL_TYPE_STRING);
                String value = cell.getStringCellValue();
                result[col++] = value;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        String output = "";
        for (LiteralExpression literalExpression : targets) {
            output += ", " + literalExpression.toString();
        }
        return output.substring(2);
    }
}
