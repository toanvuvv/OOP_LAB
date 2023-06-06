package cart;
import java.util.Scanner;

import disc.DigitalVideoDisc;

import java.util.NoSuchElementException;

public class Cart {
    private DigitalVideoDisc[] itemsOrdered = new DigitalVideoDisc[20];
    private int qtyOrdered = 0;

    public void addDigitalVideoDisc(DigitalVideoDisc disc) {
        if (qtyOrdered == itemsOrdered.length) {
            System.out.println("The cart is almost full");
            return;
        }
        itemsOrdered[qtyOrdered++] = disc;
        System.out.println("The disc has been added");
    }

    // addDigitalVideoDisc method which allows to pass an arbitrary number of
    // arguments for dvd
    public void addDigitalVideoDisc(DigitalVideoDisc... dvdList) {
        for (DigitalVideoDisc disc : dvdList) {
            addDigitalVideoDisc(disc);
        }
    }

    public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
        for (int i = 0; i < qtyOrdered; i++) {
            if (itemsOrdered[i].equals(disc)) { // Xoá disc trong list
                for (int j = i; j < qtyOrdered - 1; j++) {
                    itemsOrdered[j] = itemsOrdered[j + 1];
                }
                itemsOrdered[--qtyOrdered] = null;
                System.out.println("The disc has been removed");
                return;
            }
        }
        System.out.println("The disc is not in the cart");
    }

    public float totalCost() {
        float total = 0;
        for (int i = 0; i < qtyOrdered; i++) {
            total += itemsOrdered[i].getCost();
        }
        return total;
    }

    public void prinCast() {
        System.out.println("***********************CART***********************\nOrdered Items:");
        for (int i = 0; i < qtyOrdered; ++i) {
            System.out.println(i + 1 + ". " + itemsOrdered[i].toString() + "\n");
        }
        System.out.println("Total cost: " + totalCost() + "\n***************************************************");

    }

    public void searchDVDByID() {
        System.out.print("Enter the ID of the DVD: ");
        System.out.flush(); // Clear the buffer
        try (Scanner sc = new Scanner(System.in)) {
            String id = sc.nextLine(); // Read user input
            Integer idInt = Integer.parseInt(id); // Convert String to Integer
            if (idInt <= qtyOrdered) {
                System.out.println("The DVD is in the cart!");
            } else {
                System.out.println("The DVD is not in the cart!");
            }
        }
    }

    public void searchDVDByTitle() {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the Title of the DVD: ");
            System.out.flush(); // Clear the buffer
            String title = sc.nextLine();
            for (int i = 0; i < qtyOrdered; ++i) {
                if (itemsOrdered[i].isMatch(title)) {
                    System.out.println("The DVD is in the cart!");
                    return;
                }
            }
            System.out.println("The DVD is not in the cart!");
        } catch (NoSuchElementException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

}