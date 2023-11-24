# 자바 자동차 경주 게임

## 🚙 기능 명세
- [x] 자동차 경주에 참여 할 n대의 자동차 이름을 입력한다 -InputView#inputCarName()
    - [x] 자동차 이름은 쉼표(,)를 기준으로 구분하며 이름은 5자 이하만 가능하다.
- [x] 사용자는 시도할 횟수를 입력한다. -InputView#inputGameCount()
- [ ] 0에서 9 사이에서 무작위 값을 생성한다. -NumberGenerator#createRandomNumbers()
    - [ ]무작위 값이 4 이상일 경우에만 전진한다. -MoveOrStop#moveOneStep()
- [ ] 각 차수별 실행 결과를 자동차 이름과 함께 출력한다. #OutputView#printCarScore()
- [ ] 게임이 종료되면 결과를 비교할 수 있다. -Referee#compareResult()
    - [ ] '-'갯수가 가장 많은 자동차를 알 수 있다. 
- [ ] 최종 우승자가 여러 명일 경우 쉼표(,)를 이용하여 구분하여 출력한다. -OutputView#printWinner()
- [ ] 사용자가 잘못된 값을 입력할 경우 IllegalArgumentException을 발생시킨 후 애플리케이션 종료
    - [x] 자동차 이름이 5글자를 초과한 경우
    - [x] 시도할 횟수에 0이하의 수를 입력한 경우
    - [ ] 시도할 횟수에 문자를 입력한 경우