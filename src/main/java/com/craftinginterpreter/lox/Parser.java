package com.craftinginterpreter.lox;

import java.util.List;

import static com.craftinginterpreter.lox.TokenType.*;

class Parser {

    private final List<Token> tokens;
    private int current = 0;

    Parser(List<Token> tokens) {
        this.tokens = tokens;
    }
}
