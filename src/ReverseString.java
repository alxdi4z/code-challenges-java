package org.challenges;

import java.util.stream.IntStream;

public class ReverseString {
    public static void main(String[] args) {
        String str = "Revertendo essa string";

        StringBuilder tempt1 = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i-- ) {
            tempt1.append(str.charAt(i));
        }
        // eficiente mas nem tanto, ainda tem um loop
        System.out.printf("Primeira forma (StringBuilder) {Eficiente}: %s\n", tempt1);

        System.out.printf("Segunda forma (StringBuilder reverse) {Mais Eficiente}: %s\n", new StringBuilder(str).reverse());

        // tem que criar objetos intermediarios, o que eh lento
        String tempt3 = IntStream.iterate(str.length()-1, n -> n - 1)
                .limit(str.length())
                .mapToObj(n -> String.valueOf(str.charAt(n)))
                .collect(StringBuilder::new, StringBuilder::append, StringBuilder::append)
                .toString();
        System.out.printf("Terceira forma (IntStream) {Nada Eficiente}: %s", tempt3);
    }
}
