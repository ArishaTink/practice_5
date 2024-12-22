package org.example;

import java.util.ArrayList;
import java.util.List;

public class StringArray {
    private List<String> stringArray;

    StringArray(List<String> strings) {
        this.stringArray = new ArrayList<>(strings);
        for (int i = 0; i < stringArray.size() - 1; i++) {
            for (int j = 0; j < stringArray.size() - 1 - i; j++) {
                if (stringArray.get(j).length() > stringArray.get(j + 1).length()) {
                    String store = stringArray.get(j);
                    stringArray.set(j, stringArray.get(j + 1));
                    stringArray.set(j + 1, store);
                }
            }
        }
    }

    public void addString(String string) {
        if (string.length() < stringArray.get(0).length()) {
            stringArray.add(0, string);
        } else if (string.length() > stringArray.get(stringArray.size() - 1).length()) {
            stringArray.add(string);
        } else {
            for (int i = 0; i < stringArray.size(); i++) {
                if (string.length() < stringArray.get(i).length()) {
                    stringArray.add(i, string);
                    break;
                }
            }
        }
    }

    public String maxString() {
        return stringArray.get(stringArray.size() - 1);
    }

    @Override
    public String toString() {
        return "StringArray{" +
                "stringArray=" + stringArray +
                '}';
    }

    public double averageString() {
        int sum = 0;
        for (String string : stringArray) {
            sum += string.length();
        }
        return sum / stringArray.size();
    }
}
