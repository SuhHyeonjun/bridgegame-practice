package bridge.view;

public enum Message {
    GAME_START("다리 건너기 게임을 시작합니다."),
    INPUT_SIZE("다리의 길이를 입력해주세요."),
    INPUT_MOVE("이동할 칸을 선택해주세요. (위: U, 아래: D)"),
    INPUT_RETRY("게임을 다시 시도할지 여부를 입력해주세요. (재시도: R, 종료: Q)"),
    GAME_RESULT("최종 게임 결과"),
    SUCCESS_OR_FAILURE("게임 성공 여부: "),
    SUCCESS("성공"),
    FAILURE("실패"),
    TRY_COUNT("총 시도한 횟수: ");

    private final String message;

    Message(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
