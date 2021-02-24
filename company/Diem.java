package com.company;

public class Diem {
    private int x, y;

    public Diem(){}

    public Diem(int x, int y){
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    //-------------end get set

    public double distance(Diem diem){
        return Math.sqrt(Math.pow((this.x - diem.getX()),2) + Math.pow((this.y - diem.getY()),2));
    }

    public double distance(int x ,int y){
        return Math.sqrt(Math.pow((this.x - x),2) + Math.pow((this.y - y),2));
    }

    @Override
    public String toString() {
        return "(x, y)" + "(" + x + ", "+ y+ " )";
    }
}
