package management;
import users.User;
import java.util.Scanner;

import personDao.Veterinarian;

public class Menu {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter veterinarian's cedula: ");
        String cedula = scanner.nextLine();
        System.out.print("Enter veterinarian's name: ");
        String nombre = scanner.nextLine();
        System.out.print("Enter veterinarian's age: ");
        int edad = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.print("Enter veterinarian's username: ");
        String username = scanner.nextLine();
        System.out.print("Enter veterinarian's password: ");
        String password = scanner.nextLine();

        Veterinarian vet = new Veterinarian(cedula, nombre, edad, username, password);
        System.out.println("Veterinarian registered successfully!");
        System.out.println("Veterinarian Name: " + vet.getNombre());
        System.out.println("Username: " + vet.getUser().getUsername());
    }
}
