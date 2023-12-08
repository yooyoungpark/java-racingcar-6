package racingcar.domain;

import camp.nextstep.edu.missionutils.Randoms;
import java.util.List;

public class NumberGenerator {
    public static final int randomNumber_range_min = 0;
    public static final int randomNumber_range_max = 9;
    public static final int getScore = 4;

    public NumberGenerator() {
    }

    public void createScores(List<String> cars, List<Integer> scores) {
        System.out.println("이전 점수 : " + scores);
        for (int i = 0; i < cars.size(); i++) {
            int randomNumber = Randoms.pickNumberInRange(randomNumber_range_min, randomNumber_range_max);
            if (randomNumber >= getScore) {
                int score = scores.get(i);
                scores.remove(i);
                scores.add(i, score + 1);
            }
        }
        System.out.println("바뀐 점수 : " + scores);
    }
}
