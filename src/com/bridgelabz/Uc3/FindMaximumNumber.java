package com.bridgelabz.Uc3;

public class FindMaximumNumber {

    //       Integer Element
    public void FindMaxInt(Integer a, Integer b, Integer c){
        int max = a;
        if((b.compareTo(max))>0){
            max = b;
        }
        if((c.compareTo(max))>0){
            max =c;
        }
        System.out.println("Maximum of " + a + "," + b + "," + c + " is: " + max);
    }
    public void FindMaxFloat(Float a, Float b, Float c){
        float max = a;
        if((b.compareTo(max))>0){
            max = b;
        }
        if((c.compareTo(max))>0){
            max =c;
        }
        System.out.println("Maximum of " + a + "," + b + "," + c + " is: " + max);
    }

    public void FindMaxString(String h, String i, String j) {
        String max = h;
        if ((i.compareTo(max)) > 0) {
            max = i;
        }
        if ((j.compareTo(max)) > 0) {
            max = j;
        }
        System.out.println("Maximum of " + h + "," + i + "," + j + " is: " + max);
    }
        public static void main(String[] args) {
        FindMaximumNumber max = new FindMaximumNumber();
        Integer a=30, b=20, c=10;
        System.out.println("Integer Values....");
//        test case 1 :- Given max Number at 1st Position return the same Number
        max.FindMaxInt(a, b, c);
//        test case 2 :- Given max Number at 2nd Position return the same Number
        max.FindMaxInt(b, a, c);
//        test case 3 :- Given max Number at 3rd Position return the same Number
        max.FindMaxInt(c, b, a);

        Float d=25.5f, e=15.5f, f=5.5f;

        System.out.println("Float Values....");
//        test case 1 :- Given max Number at 1st Position return the same Number
        max.FindMaxFloat(d, e, f);
//        test case 2 :- Given max Number at 2nd Position return the same Number
        max.FindMaxFloat(e, d, f);
//        test case 3 :- Given max Number at 3rd Position return the same Number
        max.FindMaxFloat(f, e, d);

            String h="Ajit", i="Pallavi", j="Kshitija";
            System.out.println("String Values....");
//        test case 1 :- Given max Number at 1st Position return the same Number
            max.FindMaxString(h, i, j);
//        test case 2 :- Given max Number at 2nd Position return the same Number
            max.FindMaxString(i, h, j);
//        test case 3 :- Given max Number at 3rd Position return the same Number
            max.FindMaxString(j, i, h);

    }
}
