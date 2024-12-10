package weekEleven;

import java.util.ArrayList;

public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList<String> nameList = new ArrayList<>();

        nameList.add("John");
        nameList.add("Jane");
        nameList.add("Joan");
        nameList.add("Jean");

        System.out.println(nameList.get(2));
        System.out.println(nameList.size());

        for (int i = 0; i < nameList.size(); i++) {
            System.out.println(nameList.get(i));
        }

        for (String name: nameList) {
            System.out.println(name);
        }

        nameList.remove("Joan");
        nameList.remove(1);
    }
}
