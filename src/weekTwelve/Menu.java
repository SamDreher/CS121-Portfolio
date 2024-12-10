package weekTwelve;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    Scanner scanner = new Scanner(System.in);
    Pokedex pokedex = new Pokedex();

    public void displayMenu() {
        while(true) {
            String selection;
            System.out.printf("\n%s MENU %s\n", "*".repeat(9), "*".repeat(9));
            String menuHeader = String.format("1) %s\n2) %s\n3) %s\n4) %s\n5) %s\n%s",
                    "Add a Pokémon", "Remove a Pokémon", "Display Pokémon Information",
                    "Display All Pokémon Information", "Exit", ">>");
            System.out.print(menuHeader);
            selection = scanner.nextLine();
            if(selection.equals("1")) {
                createPokemon();
            } else if(selection.equals("2")) {
                deletePokemon();
            } else if(selection.equals("3")) {
                displayPokemon();
            } else if(selection.equals("4")) {
                displayAllPokemon();
            } else if(selection.equals("5")) {
                System.out.println("Exiting...");
                break;
            } else {
                System.out.println("Invalid Entry");
            }
        }
    }
    private void createPokemon() {
        String name, moveName;
        int hp, movePower, moveSpeed;
        Pokemon pokemon;
        Move move;

        System.out.println("Enter the Pokémon Name: ");
        name = scanner.nextLine();
        System.out.println("Enter the Pokémon's HP: ");
        hp = Integer.parseInt(scanner.nextLine());
        pokemon = new Pokemon(name, hp);
        System.out.printf("Enter Moves for %s", name);
        while(true) {
            System.out.print("\tEnter a move name or 'q' if finished: ");
            moveName = scanner.nextLine();
            if(moveName.equalsIgnoreCase("q")) {
                break;
            }
            System.out.print("\tEnter Move's Power: ");
            movePower = Integer.parseInt(scanner.nextLine());
            System.out.print("\tEnter Move's Speed: ");
            moveSpeed = Integer.parseInt(scanner.nextLine());

            move = new Move(moveName, movePower, moveSpeed);
            pokemon.addMove(move);
        }
        pokedex.addPokemon(pokemon);
        System.out.printf("%s added to Pokédex\n\n", name);
    }
    private void deletePokemon() {
        String name;
        Pokemon pokemon;
        System.out.println("Enter the name of the Pokémon you want to delete: ");
        name = scanner.nextLine();
        pokemon = pokedex.getPokemon(name);
        if(pokemon == null) {
            System.out.println("Pokémon not found");
        } else {
            pokedex.removePokemon(pokemon);
        }
    }
    private void displayPokemon() {
        String name;
        Pokemon pokemon;
        System.out.println("Enter the name of the Pokémon to see its information: ");
        name = scanner.nextLine();
        pokemon = pokedex.getPokemon(name);
        if(pokemon == null) {
            System.out.println("Pokémon not found");
        } else {
            System.out.println(pokemon);
        }
    }
    private void displayAllPokemon() {
        ArrayList<Pokemon> pokemonArrayList = pokedex.getAllPokemon();
        for(int i = 0; i < pokemonArrayList.size(); i++) {
            System.out.printf("%d.) %s\n\n ", (i + 1), pokemonArrayList.get(i));
        }
    }

}
