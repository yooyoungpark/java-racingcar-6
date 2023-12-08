package racingcar;

import java.util.ArrayList;
import java.util.List;
import racingcar.domain.NumberGenerator;
import racingcar.domain.Referee;
import racingcar.view.InputView;
import racingcar.view.OutputView;

public class Application {
    public static void main(String[] args) {
        List<String> carNames = InputView.inputCarName();
        int gameCount = InputView.inputGameCount();
        NumberGenerator numberGenerator = new NumberGenerator();

        List<Integer> scores = new ArrayList<>();
        for (int i = 0; i < carNames.size(); i++) {
            scores.add(0);
        }

        OutputView.printResult();
        for (int i = 0; i < gameCount; i++) {
            numberGenerator.createScores(carNames, scores);
            OutputView.printCarScore(carNames, scores);
        }
        Referee referee = new Referee();
        int maxScore = referee.compareScores(scores);
        List<String> winners = referee.selectWinners(carNames, scores, maxScore);
        OutputView.printWinner(winners);
    }
}