package com.tryonyourown.example;

public class Canvas {
    private Tool toolSelected;

    public void selectTool(Tools tool) {
        if(tool == Tools.RECTANGLE) {
            toolSelected = new Rectangle();
            System.out.println("Rectangle icon highlighted on the Canvas");
        } else if(tool == Tools.CIRCLE) {
            System.out.println("Circle icon highlighted on the Canvas");
            toolSelected = new Circle();
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
