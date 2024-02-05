package main;

public class Figur {
    double x;
    double y;

    Figur() {
        x = 4;
        y = 5;
    }

    Figur(double x, double y) {
        this.x = x;
        this.y = y;
    }

    double readX() {
        return x;
    }

    double readY() {
        return y;
    }
    
    void setX(double newX) {
        x = newX;
    }
    
    void setY(double newY) {
        y = newY;
    }
}
