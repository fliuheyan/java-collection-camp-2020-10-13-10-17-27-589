package com.thoughtworks.collection;

import org.apache.commons.lang3.NotImplementedException;

import java.util.Arrays;
import java.util.List;

public class MyMap {

    List<Integer> array;
    private String[] letters = new String[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l",
            "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
    private List<String> letterList = Arrays.asList(letters);

    public MyMap(List<Integer> array) {
        this.array = array;
    }

    public List<Integer> getTriple() {
        throw new NotImplementedException();
    }

    public List<String> mapLetter() {
        throw new NotImplementedException();
    }

    public List<Integer> sortFromBig() {
        throw new NotImplementedException();
    }
}
