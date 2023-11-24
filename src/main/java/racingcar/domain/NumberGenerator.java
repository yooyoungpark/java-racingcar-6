package racingcar.domain;

import camp.nextstep.edu.missionutils.Randoms;
import java.util.ArrayList;
import java.util.List;

public class NumberGenerator {
    public List<Integer> createRandomNumbers(List<String> carName) {
        List<Integer> randomNumbers = new ArrayList<>();
        for (int i = 0; i < carName.size(); i++) {
            int number = Randoms.pickNumberInRange(0,9);
            randomNumbers.add(number);
        }
        return randomNumbers;
    }
}
