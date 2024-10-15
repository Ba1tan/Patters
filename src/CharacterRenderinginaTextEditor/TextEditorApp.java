package CharacterRenderinginaTextEditor;

public class TextEditorApp {
    public static void main(String[] args) {
        TextEditor editor = new TextEditor();

        editor.insertCharacter('H', "Arial", 12, 10, 10);
        editor.insertCharacter('e', "Arial", 12, 20, 10);
        editor.insertCharacter('l', "Arial", 12, 30, 10);
        editor.insertCharacter('l', "Arial", 12, 40, 10);
        editor.insertCharacter('o', "Arial", 12, 50, 10);

        editor.insertCharacter('W', "Arial", 12, 10, 30);
        editor.insertCharacter('o', "Arial", 12, 20, 30);
        editor.insertCharacter('r', "Arial", 12, 30, 30);
        editor.insertCharacter('l', "Arial", 12, 40, 30);
        editor.insertCharacter('d', "Arial", 12, 50, 30);

        editor.renderDocument();
    }
}
