package oop.innerClassesPractice;

public class Display {
    private static final int DISPLAY_HEIGHT = 1920;
    private static final int DISPLAY_WIDTH = 1280;
    private int x = 99;

    public Display() {
        Pixel pixel = new Pixel(10, 10, Colour.BLUE);
    }

    public class Pixel{
        private int x;
        private int y;
        private Colour colour;

        public Pixel(int x, int y, Colour colour) {
            if (x >= 0 && x <= DISPLAY_WIDTH && y >= 0 && y <= DISPLAY_HEIGHT) {
                this.x = x;
                this.y = y;
                this.colour = colour;
                System.out.printf("Creating new %s pixel at x = %d and y = %d.%n", colour, x, y);
            }
            else {
                throw new IllegalArgumentException("Coordinates x and y should be between 0 - 1280 and 0 - 1920.");
            }
        }

        public void testScope(int x){
            System.out.println("x = " + x);
            System.out.println("this.x = " + this.x);
            System.out.println("Display.this.x = " + Display.this.x);
        }
    }

    public enum Colour{
        BLACK, WHITE, RED, BLUE, GREEN, YELLOW, BROWN, GRAY;
    }
}
