package bridge.view;

import static camp.nextstep.edu.missionutils.Console.readLine;

import bridge.validator.InputMovingValidator;
import bridge.validator.InputSizeValidator;

/**
 * 사용자로부터 입력을 받는 역할을 한다.
 */
public class InputView {

    /**
     * 다리의 길이를 입력받는다.
     */
    public int readBridgeSize() {
        System.out.println(Message.INPUT_SIZE.getMessage());
        String inputSize = readLine();
        try {
            InputSizeValidator.checkInputSize(inputSize);
        } catch (Exception error) {
            System.out.println(error.getMessage());
            return readBridgeSize();
        }
        int bridgeSize = Integer.parseInt(inputSize);
        return bridgeSize;
    }

    /**
     * 사용자가 이동할 칸을 입력받는다.
     */
    public String readMoving() {
        System.out.println(Message.INPUT_MOVE.getMessage());
        String inputMove = readLine();
        try {
            InputMovingValidator.checkInputMove(inputMove);
        } catch (Exception error) {
            System.out.println(error.getMessage());
            return readMoving();
        }
        return inputMove;
    }

    /**
     *
     * 사용자가 게임을 다시 시도할지 종료할지 여부를 입력받는다.
     */
    public String readGameCommand() {
        return null;
    }
}
