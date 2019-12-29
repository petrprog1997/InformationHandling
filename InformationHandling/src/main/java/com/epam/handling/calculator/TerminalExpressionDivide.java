package com.epam.handling.calculator;

public class TerminalExpressionDivide extends AbstractMathExpression {

    @Override
    public void interpret(Context context) {
        context.pushValue((context.popValue()/ context.popValue()));
    }
}
