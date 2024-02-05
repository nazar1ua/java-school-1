package main;

public class App {
    public static void main(String[] args) {
        Figur figur = new Figur(5, 3);
        
        System.out.println("X: " + figur.readX());
        System.out.println("Y: " + figur.readY());
    }
}
