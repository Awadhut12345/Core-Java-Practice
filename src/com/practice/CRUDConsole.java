package com.practice;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CRUDConsole {
    private static Map<Integer, String> dataMap = new HashMap<>();
    private static int idCounter = 1;
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean exit = false;
        while (!exit) {
            System.out.println("Choose operation:");
            System.out.println("1. Create (Insert) data");
            System.out.println("2. Read (Retrieve) data");
            System.out.println("3. Update data");
            System.out.println("4. Delete data");
            System.out.println("5. Exit");
            System.out.println("Enter your choice:");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline character after nextInt()

            switch (choice) {
                case 1:
                    createData();
                    break;
                case 2:
                    readData();
                    break;
                case 3:
                    updateData();
                    break;
                case 4:
                    deleteData();
                    break;
                case 5:
                    exit = true;
                    System.out.println("Exiting program.");
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }

        scanner.close();
    }

    private static void createData() {
        System.out.print("Enter data to insert: ");
        String data = scanner.nextLine();
        dataMap.put(idCounter++, data);
        System.out.println("Data inserted successfully.");
    }

    private static void readData() {
        System.out.println("Existing data:");
        dataMap.forEach((id, data) -> System.out.println("ID: " + id + ", Data: " + data));
    }

    private static void updateData() {
        System.out.print("Enter ID to update: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Consume newline character after nextInt()
        if (dataMap.containsKey(id)) {
            System.out.print("Enter new data: ");
            String newData = scanner.nextLine();
            dataMap.put(id, newData);
            System.out.println("Data updated successfully.");
        } else {
            System.out.println("ID not found.");
        }
    }

    private static void deleteData() {
        System.out.print("Enter ID to delete: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Consume newline character after nextInt()
        if (dataMap.containsKey(id)) {
            dataMap.remove(id);
            System.out.println("Data deleted successfully.");
        } else {
            System.out.println("ID not found.");
        }
    }
}
