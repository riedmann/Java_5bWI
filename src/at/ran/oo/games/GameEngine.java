package at.ran.oo.games;

public class GameEngine {

    private BasicGame game;

    public GameEngine(BasicGame game) {
        this.game = game;
    }

    public void start() {
        game.init();

        while (true) {
            this.game.update();
            this.game.render();
        }
    }

}
