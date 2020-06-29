package com.tryonyourown.example;

/**
 * Hello State Patten in Java!
 *
 */
public class User
{
    public static void main( String[] args )
    {
        System.out.println( "Hello State Patten in Java!" );
        var canvas = new Canvas();
        canvas.selectTool(Tools.RECTANGLE);
        canvas.mouseDown(0,0);
        canvas.mouseDrag(100,0);
        canvas.mouseDrag(100,100);
        canvas.mouseDrag(0, 100);
        canvas.mouseDrag(0,0);
        canvas.mouseUp(0,0);
    }
}
