package org.example.intOp;

import org.example.expr.Expr;

/**
 * Represents an integer operation expression in the program.
 */
public abstract class IntOp extends Expr {
    Expr left;
    Expr right;
    String op;

    /**
     * Constructs an integer operation expression with the specified left and right operands and operator.
     *
     * @param left The left operand of the integer operation.
     * @param right The right operand of the integer operation.
     * @param op The operator used in the integer operation.
     */
    public IntOp(Expr left, Expr right, String op) {
        this.left = left;
        this.right = right;
        this.op = op;
    }

    /**
     * Gets the left operand of the integer operation.
     *
     * @return The left operand.
     */
    public Expr getLeft() {
        return left;
    }

    /**
     * Gets the right operand of the integer operation.
     *
     * @return The right operand.
     */
    public Expr getRight() {
        return right;
    }

    /**
     * Gets the operator used in the integer operation.
     *
     * @return The operator.
     */
    public String getOp() {
        return op;
    }
}
