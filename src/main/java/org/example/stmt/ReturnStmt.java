package org.example.stmt;

import org.example.expr.Expr;

/**
 * Represents a "return" statement in the program.
 */
public class ReturnStmt extends Stmt {
    Expr expr;

    /**
     * Constructs a "return" statement with the specified expression.
     *
     * @param expr The expression to be returned.
     */
    public ReturnStmt(Expr expr) {
        this.expr = expr;
    }

    /**
     * Gets the expression to be returned.
     *
     * @return The expression.
     */
    public Expr getExpr() {
        return expr;
    }
}
