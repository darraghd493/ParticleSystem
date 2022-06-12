package fun.doge2018.particleSystem;

import lombok.Getter;
import lombok.Setter;
import org.lwjgl.opengl.Display;
import org.lwjgl.util.vector.Vector2f;

import java.util.Random;

@Getter
@Setter
public class Particle {
    private static final Random random = new Random();

    private Vector2f velocity, position;
    private float size, alpha;

    public Particle() {
        velocity = new Vector2f((float) (Math.random() * 2.0f - 1.0f),
                (float) (Math.random() * 2.0f - 1.0f));
        position = new Vector2f(random.nextInt(Display.getWidth()),
                random.nextInt(Display.getHeight()));
        size = (float) (Math.random() * 4.0f) + 1.0f;
        alpha = (float) (Math.random() * 255.0f) + 1.0f;
    }

    public Particle(float x, float y) {
        velocity = new Vector2f((float) (Math.random() * 2.0f - 1.0f),
                (float) (Math.random() * 2.0f - 1.0f));
        position = new Vector2f(x, y);
        size = (float) (Math.random() * 4.0f) + 1.0f;
        alpha = (float) (Math.random() * 255.0f) + 1.0f;
    }

    public float getX() {
        return position.getX();
    }

    public void setX(float x) {
        position.setX(x);
    }

    public float getY() {
        return position.getY();
    }

    public void setY(float y) {
        position.setY(y);
    }

    public void tick(int delta, float speed) {
        position.x += velocity.getX() * delta * speed;
        position.y += velocity.getY() * delta * speed;

        if (alpha < 255.0f)
            alpha += 0.05f * delta;

        if (position.getX() > Display.getWidth())
            position.setX(0);

        if (position.getX() < 0)
            position.setX(Display.getWidth());

        if (position.getY() > Display.getHeight())
            position.setY(0);

        if (position.getY() < 0)
            position.setY(Display.getHeight());
    }


}
