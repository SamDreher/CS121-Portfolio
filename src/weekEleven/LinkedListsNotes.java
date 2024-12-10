package weekEleven;

import java.util.LinkedList;

public class LinkedListsNotes {
    public static void main(String[] args) {
        // Created an instance of the LinkedList class
        LinkedList<String> names = new LinkedList<>();

        //.add()
        names.add("Kevin");
        names.add("Robin");
        names.add("Lizzie");
        names.add("Kelly");
        System.out.println(names);

        //.get()
        System.out.println(names.get(2));

        //.remove()
        names.remove(0);
        System.out.println(names);

        //.find()
        names.stream().findFirst().ifPresent(System.out::println);
    }
}
