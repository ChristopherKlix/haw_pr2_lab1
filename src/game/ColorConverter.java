package game;

public class ColorConverter {
    public static int[] hsvToRgb(float hue, float saturation, float value) {
        float chroma = value * saturation;
        float hueSegment = hue / 60f;
        float x = chroma * (1 - Math.abs((hueSegment % 2) - 1));
        float red = 0, green = 0, blue = 0;

        if (hueSegment >= 0 && hueSegment < 1) {
            red = chroma;
            green = x;
        } else if (hueSegment >= 1 && hueSegment < 2) {
            red = x;
            green = chroma;
        } else if (hueSegment >= 2 && hueSegment < 3) {
            green = chroma;
            blue = x;
        } else if (hueSegment >= 3 && hueSegment < 4) {
            green = x;
            blue = chroma;
        } else if (hueSegment >= 4 && hueSegment < 5) {
            red = x;
            blue = chroma;
        } else if (hueSegment >= 5 && hueSegment < 6) {
            red = chroma;
            blue = x;
        }

        float valueMinusChroma = value - chroma;
        red += valueMinusChroma;
        green += valueMinusChroma;
        blue += valueMinusChroma;

        int[] rgb = new int[3];
        rgb[0] = Math.round(red * 255f);
        rgb[1] = Math.round(green * 255f);
        rgb[2] = Math.round(blue * 255f);

        return rgb;
    }
}
