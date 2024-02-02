package com.csc205.project1;

public class point {
    private double x;
    private double y;


    public void rotate(double theta) {

        double x1 = x;
        double y1 = y;

        this.x = x1 * Math.cos(theta) - y1 * Math.sin(theta);


    }
}
