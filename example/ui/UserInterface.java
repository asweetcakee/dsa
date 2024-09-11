package example.ui;

import java.util.Scanner;

public class UserInterface {
    private Scanner scanner;
    private final String STOP_COMMAND = "stop";

    public void UserInterface(Scanner scanner) {
        this.scanner = scanner;
    }

    public void start() {
        printCommands();
        inputHandling();
    }

    private void printCommands() {
        System.out.println("Welcome to Data Structures and Algorithms!");
        System.out.println("Type in what you would like to do:");
        System.out.println("1 - Open sorting algorithms list.");
        System.out.println("2 - Open searching Algorithms list.");
        System.out.println("'stop' - exits the program.");
    }

    private void inputHandling() {
        String input = this.scanner.nextLine();
        input = sanitizedString(input);
        while (true) {
            if (input.equals(STOP_COMMAND)) {
                break;
            }

            switch (input) {
                case "1":
                    listSortingAlgorithms();
                    break;
                case "2":

                    break;
                default:
                    System.out.println("Entered command doesn't exist");
                    break;
            }
        }
    }

    private void listSortingAlgorithms() {
        System.out.println();
    }

    private String sanitizedString(String string) {
        return string == null ? "" : string.trim();
    }
}
