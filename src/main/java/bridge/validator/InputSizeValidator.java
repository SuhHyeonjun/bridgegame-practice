package bridge.validator;

import bridge.view.ErrorMessage;

public class InputSizeValidator {

    public static void checkInputSize(String inputSize) {
        checkType(inputSize);
        InputCommonValidator.checkNull(inputSize);
        checkSizeRange(inputSize);
    }

    private static void checkSizeRange(String inputSize) {
        int size = Integer.parseInt(inputSize);
        if (size < 3 || size > 20) {
            throw new IllegalArgumentException(ErrorMessage.BRIDGE_RANGE.getError());
        }
    }

    private static void checkType(String inputSize) {
        String regex = "^[0-9]*$";
        if (!inputSize.matches(regex)) {
            throw new IllegalArgumentException(ErrorMessage.INPUT_TYPE.getError());
        }
    }
}
