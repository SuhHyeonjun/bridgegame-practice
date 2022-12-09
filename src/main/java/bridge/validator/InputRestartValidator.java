package bridge.validator;

import bridge.view.ErrorMessage;
import bridge.view.Message;

public class InputRestartValidator {
    private static final String RESTART = "R";
    private static final String QUIT = "Q";

    public static void checkInputRestart(String inputRestart) {
        InputCommonValidator.checkInputLength(inputRestart);
        InputCommonValidator.checkNull(inputRestart);
        InputCommonValidator.checkLowerCase(inputRestart);
        checkInputDate(inputRestart);
    }

    private static void checkInputDate(String inputRestart) {
        if (!inputRestart.equals(RESTART) && !inputRestart.equals(QUIT)) {
            throw new IllegalArgumentException(ErrorMessage.RESTART_COMMAND.getError());
        }
    }
}
