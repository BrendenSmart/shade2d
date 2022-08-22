package jsdtk.shade2d.gl2d;

import jsdtk.shade2d.AbstractGameWindow;
import jsdtk.shade2d.Projector;

public final class GLProjector implements Projector {

    public GLProjector(AbstractGameWindow window) {
        if (Thread.currentThread() != window.getThread()) {
            throw new UnsupportedOperationException("Users of shade2d should not try to create Projectors");
        }


    }

    @Override
    public void setLeft(float left) {

    }

    @Override
    public void setRight(float right) {

    }

    @Override
    public void setTop(float top) {

    }

    @Override
    public void setBottom(float bottom) {

    }

    @Override
    public void setDimensions(float left, float right, float top, float bottom) {

    }

}
