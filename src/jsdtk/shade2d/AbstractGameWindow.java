package jsdtk.shade2d;

import static org.lwjgl.glfw.GLFW.*;

public abstract class AbstractGameWindow implements Runnable {

    private static byte winCount;

    private String title;

    private int width, height;

    private long window;

    private Thread windowThread;

    private boolean waitEvents;

    public AbstractGameWindow(String title, int width, int height, boolean resizable, boolean decorated) {
        init(title, width, height, resizable, decorated);
    }

    private void init(String title, int width, int height, boolean resizable, boolean decorated) {
        this.title = title;
        this.width = width;
        this.height = height;
        glfwDefaultWindowHints();
        glfwWindowHint(GLFW_RESIZABLE, resizable ? GLFW_TRUE : GLFW_FALSE);
        glfwWindowHint(GLFW_DECORATED, decorated ? GLFW_TRUE : GLFW_FALSE);
        glfwWindowHint(GLFW_VISIBLE, GLFW_FALSE);
        windowThread = new Thread(this, "shade2d-GameWindow Thread " + winCount++);
        windowThread.start();
    }

    @Override
    public void run() {
        create();
        runLoop();
    }

    private void runLoop() {
        while (!isCloseRequested()) {
            update();
            draw();
            if (waitEvents)
                glfwWaitEvents();
            else
                glfwPollEvents();
        }
    }

    private void create() {
        window = glfwCreateWindow(width, height, title, 0, 0);

        glfwDefaultWindowHints();
        glfwWindowHint(GLFW_RESIZABLE, GLFW_TRUE);

    }

    public abstract void update();

    public abstract void draw();

    public void glfwPoll() {
        glfwPollEvents();
    }

    public void glfwWait() {
        glfwWaitEvents();
    }

    public void setTitle(String title) {
        this.title = title;
        glfwSetWindowTitle(window, title);
    }


    public long getWindow() {
        return window;
    }


    public void setCloseRequested(boolean requested) {
        glfwSetWindowShouldClose(window, requested);
    }

    public boolean isCloseRequested() {
        return glfwWindowShouldClose(window);
    }

    public void setWaitEvents(boolean waitEvents) {
        this.waitEvents = waitEvents;
    }

    public boolean isWaitEvents() {
        return waitEvents;
    }

    public Thread getThread() {
        return windowThread;
    }

    public void dispose() {
        glfwDestroyWindow(window);
    }

    public void hide() {
        glfwHideWindow(window);
    }

    public void show() {
        glfwShowWindow(window);
    }


}
