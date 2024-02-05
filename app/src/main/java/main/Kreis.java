package main;

public class Kreis {
    double x;
    double y;
    double radius;

    Kreis() {
        x = 4;
        y = 5;
        radius = 3;
    }

    Kreis(double x, double y, double radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }
    
    double readX() {
        return x;
    }

    double readY() {
        return y;
    }
    
    double readRadius() {
        return radius;
    }
    
    void setX(double newX) {
        x = newX;
    }

    void setY(double newY) {
        y = newY;
    }
    
    void setRadius(double newRadius) {
        radius = newRadius > 0 ? newRadius : 1;
    }
}
