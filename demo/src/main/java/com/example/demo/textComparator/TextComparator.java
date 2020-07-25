package com.example.demo.textComparator;

import java.util.Comparator;

public class TextComparator implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {
        if (o1.toString().length() != o2.toString().length()) {
            return Integer.compare(o1.length(), o2.length());
        }
        return o1.compareTo(o2);
    }
}
