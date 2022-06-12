package fun.doge2018.particleSystem.util;

import lombok.experimental.UtilityClass;

@UtilityClass
public class MathUtil {
    public double distance(float x, float y, float x1, float y1) {
        float xDistance = (x - x1);
        float yDistance = (y - y1);

        return Math.sqrt(
                xDistance * xDistance +
                yDistance * yDistance
        );
    }
}
