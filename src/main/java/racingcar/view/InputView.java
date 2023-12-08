package racingcar.view;

import camp.nextstep.edu.missionutils.Console;
import java.util.Arrays;
import java.util.List;

public class InputView {
    public static final int carNameLength_Max = 5;

    public static List<String> inputCarName() {
        try {
            System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)");
            String inputName = Console.readLine();
            List<String> inputCarNames = Arrays.asList(inputName.split(","));
            for (String inputCarName : inputCarNames) {
                if (inputCarName.length() > carNameLength_Max) {
                    throw new IllegalArgumentException("이름은 5자 이하로 입력해 주세요.");
                }
            }
            return inputCarNames;
        } catch (IllegalArgumentException e) {
            OutputView.printError(e.getMessage());
            return inputCarName();
        }
    }

    public static int inputGameCount() {
        try {
            System.out.println("시도할 회수는 몇회인가요?");
            int inputNum = inputNumber();
            if (inputNum <= 0) {
                throw new IllegalArgumentException("1이상의 수를 입력하세요.");
            }
            return inputNum;
        } catch (IllegalArgumentException e) {
            OutputView.printError(e.getMessage());
            return inputGameCount();
        }
    }

    private static int inputNumber() {
        try {
            String input = Console.readLine();
            return Integer.parseInt(input);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("숫자를 입력하세요.");
        }
    }
}