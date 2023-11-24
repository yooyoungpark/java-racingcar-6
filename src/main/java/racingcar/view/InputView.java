package racingcar.view;

import camp.nextstep.edu.missionutils.Console;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class InputView {
    public static List<String> inputCarName(){
        System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)");
        String inputName = Console.readLine();
        List<String> inputCarNames = Arrays.asList(inputName.split(","));
        return inputCarNames;
    }

    public static int inputGameCount(){
        System.out.println("시도할 회수는 몇회인가요?");
        int inputNum = Integer.parseInt(Console.readLine());
        return inputNum;
    }
}
