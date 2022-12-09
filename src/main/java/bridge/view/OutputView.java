package bridge.view;

import static bridge.BridgeToMove.getDownBridge;
import static bridge.BridgeToMove.getUpBridge;

import bridge.BridgeGame;
import java.util.List;

/**
 * 사용자에게 게임 진행 상황과 결과를 출력하는 역할을 한다.
 */
public class OutputView {
    private static final String CENTER_BAR = " | ";
    private static final String LEFT = "[ ";
    private static final String RIGHT = " ]";
    private static final String SUCCESS = "성공";
    private static final String FAIL = "실패";

    /**
     * 현재까지 이동한 다리의 상태를 정해진 형식에 맞춰 출력한다.
     * <p>
     * 출력을 위해 필요한 메서드의 인자(parameter)는 자유롭게 추가하거나 변경할 수 있다.
     */
    public void printMap() {
        System.out.println(LEFT + joinCenterBar(getUpBridge()) + RIGHT);
        System.out.println(LEFT + joinCenterBar(getDownBridge()) + RIGHT);
        System.out.println();
    }

    private String joinCenterBar(List<String> upDownBridges) {
        return String.join(CENTER_BAR, upDownBridges);
    }

    /**
     * 게임의 최종 결과를 정해진 형식에 맞춰 출력한다.
     * <p>
     * 출력을 위해 필요한 메서드의 인자(parameter)는 자유롭게 추가하거나 변경할 수 있다.
     */
    public void printResult(int bridgeSize, int location) {
        System.out.println();
        System.out.println(Message.GAME_RESULT.getMessage());
        printMap();
        printSuccessOrFailure(bridgeSize, location);
        System.out.println(Message.TRY_COUNT.getMessage() + BridgeGame.getCount());
    }

    private static void printSuccessOrFailure(int bridgeSize, int location) {
        if (bridgeSize == location) {
            System.out.println(Message.SUCCESS_OR_FAILURE.getMessage() + SUCCESS);
        }
        if (bridgeSize != location) {
            System.out.println(Message.SUCCESS_OR_FAILURE.getMessage() + FAIL);
        }
    }
}
