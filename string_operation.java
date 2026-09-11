import java.util.ArrayList;
import java.util.Scanner;
public class TravelManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> cities = new ArrayList<>();
        int choice;
        do {
            System.out.println("\n===== Travel Management System =====");
            System.out.println("1. Append a City");
            System.out.println("2. Insert a City at Specific Position");
            System.out.println("3. Search for a City");
            System.out.println("4. Display Cities Starting with a Letter");
            System.out.println("5. Display All Cities");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine(); // Consume newline
            switch (choice)  
{
                case 1:
                    System.out.print("Enter city name: ");
                    String city = sc.nextLine();
                    cities.add(city);
                    System.out.println(city + " added successfully.");
                    break;
                case 2:
                    System.out.print("Enter index: ");
                    int index = sc.nextInt();
                    sc.nextLine();
                    if (index >= 0 && index <= cities.size()) {
                        System.out.print("Enter city name: ");
                        String newCity = sc.nextLine();
                        cities.add(index, newCity);
                        System.out.println("City inserted successfully.");
                    } else {
                        System.out.println("Invalid index.");
                    }
                    break;
 
                case 3:
                    System.out.print("Enter city to search: ");
                    String searchCity = sc.nextLine();
                    if (cities.contains(searchCity)) {
                        System.out.println(searchCity + " is available.");
                    } else {
                        System.out.println(searchCity + " is not available.");
                    }
                    break;
                case 4:
                    System.out.print("Enter starting letter: ");
                    char letter = Character.toUpperCase(sc.next().charAt(0));
                    System.out.println("Cities starting with '" + letter + "':");
                    boolean found = false;
                    for (String c : cities) {
                        if (Character.toUpperCase(c.charAt(0)) == letter) {
                            System.out.println(c);
                            found = true;
                        }
                    }
                    if (!found) {
                        System.out.println("No cities found.");
                    }
                    break;
                case 5:
                    System.out.println("List of Cities:");
                    if (cities.isEmpty()) {
                        System.out.println("No cities available.");
                    } else {
                        for (String c : cities) {
                            System.out.println(c);
                        }
                    }
                    break;
                case 6:
                    System.out.println("Thank You!");
                    break;
                default:
                    System.out.println("Invalid Choice.");
            }
        } while (choice != 6);
        sc.close();
    }
} 
