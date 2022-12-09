package bridge;

import java.util.List;

/**
 * 다리 건너기 게임을 관리하는 클래스
 */
public class BridgeGame {
    private static final String SUCCESS = "O";
    private static final String FAIL = "X";
    private static final String RESTART = "R";
    private static int gameCount = 1;

    /**
     * 사용자가 칸을 이동할 때 사용하는 메서드
     * <p>
     * 이동을 위해 필요한 메서드의 반환 타입(return type), 인자(parameter)는 자유롭게 추가하거나 변경할 수 있다.
     */
    public String move(List<String> bridges, String moveCommand, int location) {
        if (bridges.get(location).equals(moveCommand)) {
            return SUCCESS;
        }
        return FAIL;
    }

    /**
     * 사용자가 게임을 다시 시도할 때 사용하는 메서드
     * <p>
     * 재시작을 위해 필요한 메서드의 반환 타입(return type), 인자(parameter)는 자유롭게 추가하거나 변경할 수 있다.
     */
    public boolean retry(String inputRestart) {
        if (inputRestart.equals(RESTART)) {
            gameCount++;
            return true;
        }
        return false;
    }

    public static int getCount() {
        return gameCount;
    }
}
