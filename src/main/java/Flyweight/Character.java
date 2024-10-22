package Flyweight;

public class Character {
    private char value;
    private String font;
    private int size;

    public Character(char symbol, String font, int size) {
        this.value = symbol;
        this.font = font;
        this.size = size;
    }

    public void display(int positionX, int positionY) {
        System.out.println("Displaying '" + value + "' at (" + positionX + "," + positionY + ") with font " + font + " and size " + size);
    }
    public char getValue() {
        return value;
    }

    public String getFont() {
        return font;
    }

    public int getSize() {
        return size;
    }

}
