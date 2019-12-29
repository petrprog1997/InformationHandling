package com.epam.handling.calculator;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Client {

    private List<AbstractMathExpression> listExpression;

    public Client(){
        listExpression = new ArrayList<>();
    }

    public Client(String expression) {
        listExpression = new ArrayList<>();
    }

    private void parse(String expression) {
        for (String lexeme : expression.split("")) {
            char temp = lexeme.charAt(0);
            switch (temp) {
                case '+' :
                    listExpression.add(new TerminalExpressionPlus());
                    break;
                case '-' :
                    listExpression.add(new TerminalExpressionMinus());
                    break;
                case '/' :
                    listExpression.add(new TerminalExpressionDivide());
                    break;
                case '*' :
                    listExpression.add(new TerminalExpressionMultiply());
                    break;
                default:
                    Scanner scanner = new Scanner(lexeme);
                    if(scanner.hasNextInt()) {
                        listExpression.add(new NonterminalExpressionNumber(scanner.nextInt()));
                    }
            }
        }
    }

    public Number calculate(String expression) {
        parse(expression);
        Context context = new Context();
        for(AbstractMathExpression terminal : listExpression) {
            terminal.interpret(context);
        }
        return context.popValue();
    }
}
