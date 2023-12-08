package racingcar.domain;

public class CarName {
    private String carName;

    public CarName(String carName) {
        if (carName.length() > 5) {
            throw new IllegalArgumentException("자동차 이름은 5자 이하로 입력하세요.");
        }
        this.carName = carName;
    }

    public String getCarName() {
        return carName;
    }
}

