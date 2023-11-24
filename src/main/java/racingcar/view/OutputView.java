package racingcar.view;

import java.util.List;

public class OutputView {

    public static void printResult() {
        System.out.println("\n실행 결과");
    }

    public static void printCarScore(List<String> carNames, List<Integer> randomNumbers) {
        for (int j = 0; j < carNames.size(); j++) {
            System.out.println(carNames.get(j) + " : " + randomNumbers.get(j));
        }
        System.out.println();
    }

    public static String printWinner(String carname) {
        return "최종 우승자 : " + carname;
    }
}
