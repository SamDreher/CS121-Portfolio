package weekEleven;

import java.util.ArrayList;

public class SystemManagement {
    private ArrayList<String>Names;

    public SystemManagement() {
        this.Names = new ArrayList<>();
    }
    // Add string
    public void addName(String name) {
        Names.add(name);
    }
    // Remove string
    public void removeName(String name) {
        Names.remove(name);
    }
    // Get the size
    public int sizeOfName() {
        return Names.size();
    }
    // Get element by index
    public String getValueUsingIndex(int index) {
        return Names.get(index);
    }
    // Displaying contents with for each for loop
    public void displayWithForEach() {
        for(String n: Names) {
            System.out.println(n);
        }
    }
    // Displaying contents with for loops
    public void displayWithForLoop() {
        for(int i = 0; i < Names.size(); i++) {
            System.out.println(Names.get(i));
        }
    }
}
