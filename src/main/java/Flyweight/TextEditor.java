package Flyweight;

import java.util.ArrayList;
import java.util.List;

public class TextEditor {
    private List<CharacterPosition> characters = new ArrayList<>();
    private CharacterFactory characterFactory;

    public TextEditor(CharacterFactory characterFactory) {
        this.characterFactory = characterFactory;
    }

    public void insertText(String text, String font, int size, int startPositionX, int startPositionY) {
        int positionX = startPositionX;
        int positionY = startPositionY;

        for (char c : text.toCharArray()) {
            Character character = characterFactory.getCharacter(c, font, size);
            characters.add(new CharacterPosition(character, positionX, positionY));
            positionX += 10;
        }
    }

    public void render() {
        for (CharacterPosition charPos : characters) {
            charPos.getCharacter().display(charPos.getPositionX(), charPos.getPositionY());
        }
    }

    private static class CharacterPosition {
        private Character character;
        private int positionX;
        private int positionY;

        public CharacterPosition(Character character, int positionX, int positionY) {
            this.character = character;
            this.positionX = positionX;
            this.positionY = positionY;
        }

        public Character getCharacter() {
            return character;
        }

        public int getPositionX() {
            return positionX;
        }

        public int getPositionY() {
            return positionY;
        }
    }
}
