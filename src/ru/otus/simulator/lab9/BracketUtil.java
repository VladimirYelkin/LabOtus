package ru.otus.simulator.lab9;

public class BracketUtil {
    public static boolean isCorrectBrackets(String input, char bracketOpenSymbol, char bracketCloseSymbol) {
        int counterDifferenOpenCloseSymbol = 0;
        for (int i = 0; i < input.length(); i++) {
            if (bracketOpenSymbol == input.charAt(i)) {
                counterDifferenOpenCloseSymbol++;
            }
            if (bracketCloseSymbol == input.charAt(i)) {
                counterDifferenOpenCloseSymbol--;
            }
            if (counterDifferenOpenCloseSymbol < 0) {
                return false;
            }
        }
        return counterDifferenOpenCloseSymbol == 0;
    }

    private BracketUtil() {
    }

    public static void main(String[] args) {
        System.out.println("Ввод равного поличества открывающих и закрывающих скобок - " + BracketUtil.isCorrectBrackets("{{}}", '{', '}'));
        System.out.println("Ввод неравного поличества открывающих и закрывающих скобок - " + BracketUtil.isCorrectBrackets("{{}}}", '{', '}'));
    }
}
