package classstructuremethods;

import java.util.Scanner;

public class NoteMain {
    public static void main(String[] args) {
        Note note = new Note();
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        String topic = scanner.nextLine();
        String text = scanner.nextLine();
        note.setName(name);
        note.setTopic(topic);
        note.setText(text);

        System.out.println(note.getNoteText());
    }
}
