package com.bridgelabz.Uc1;

public class FindMaximumNumber {
    public void FindMaxInt(Integer a, Integer b, Integer c) {
        int max = a;
        if ((b.compareTo(max)) > 0) {
            max = b;
        }
        if ((c.compareTo(max)) > 0) {
            max = c;
        }
        System.out.println("Maximum of " + a + "," + b + "," + c + " is: " + max);
    }

    public static void main(String[] args) {
        FindMaximumNumber max = new FindMaximumNumber();
        Integer a = 30, b = 20, c = 10;
        System.out.println("Integer Values....");
//        test case 1 :- Given max Number at 1st Position return the same Number
        max.FindMaxInt(a, b, c);
//        test case 2 :- Given max Number at 2nd Position return the same Number
        max.FindMaxInt(b, a, c);
//        test case 3 :- Given max Number at 3rd Position return the same Number
        max.FindMaxInt(c, b, a);
    }
}
