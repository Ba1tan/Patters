package CharacterRenderinginaTextEditor;
import java.util.HashMap;
public class CharacterFactory {
    private HashMap<String, Character> characterMap = new HashMap<>();

    public Character getCharacter(char value, String font, int size) {
        String key = value + "-" + font + "-" + size;
        if (!characterMap.containsKey(key)) {
            characterMap.put(key, new Character(value, font, size));
            System.out.println("Creating new Character object: " + key);
        }
        return characterMap.get(key);
    }
}
