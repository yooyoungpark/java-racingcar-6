package racingcar.view;

import java.util.List;

public class OutputView {

    public static void printResult() {
        System.out.println("\n실행 결과");
    }

    public static void printCarScore(List<String> carNames, List<String> scores) {
        for (int i = 0; i < carNames.size(); i++) {
            System.out.println(carNames.get(i) + " : " + scores.get(i));
        }
        System.out.println();
    }

    public static String printWinner(List<String> carNames, int MaxScore) {
        return "최종 우승자 : ";
    }
}
