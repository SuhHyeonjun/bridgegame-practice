package bridge.view;

public enum ErrorMessage {
    ERROR_BRIDGE_RANGE("[ERROR] 3 이상 20 이하의 숫자를 입력해야 합니다."),
    ERROR_BLANK("[ERROR] 아무런 값을 입력하지 않았습니다."),
    ERROR_INPUT_TYPE("[ERROR] 문자를 입력할 수 없습니다.");

    private final String error;

    ErrorMessage(String error) {
        this.error = error;
    }

    public String getError() {
        return error;
    }
}
