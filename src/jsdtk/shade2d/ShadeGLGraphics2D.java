package jsdtk.shade2d;

import jsdtk.shade2d.gl2d.GLVertexArrayObject;
import jsdtk.shade2d.gl2d.GLVertexElementObject;

public class ShadeGLGraphics2D implements ShadeGraphics2D {

    private GLVertexArrayObject vao;

    private GLVertexElementObject veo;

    protected ShadeGLGraphics2D(AbstractGameWindow window) {
        vao = new GLVertexArrayObject(0, 0, 0);
        veo = new GLVertexElementObject();
    }

    @Override
    public void drawRectangle(float x, float y, float width, float height) {

    }

    @Override
    public void drawRectangle(float x, float y, float width, float height, Texture texture) {

    }

    @Override
    public void drawSquare(float x, float y, float sideSize) {

    }

    @Override
    public void drawSquare(float x, float y, float sideSize, Texture texture) {

    }

    @Override
    public void drawTriangle(float x1, float y1, float x2, float y2, float x3, float y3) {

    }

    @Override
    public void drawTriangle(float x1, float y1, float x2, float y2, float x3, float y3, Texture texture) {

    }

}
