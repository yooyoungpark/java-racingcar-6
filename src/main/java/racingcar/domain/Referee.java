package racingcar.domain;

import java.util.ArrayList;
import java.util.List;

public class Referee {

    int max;
    public Referee() {
    }

    public int compareScores(int[] scores) {
        int max = scores[0];
        for (int i = 1; i < scores.length; i++) {
            if (scores[i] > max) {
                max = scores[i];
            }
        }
        return max;
    }

    public List<String> selectWinners(List<String> carNames, int[] scores, int max) {
        List<String> winners = new ArrayList<>();
        for (int i = 0; i < scores.length; i++) {
            if (scores[i] == max){
                winners.add(carNames.get(i));
            }
        }
        return winners;
    }

}
