package com.epam.handling.calculator;

public class NonterminalExpressionNumber extends AbstractMathExpression {

    private int number;

    NonterminalExpressionNumber(int number) {
        this.number = number;
    }

    @Override
    public void interpret(Context context) {
        context.pushValue(number);
    }
}
