package bridge.validator;

import bridge.view.ErrorMessage;

public class InputCommonValidator {

    public static void checkNull(String input) {
        if (input.length() == 0) {
            throw new IllegalArgumentException(ErrorMessage.INPUT_BLANK.getError());
        }
    }

    public static void checkInputLength(String input) {
        if (input.length() > 1) {
            throw new IllegalArgumentException(ErrorMessage.COMMAND_LENGTH.getError());
        }
    }

    public static void checkLowerCase(String input) {
        String upper = input.toUpperCase();
        if (!input.equals(upper)) {
            throw new IllegalArgumentException(ErrorMessage.COMMAND_LOWER.getError());
        }
    }
}
