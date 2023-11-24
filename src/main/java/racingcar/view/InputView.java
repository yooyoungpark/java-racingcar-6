package racingcar.view;

import camp.nextstep.edu.missionutils.Console;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class InputView {
    public static List<String> inputCarName(){
        System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)");
        String inputName = Console.readLine();
        //쉼표(,)를 기준으로 구분
        List<String> inputCarNames = Arrays.asList(inputName.split(","));
        //6자 이상으로 입력한 경우 예외 발생
        for (String inputCarName : inputCarNames){
            if (inputCarName.length() > 5){
                throw new IllegalArgumentException("자동차 이름은 5자 이하로 입력하세요.");
            }
        }
        return inputCarNames;
    }

    public static int inputGameCount(){
        System.out.println("시도할 회수는 몇회인가요?");
        int inputNum = Integer.parseInt(Console.readLine());
        return inputNum;
    }
}
