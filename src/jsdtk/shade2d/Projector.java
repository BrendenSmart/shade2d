package jsdtk.shade2d;

/**
 * @author Brenden Smart
 */
public interface Projector {

    void setLeft(float left);

    void setRight(float right);

    void setTop(float top);

    void setBottom(float bottom);

    void setDimensions(float left, float right, float top, float bottom);

    void project();

}
