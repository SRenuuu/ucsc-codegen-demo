package org.example.expr;

public class IntLiteral extends Expr {
    int value;

    /**
     * Constructs an integer literal expression with the specified integer value.
     *
     * @param value The integer value of the literal.
     */
    public IntLiteral(int value) {
        this.value = value;
    }

    /**
     * Gets the integer value of the literal.
     *
     * @return The integer value.
     */
    public int getValue() {
        return value;
    }
}
