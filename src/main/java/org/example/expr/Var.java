package org.example.expr;

/**
 * Represents a variable expression in the program.
 */
public class Var extends Expr {
    String name;

    /**
     * Constructs a variable expression with the specified variable name.
     *
     * @param name The name of the variable.
     */
    public Var(String name) {
        this.name = name;
    }

    /**
     * Gets the name of the variable.
     *
     * @return The variable name.
     */
    public String getName() {
        return name;
    }
}
