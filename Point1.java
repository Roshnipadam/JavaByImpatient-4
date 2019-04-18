package com.random.kafka;

public class Point1 {
    private double x, y;

    public Point1(double x, double y){
        this.x=x;
        this.y=y;

    }
    double getX(){
        return x;

    }

    double getY(){
        return y;

    }

    public static class labelpoint extends Point1{
        private String label;

        public labelpoint(String label, double x, double y) {
            super(x, y);
            this.label = label;
        }
        public String getLabel() {
            return label;
        }
        public static void main(String[] args) {
            labelpoint lpoint = new labelpoint("Point", 1.0, 1.0);
            System.out.println(lpoint.getLabel() + " " + lpoint.getX() + " " + lpoint.getY());
        }
    }





}

