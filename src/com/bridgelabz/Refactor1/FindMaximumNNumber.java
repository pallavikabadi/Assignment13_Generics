package com.bridgelabz.Refactor1;

public class FindMaximumNNumber {
    public static <T extends Comparable<T>> T findMax(T a, T b, T c){

//
        T max = a;
        if((b.compareTo(max))>0){
            max = b;
        }
        if((c.compareTo(max))>0){
            max =c;
        }
        return max;
    }

    public static void main(String[] args) {
        FindMaximumNNumber max = new FindMaximumNNumber();
        Integer a=30, b=20, c=10;
        System.out.println("Integer Values....");
//        test case 1 :- Given max Number at 1st Position return the same Number
        int max1 =  findMax(a, b, c);
        System.out.println(max1);
//        test case 2 :- Given max Number at 2nd Position return the same Number
        int max2 = findMax(b, a, c);
        System.out.println(max2);
//        test case 3 :- Given max Number at 3rd Position return the same Number
        int max3 = findMax(c, b, a);
        System.out.println(max3);
        Float d=25.5f, e=15.5f, f=5.5f;

        System.out.println("Float Values....");
//        test case 1 :- Given max Number at 1st Position return the same Number
        float max4 = findMax(d, e, f);
        System.out.println(max4);
//        test case 2 :- Given max Number at 2nd Position return the same Number
        float max5 = findMax(e, d, f);
        System.out.println(max5);

//        test case 3 :- Given max Number at 3rd Position return the same Number
        float max6 = findMax(f, e, d);
        System.out.println(max6);

        String h="Ajit", i="Pallavi", j="Kshitij";
        System.out.println("String Values....");
//        test case 1 :- Given max Number at 1st Position return the same Number
        String max7 = findMax(h, i, j);
        System.out.println(max7);
//        test case 2 :- Given max Number at 2nd Position return the same Number
        String max8 = findMax(i, h, j);
        System.out.println(max8);
//        test case 3 :- Given max Number at 3rd Position return the same Number
        String max9 = findMax(j, i, i);
        System.out.println(max9);


    }
}
