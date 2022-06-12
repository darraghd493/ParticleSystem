package fun.doge2018.particleSystem.util;

import lombok.experimental.UtilityClass;
import org.lwjgl.opengl.GL11;

@UtilityClass
public class RenderUtil {
    public void enableSmoothing() {
        GL11.glEnable(GL11.GL_LINE_SMOOTH);
        GL11.glEnable(GL11.GL_POINT_SMOOTH);
    }

    public void disableSmoothing() {
        GL11.glDisable(GL11.GL_LINE_SMOOTH);
        GL11.glDisable(GL11.GL_POINT_SMOOTH);
    }

    public void drawLine(float x, float y, float x1, float y1, float alpha) {
        GL11.glColor4f(255.0f, 255.0f, 255.0f, alpha);
        GL11.glLineWidth(0.5f);
        GL11.glBegin(GL11.GL_LINES);

        GL11.glVertex2f(x, y);
        GL11.glVertex2f(x1, y1);
        GL11.glEnd();
    }

    public void drawParticle(float x, float y, float size, float alpha) {
        GL11.glColor4f(1.0f, 1.0f,1.0f, alpha / 255.0f);
        GL11.glPointSize(size);
        GL11.glBegin(GL11.GL_POINTS);
        GL11.glVertex2f(x, y);
        GL11.glEnd();
    }
}
