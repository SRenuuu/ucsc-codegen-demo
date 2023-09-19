package org.example.stmt;

import org.example.expr.Expr;

/**
 * Represents an "if" statement in the program.
 */
public class IfStmt extends Stmt {
    Expr cond;
    Stmt[] thenStmts;
    Stmt[] elseStmts;

    /**
     * Constructs an "if" statement with the specified condition and corresponding code blocks.
     *
     * @param cond The condition expression for the "if" statement.
     * @param thenStmts The statements to be executed if the condition is true.
     * @param elseStmts The statements to be executed if the condition is false (can be null if no "else" block).
     */
    public IfStmt(Expr cond, Stmt[] thenStmts, Stmt[] elseStmts) {
        this.cond = cond;
        this.thenStmts = thenStmts;
        this.elseStmts = elseStmts;
    }

    /**
     * Gets the condition expression of the "if" statement.
     *
     * @return The condition expression.
     */
    public Expr getCond() {
        return cond;
    }

    /**
     * Gets the statements to be executed if the condition is true.
     *
     * @return An array of statements.
     */
    public Stmt[] getThenStmts() {
        return thenStmts;
    }

    /**
     * Gets the statements to be executed if the condition is false.
     *
     * @return An array of statements, or null if there is no "else" block.
     */
    public Stmt[] getElseStmts() {
        return elseStmts;
    }
}
