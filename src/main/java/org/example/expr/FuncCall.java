package org.example.expr;

/**
 * Represents a function call expression in the program.
 */
public class FuncCall extends Expr {
    public String name;
    Expr[] args;

    /**
     * Constructs a function call expression with the specified function name and arguments.
     *
     * @param name The name of the function to be called.
     * @param args An array of expressions representing the function's arguments.
     */
    public FuncCall(String name, Expr[] args) {
        this.name = name;
        this.args = args;
    }

    /**
     * Gets the name of the function being called.
     *
     * @return The function name.
     */
    public String getName() {
        return name;
    }

    /**
     * Gets the array of expressions representing the arguments passed to the function.
     *
     * @return An array of expressions.
     */
    public Expr[] getArgs() {
        return args;
    }
}
