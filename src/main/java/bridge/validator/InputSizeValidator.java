package bridge.validator;

import bridge.view.ErrorMessage;

public class InputSizeValidator {

    public static void checkInputSize(String inputSize) {
        checkSizeRange(inputSize);

    }

    private static void checkSizeRange(String inputSize) {
        int size = Integer.parseInt(inputSize);
        if (size < 3 || size > 20) {
            throw new IllegalArgumentException(ErrorMessage.ERROR_BRIDGE_RANGE.getError());
        }
    }


}