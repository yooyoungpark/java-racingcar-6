package racingcar;

import java.util.List;
import racingcar.view.InputView;

public class Application {

    public static void main(String[] args) {
        List<String> carNames = InputView.inputCarName();
        System.out.println(carNames);
        int gameCount = InputView.inputGameCount();
        System.out.println(gameCount);


    }
}