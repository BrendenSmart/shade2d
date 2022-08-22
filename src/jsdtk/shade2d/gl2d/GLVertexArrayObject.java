package jsdtk.shade2d.gl2d;

import org.lwjgl.BufferUtils;

import java.nio.FloatBuffer;

import static org.lwjgl.opengl.GL30.*;

public final class GLVertexArrayObject {

    public static final int GLRGBA = 4;

    public static final int GLRGB = 3;

    public static final int GL_NO_COLOR = 1;

    public static final int GL_TRIANGLES = 3;

    public static final int GL_RECTANGLES = 4;

    public static final int GL_SQUARES = GL_RECTANGLES;

    public static final int GL_LINES = 2;

    private FloatBuffer vertices;

    private int id;

    public GLVertexArrayObject(int vertexCount, int shape, int colorFormat) {

    }

    public void put(FloatBuffer vertices) {

    }

    public void put(float... vertices) {

    }

    public void subData(FloatBuffer vertices) {

    }


}
