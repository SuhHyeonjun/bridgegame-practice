package bridge.validator;

import bridge.view.ErrorMessage;

public class InputMovingValidator {

    public static void checkInputMove(String inputMove) {
        InputCommonValidator.checkInputLength(inputMove);
        InputCommonValidator.checkNull(inputMove);
        InputCommonValidator.checkLowerCase(inputMove);
        checkCommand(inputMove);
    }

    private static void checkCommand(String inputMove) {
        if (!inputMove.equals("U") && !inputMove.equals("D")) {
            throw new IllegalArgumentException(ErrorMessage.MOVE_COMMAND.getError());
        }
    }
}
