package jsdtk.shade2d;

public interface ShadeGraphics2D {

    void drawRectangle(float x, float y, float width, float height);

    void drawRectangle(float x, float y, float width, float height, Texture texture);

    void drawSquare(float x, float y, float sideSize);

    void drawSquare(float x, float y, float sideSize, Texture texture);

    void drawTriangle(float x1, float y1, float x2, float y2, float x3, float y3);

    void drawTriangle(float x1, float y1, float x2, float y2, float x3, float y3, Texture texture);


}
