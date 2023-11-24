package racingcar;

import java.util.List;
import racingcar.domain.MoveOrStop;
import racingcar.domain.NumberGenerator;
import racingcar.view.InputView;

public class Application {

    public static void main(String[] args) {
        List<String> carNames = InputView.inputCarName();
        int gameCount = InputView.inputGameCount();
        NumberGenerator numberGenerator = new NumberGenerator();
        List<Integer> randomNumbers = numberGenerator.createRandomNumbers(carNames);
        System.out.println(randomNumbers);
        MoveOrStop moveOrStop = new MoveOrStop();
        moveOrStop.moveOneStep(randomNumbers);

    }
}