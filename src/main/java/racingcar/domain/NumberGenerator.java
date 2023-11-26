package racingcar.domain;

import camp.nextstep.edu.missionutils.Randoms;
import java.util.ArrayList;
import java.util.List;

public class NumberGenerator {
    public NumberGenerator() {
    }

    public int[] createScores(List<String> cars, int[]scores) {
        //List<Integer> randomNumbers = new ArrayList<>();
        for (int i = 0; i < cars.size(); i++) {
            int randomNumber = Randoms.pickNumberInRange(0, 9);
            if (randomNumber >= 4) {
                scores[i]++;
            }
            //randomNumbers.add(number);
        }
        return scores;
        //return randomNumbers;
    }
}
