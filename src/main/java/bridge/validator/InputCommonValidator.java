package bridge.validator;

import bridge.view.ErrorMessage;

public class InputCommonValidator {

    public static void checkCommonError(String input) {

    }

    private static void checkNull(String input) {
        if (input.length() == 0) {
            throw new IllegalArgumentException(ErrorMessage.ERROR_BLANK.getError());
        }
    }
}
