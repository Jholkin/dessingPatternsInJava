package Interpreter.numRomanos;

public abstract class Expresion {
	
	public abstract String one();
	public abstract String four();
	public abstract String five();
	public abstract String nine();
	public abstract int multiplier();

	public void interpret(Context context) {
		if(context.getInput().startsWith(nine())) {
			context.setOutput(context.getOutput() + 9*multiplier());
			context.setInput(context.getInput().substring(2));
		}
		else if (context.getInput().startsWith(four())) {
			
		}
		else if (context.getInput().startsWith(five())) {
			
		}
		
		while(context.getInput().startsWith(one())) {
			
		}
	}
}
