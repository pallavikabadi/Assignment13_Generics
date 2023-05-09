
package com.bridgelabz.Uc5;

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
    public static <T extends Comparable<T>> void printMax(T max){
        System.out.println("Maximum Value:" + max);
    }

    public static void main(String[] args) {
//        test case for integers
        FindMaximumNumber<Integer> intMax = new FindMaximumNumber<>(10,20,2,35,44);
        Integer maxInt = intMax.findMax();
        printMax(maxInt);// expected output : Maximum value : 44
//        test case for floats
        FindMaximumNumber<Float> floatMax = new FindMaximumNumber<>(2.3f,7.8f,8.9f,15.7f,5.5f);
        Float maxFloat = floatMax.findMax();
        printMax(maxFloat);// expected output : Maximum value : 15.7
//        test case for Strings
        FindMaximumNumber<String> stringMax = new FindMaximumNumber<>("Pallavi", "Ajit", "", "Kshiti", "Ayansh");
        String maxString = stringMax.findMax();
        printMax(maxString);// expected output : Maximum value : Pallavi
    }
}