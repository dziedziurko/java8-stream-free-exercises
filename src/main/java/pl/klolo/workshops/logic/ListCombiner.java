package pl.klolo.workshops.logic;

import java.util.LinkedList;
import java.util.function.BinaryOperator;

public class ListCombiner implements BinaryOperator<LinkedList<String>> {
    @Override
    public LinkedList<String> apply(LinkedList<String> strings, LinkedList<String> strings2) {
        LinkedList<String> result = new LinkedList<>(strings);
        result.addAll(strings2);
        return result;
    }
}
