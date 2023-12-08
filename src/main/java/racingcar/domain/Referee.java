package racingcar.domain;

import java.util.ArrayList;
import java.util.List;

public class Referee {

    public Referee() {
    }

    public int compareScores(List<Integer> scores) {
        int max = scores.get(0);
        for (int i = 1; i < scores.size(); i++) {
            if (scores.get(i) > max) {
                max = scores.get(i);
            }
        }
        return max;
    }

    public List<String> selectWinners(List<String> carNames, List<Integer> scores, int max) {
        List<String> winners = new ArrayList<>();
        for (int i = 0; i < scores.size(); i++) {
            if (scores.get(i) == max) {
                winners.add(carNames.get(i));
            }
        }
        return winners;
    }
}
