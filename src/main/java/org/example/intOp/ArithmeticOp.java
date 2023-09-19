package org.example.intOp;

import org.example.expr.Expr;

/**
 * Represents an arithmetic operation expression in the program.
 * <p>
 * This class extends the abstract class {@link IntOp} and represents an arithmetic
 * operation involving two integer expressions with a specified operator (e.g., +, -, *, /).
 */
public class ArithmeticOp extends IntOp {
    /**
     * Constructs an arithmetic operation expression with the specified left and right operands and operator.
     *
     * @param left The left operand of the arithmetic operation.
     * @param right The right operand of the arithmetic operation.
     * @param op The operator used in the arithmetic operation.
     */
    public ArithmeticOp(Expr left, Expr right, String op) {
        super(left, right, op);
    }
}
