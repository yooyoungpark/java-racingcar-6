package racingcar.domain;

import camp.nextstep.edu.missionutils.Randoms;
import java.util.ArrayList;
import java.util.List;

public class NumberGenerator {
    public static final int randomNumber_range_min = 0;
    public static final int randomNumber_range_max = 9;
    public static final int getScore = 4;

    public NumberGenerator() {
    }

    public int[] createScores(List<String> cars, int[] scores) {
        //List<Integer> randomNumbers = new ArrayList<>();
        for (int i = 0; i < cars.size(); i++) {
            int randomNumber = Randoms.pickNumberInRange(randomNumber_range_min, randomNumber_range_max);
            if (randomNumber >= getScore) {
                scores[i]++;
            }
            //randomNumbers.add(number);
        }
        return scores;
        //return randomNumbers;
    }
}
