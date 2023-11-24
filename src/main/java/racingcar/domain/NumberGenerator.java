package racingcar.domain;

import camp.nextstep.edu.missionutils.Randoms;
import java.util.ArrayList;
import java.util.List;

public class NumberGenerator {
    public NumberGenerator() {
    }

    public List<Integer> createRandomNumbers(List<String> cars) {
        List<Integer> randomNumbers = new ArrayList<>();
        for (int i = 0; i < cars.size(); i++) {
            int number = Randoms.pickNumberInRange(0, 9);
            randomNumbers.add(number);
        }
        return randomNumbers;
    }
}
