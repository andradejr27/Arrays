package application;

import java.util.Scanner;

import model.entities.Rooms;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("How many rooms will be rented? ");
		int n1 = sc.nextInt();
		sc.nextLine();
		
		Rooms[] vect = new Rooms[10];
		
		for (int i = 1; i <= n1; i++) {
			System.out.printf("Rent #%d: \n", i);
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.printf("Email: ");
			String email = sc.nextLine();
			System.out.println("Room: ");
			int room = sc.nextInt();
			sc.nextLine();
			System.out.println();
			Rooms reservation = new Rooms(name, email);
			vect[room] = reservation;
		}
		
		System.out.println("Busy rooms: ");
		
		for (int i = 0; i < vect.length; i++) {
			if (vect[i] != null) {
				System.out.println(i + ": " + vect[i]);
			}
			
		}
		
		sc.close();
	}

}
