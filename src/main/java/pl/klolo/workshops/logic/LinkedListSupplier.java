package pl.klolo.workshops.logic;

import java.util.LinkedList;
import java.util.function.Supplier;

public class LinkedListSupplier implements Supplier<LinkedList<String>> {
    @Override
    public LinkedList<String> get() {
        return new LinkedList<>();
    }
}
