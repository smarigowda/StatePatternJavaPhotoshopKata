package com.tryonyourown.example;

public class Rectangle implements Tool{
    public void mouseDown(int x, int y) {
        System.out.println(String.format("Mouse down at (%d, %d)", x, y));
        System.out.println("Drag the mouse to draw a rectangle");
    }
    public void mouseUp(int x, int y) {
        System.out.println(String.format("Mouse up at (%d, %d)", x, y));
        System.out.println("------------------------------------");
        System.out.println("A Rectangle is drawn successfully !");
    }
    public  void mouseDrag(int x, int y) {
        System.out.println(String.format("Mouse dragged to (%d, %d)", x, y));
    }
}
