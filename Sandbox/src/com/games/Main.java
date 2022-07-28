package com.games;

public class Main {

    public static void main(String[] args) {

        String str1 = "The cat";
        String str2 = "a cat";
        String str3 = "an alligator";
        String str4 = "Jason";

        System.out.println(str1);
        System.out.println(removeArticle(str1));
        System.out.println();
        System.out.println(str2);
        System.out.println(removeArticle(str2));
        System.out.println();
        System.out.println(str3);
        System.out.println(removeArticle(str3));
        System.out.println();
        System.out.println(str4);
        System.out.println(removeArticle(str4));








    }


    public static String removeArticle(String str){
        String strWithoutArticle = str.toLowerCase();
        if(strWithoutArticle.startsWith("a ")){
            strWithoutArticle = str.substring(2);
        }
        else if(strWithoutArticle.startsWith("an ")){
            strWithoutArticle = str.substring(3);
        }
        else if(strWithoutArticle.startsWith("the ")){
            strWithoutArticle = str.substring(4);
        }

        return strWithoutArticle;
    }

    static int calculate(String x, String y) {
        int[][] dp = new int[x.length() + 1][y.length() + 1];

        for (int i = 0; i <= x.length(); i++) {
            for (int j = 0; j <= y.length(); j++) {
                if (i == 0) {
                    dp[i][j] = j;
                }
                else if (j == 0) {
                    dp[i][j] = i;
                }
                else {
                    dp[i][j] = min(dp[i - 1][j - 1]
                                    + costOfSubstitution(x.charAt(i - 1), y.charAt(j - 1)),
                            dp[i - 1][j] + 1,
                            dp[i][j - 1] + 1);
                }
            }
        }

        return dp[x.length()][y.length()];
    }

    public class EditDistanceRecursive {

        static int calculate(String x, String y) {
            if (x.isEmpty()) {
                return y.length();
            }

            if (y.isEmpty()) {
                return x.length();
            }

            int substitution = calculate(x.substring(1), y.substring(1))
                    + costOfSubstitution(x.charAt(0), y.charAt(0));
            int insertion = calculate(x, y.substring(1)) + 1;
            int deletion = calculate(x.substring(1), y) + 1;

            return min(substitution, insertion, deletion);
        }

        public static int costOfSubstitution(char a, char b) {
            return a == b ? 0 : 1;
        }

        public static int min(int... numbers) {
            return Arrays.stream(numbers)
                    .min().orElse(Integer.MAX_VALUE);
        }
    }
}

