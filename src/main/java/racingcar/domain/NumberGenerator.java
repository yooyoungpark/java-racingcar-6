package racingcar.domain;

import camp.nextstep.edu.missionutils.Randoms;
import java.util.List;

public class NumberGenerator {
    public int createRandomNumbers() {
        int randomNum = Randoms.pickNumberInRange(0,9);
        return randomNum;
    }
}
