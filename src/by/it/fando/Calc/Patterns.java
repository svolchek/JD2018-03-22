package by.it.fando.Calc;

abstract class Patterns {
    static final String OPERATION = "[-+*/=]"; // TODO Negative incorrect
    static final String SCALAR = "-?[0-9]+\\.?[0-9]*";
    static final String VECTOR = "\\{((-?[0-9]+\\.?[0-9]*),?)+}";
    static final String MATRIX = "\\{(\\{((-?[0-9]+\\.?[0-9]*),?)+},?)+}";
    static final String VARNAME = "[a-zA-Z][]";
}
