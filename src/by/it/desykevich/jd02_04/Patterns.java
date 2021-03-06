package by.it.desykevich.jd02_04;

abstract class Patterns {
    static final String OPERATION="(?<=[^-{,+/*=])[-*+/=]";
    static final String SCALAR="-?[0-9]+\\.?[0-9]*";
    static final String VECTOR="\\{((-?[0-9]+\\.?[0-9]*),?)+}";
//    static final String MATRIX="\\{(\\{((-?[0-9]+\\.?[0-9]*),?)+},?)+}";
    static  final String KEY ="[a-zA-Z][a-zA-Z0-9]*";
}
