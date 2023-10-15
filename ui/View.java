package homeWork3.ui;

import homeWork3.viewer.Viewer;

public interface View {
    void setViewer(Viewer viewer);

    void start();

    void print(String text);

    String scan();
}
