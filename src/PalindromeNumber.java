package org.challenges;

public class PalindromeNumber {
//    desconstruindo numero, revertendo e comparando
    private static boolean palindromeNumber(int x) {
        int aux = 0;
        int number = x;
        while (x > 0) {
            aux = aux * 10 + x % 10;
            x /= 10;
        }
        return aux == number;
    }

//    convertendo numero para string, nao eh a melhor solucao
//    private static boolean palindromeNumber(int x) {
//        if (x < 0) return false;
//        char[] charArray = String.valueOf(x).toCharArray();
//        int j = charArray.length - 1;
//        for (int i=0; i < charArray.length; i++) {
//            if (i == j) break;
//            if (charArray[i] != charArray[j]) return false;
//            j--;
//        }
//        return true;
//    }

    public static void main(String[] args) {
        // inputs
        System.out.println(palindromeNumber(121));
        System.out.println(palindromeNumber(10));
        System.out.println(palindromeNumber(-121));
        System.out.println(palindromeNumber(56365));
    }
}
