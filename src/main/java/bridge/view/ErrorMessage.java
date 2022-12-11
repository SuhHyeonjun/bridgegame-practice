package bridge.view;

public enum ErrorMessage {
    BRIDGE_RANGE("[ERROR] 3 이상 20 이하의 숫자를 입력해야 합니다."),
    INPUT_BLANK("[ERROR] 아무런 값을 입력하지 않았습니다."),
    INPUT_TYPE("[ERROR] 문자를 입력할 수 없습니다."),
    MOVE_COMMAND("[ERROR] U 또는 D를 입력해야 합니다."),
    COMMAND_LENGTH("[ERROR] 하나의 문자만 입력할 수 있습니다."),
    COMMAND_LOWER("[ERROR] 대문자로 입력해야 합니다."),
    RESTART_COMMAND("[ERROR] R 또는 Q를 입력해야 합니다.");

    private final String error;

    ErrorMessage(String error) {
        this.error = error;
    }

    public String getError() {
        return error;
    }
}
