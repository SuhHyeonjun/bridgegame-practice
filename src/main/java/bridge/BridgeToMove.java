package bridge;

import bridge.view.Message;
import java.util.ArrayList;
import java.util.List;

public class BridgeToMove {
    private static final List<String> upBridge = new ArrayList<>();
    private static final List<String> downBridge = new ArrayList<>();
    private static final String UP = "U";
    private static final String DOWN = "D";
    private static final String BLANK = " ";

    public void makeMoveBridge(String moveCommand, String move) {
        addUpBridge(moveCommand, move);
        addDownBridge(moveCommand, move);
    }

    private static void addUpBridge(String moveCommand, String move) {
        if (moveCommand.equals(UP)) {
            upBridge.add(move);
            downBridge.add(BLANK);
        }
    }

    private static void addDownBridge(String moveCommand, String move) {
        if (moveCommand.equals(DOWN)) {
            upBridge.add(BLANK);
            downBridge.add(move);
        }
    }
}
