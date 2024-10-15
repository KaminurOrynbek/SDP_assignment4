package Flyweight;

public class TextEditorApp {
    public static void main(String[] args) {
        CharacterFactory characterFactory = new CharacterFactory();
        TextEditor editor = new TextEditor(characterFactory);

        // Inserting a large amount of text with the same font and size
        editor.insertText("Hello World! Flyweight Pattern Example.", "Arial", 12, 0, 0);
        editor.insertText("Another line of text in the editor.", "Arial", 12, 0, 20);
        editor.insertText("Flyweight saves memory!", "Arial", 12, 0, 40);

        // Render the text in the editor
        editor.render();

        // Display how many unique characters were created
        System.out.println("Total unique Character objects created: " + characterFactory.getTotalCharactersMade());
    }
}
