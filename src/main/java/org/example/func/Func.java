package org.example.func;

import org.example.expr.Var;
import org.example.stmt.Stmt;

/**
 * Represents a function definition in the program.
 * This class contains information about the name of the function, its arguments,
 * and the statements within the function body.
 */
public class Func {
    String name;

    Var[] args;

    Stmt[] stmts;

    /**
     * Constructs a function definition with the specified name, arguments, and statements.
     *
     * @param name The name of the function.
     * @param args An array of variable expressions representing the function's arguments.
     * @param stmts An array of statements representing the function's body.
     */
    public Func(String name, Var[] args, Stmt[] stmts) {
        this.name = name;
        this.args = args;
        this.stmts = stmts;
    }

    /**
     * Gets the name of the function.
     *
     * @return The function name.
     */
    public String getName() {
        return name;
    }

    /**
     * Gets the array of variable expressions representing the function's arguments.
     *
     * @return An array of variable expressions.
     */
    public Var[] getArgs() {
        return args;
    }

    /**
     * Gets the array of statements representing the function's body.
     *
     * @return An array of statements.
     */
    public Stmt[] getStmts() {
        return stmts;
    }
}
