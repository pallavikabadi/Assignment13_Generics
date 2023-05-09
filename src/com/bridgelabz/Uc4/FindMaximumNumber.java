package com.bridgelabz.Uc4;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
public class FindMaximumNumber<T extends  Comparable<T>> {
    private List<T> values;

    public FindMaximumNumber(T... values) {
        this.values = Arrays.asList(values);
    }

    public T findMax() {
        Collections.sort(values);
        return values.get(values.size() - 1);
    }

    public static void main(String[] args) {
//        test case for integers
        FindMaximumNumber<Integer> intMax = new FindMaximumNumber<>(10, 20, 2, 35, 44);
        System.out.println(intMax.findMax());
//        test case for floats
        FindMaximumNumber<Float> floatMax = new FindMaximumNumber<>(2.3f, 7.8f, 8.9f, 15.7f, 5.5f);
        System.out.println(floatMax.findMax());
//        test case for Strings
        FindMaximumNumber<String> stringMax = new FindMaximumNumber<>("Pallavi", "Ajit", "", "Kshitij", "Ayansh");
        System.out.println(stringMax.findMax());

    }
}