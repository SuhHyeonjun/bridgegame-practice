package bridge.controller;

import bridge.BridgeGame;
import bridge.BridgeMaker;
import bridge.BridgeNumberGenerator;
import bridge.BridgeRandomNumberGenerator;
import bridge.BridgeToMove;
import bridge.view.InputView;
import bridge.view.OutputView;

import java.util.List;

public class GameController {
    private static final String FAIL = "X";
    private final InputView inputView = new InputView();
    private final BridgeNumberGenerator bridgeNumberGenerator = new BridgeRandomNumberGenerator();
    private final BridgeMaker bridgeMaker = new BridgeMaker(bridgeNumberGenerator);
    private final BridgeGame bridgeGame = new BridgeGame();
    private final OutputView outputView = new OutputView();
    private static int location = 0;
    private static boolean status = true;
    private static List<String> bridges;

    public GameController() {
        location = 0;
        status = true;
        BridgeToMove.initBridges();
    }

    public void start() {
        int bridgeSize = inputView.readBridgeSize();
        bridges = bridgeMaker.makeBridge(bridgeSize);
        System.out.println(bridges.toString());
        runGame();
        outputView.printResult(bridgeSize, location);
    }

    private void runGame() {
        while (status && location < bridges.size()) {
            String moveCommand = inputView.readMoving();
            String moveResult = bridgeGame.move(bridges, moveCommand, location);
            BridgeToMove.makeMoveBridge(moveCommand, moveResult);
            outputView.printMap();
            restartGame(moveResult);
            location++;
        }
    }

    private void restartGame(String moveResult) {
        if (moveResult.equals(FAIL)) {
            String inputRestart = inputView.readGameCommand();
            if (bridgeGame.retry(inputRestart)) {
                new GameController();
                runGame();
            }
            status = false;
        }
    }
}
