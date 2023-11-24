package racingcar.domain;

import java.util.List;

public class MoveOrStop {
    public void moveOneStep(List<Integer> randomNumbers) {
        for (Integer randomNumber : randomNumbers) {
            if (randomNumber >= 4) {
                System.out.println("-");
            }
            if (randomNumber < 4) {
                System.out.println();
            }
        }
    }
}
