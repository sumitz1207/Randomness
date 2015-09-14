import javafx.scene.Scene;
import javafx.scene.canvas.GraphicsContext;

public class GameScreen implements Screen {
    public GameScreen(Main app, Scene scene) {
        System.out.println("made");
    }
    public void draw(GraphicsContext gc, int width, int height) {
        gc.fillText("this", width / 2, height / 2);
    }
}
