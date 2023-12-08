package racingcar.view;

import java.util.List;

public class OutputView {

    public static void printResult() {
        System.out.println("\n실행 결과");
    }

    public static void printCarScore(List<String> carNames, List<Integer> scores) {
        for (int i = 0; i < carNames.size(); i++) {
            System.out.print(carNames.get(i) + " : ");
            printScoreBar(scores.get(i));
            System.out.println();
        }
        System.out.println();
    }

    public static void printScoreBar(int score) {
        for (int i = 0; i < score; i++) {
            System.out.print("-");
        }
    }

    public static void printWinner(List<String> winners) {
        String winner = String.join(", ", winners);
        System.out.println("최종 우승자 : " + winner);
    }

    public static void printError(String errorMessage) {
        System.out.println("[ERROR] " + errorMessage);
    }
}
