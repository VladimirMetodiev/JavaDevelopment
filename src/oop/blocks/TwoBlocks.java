package oop.blocks;

public class TwoBlocks {
    static {
        System.out.println("This is a static block.");
    }

    {
        System.out.println("And this is non-static block.");
    }
}
