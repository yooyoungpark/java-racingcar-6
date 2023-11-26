package racingcar;

import java.util.List;
import racingcar.domain.MoveOrStop;
import racingcar.domain.NumberGenerator;
import racingcar.domain.Referee;
import racingcar.view.InputView;
import racingcar.view.OutputView;

public class Application {
    public static void main(String[] args) {
        List<String> carNames = InputView.inputCarName();
        int gameCount = InputView.inputGameCount();
        NumberGenerator numberGenerator = new NumberGenerator();
        MoveOrStop moveOrStop = new MoveOrStop();
        int[] scores = new int[carNames.size()];
        OutputView.printResult();
        for (int i = 0; i < gameCount; i++) {
            //List<Integer> randomNumbers = numberGenerator.createRandomNumbers(carNames);
            //List<String> scores = moveOrStop.moveOneStep(carNames);
            //OutputView.printCarScore(carNames, scores);
            numberGenerator.createScores(carNames, scores);
            OutputView.printCarScore(carNames, scores);
        }
        Referee referee = new Referee();
        int maxScore = referee.compareScores(scores);
        List<String> winners = referee.selectWinners(carNames, scores, maxScore);
        OutputView.printWinner(winners);
    }
}