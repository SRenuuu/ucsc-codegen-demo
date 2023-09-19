package org.example.intOp;

import org.example.expr.Expr;
import org.objectweb.asm.Label;

/**
 * Represents a comparison operation expression in the program.
 * <p>
 * This class extends the abstract class {@link IntOp} and represents a comparison
 * operation involving two integer expressions with a specified operator (e.g., ==, !=, <, >, <=, >=).
 */
public class ComparisonOp extends IntOp {
    /**
     * The label associated with this comparison operation (used for branching in bytecode generation).
     */
    Label label;

    /**
     * Constructs a comparison operation expression with the specified left and right operands and operator.
     *
     * @param left The left operand of the comparison operation.
     * @param right The right operand of the comparison operation.
     * @param op The operator used in the comparison operation.
     */
    public ComparisonOp(Expr left, Expr right, String op) {
        super(left, right, op);
    }

    /**
     * Gets the label associated with this comparison operation.
     *
     * @return The label for branching purposes (implementation-specific).
     */
    public Label getLabel() {
        return label;
    }

    /**
     * Sets the label associated with this comparison operation.
     *
     * @param label The label.
     */
    public void setLabel(Label label) {
        this.label = label;
    }
}
