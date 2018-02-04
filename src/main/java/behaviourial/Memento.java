package behaviourial;

import java.util.ArrayList;

public class Memento {
    public static void main(String[] args) {


        Editor editor = new Editor();

// Type some stuff
        editor.type("This is the first sentence.");
        editor.type("This is second.");

// Save the state to restore to : This is the first sentence. This is second.
        SavedData saved = editor.save();

// Type some more
        editor.type("And this is third.");

        // Output: Content before Saving
        String[] state = editor.getContent(); // This is the first sentence. This is second. And this is third.

// Restoring to last saved state
        editor.restore(saved);

        editor.getContent(); // This is the first sentence. This is second.
    }
}

class SavedData {
    private final ArrayList<String> content;

    public SavedData(ArrayList<String> content) {
        this.content=content;
    }


    public ArrayList<String> getContent() {
        return content;
    }
}
   // Then we have our editor i.e.originator that is going to use memento object

class Editor {
    ArrayList<String> content ;

    public void type(String $words) {
        content.add($words);
    }

    public String[] getContent() {
        return content.toArray(new String[0]);
    }

    public SavedData save() {
        return new SavedData(content);
    }

    public void restore(SavedData $memento) {
        content = $memento.getContent();
    }

    public Editor() {
        this.content = new ArrayList<>();
    }
}


