package com.tryonyourown.example;

public class Canvas {
    private Tool toolSelected;

    public void selectTool(Tools tool) {
        if(tool == Tools.RECTANGLE) {
            toolSelected = new Rectangle();
        }
    }
    public void mouseDown(int x, int y) {
        toolSelected.mouseDown(x,y);
    }
    public void mouseDrag(int x, int y) {
        toolSelected.mouseDrag(x, y);
    }
    public void mouseUp(int x, int y) {
        toolSelected.mouseUp(x, y);
    }
}
