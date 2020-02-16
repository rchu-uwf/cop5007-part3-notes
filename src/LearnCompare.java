/*
Trying to understand how compareTo works.

*/


public class LearnCompare {

    public static void main(String[] args) {
        String string1;
        String string2;

        string1 = "1";
        string2 = "2";
        System.out.println(string2.compareTo(string1));

        string1 = "b";
        string2 = "a";
        System.out.println(string2.compareTo(string1));

        string1 = "ba";
        string2 = "aa";
        System.out.println(string2.compareTo(string1));

        string1 = "b a";
        string2 = "a a";
        System.out.println(string2.compareTo(string1));

        string1 = "b a";
        string2 = "b a";
        System.out.println(string2.compareTo(string1));

        string1 = "gold";
        string2 = "gold";
        System.out.println(string2.compareTo(string1));


        string1 = "golden delicious";
        string2 = "granny smith";
        System.out.println(string2.compareTo(string1));

        string1 = "golden";
        string2 = "granny";
        System.out.println(string2.compareTo(string1));

    }

}
