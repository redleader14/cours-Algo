import java.util.Scanner;

public class Main {

    // fonction qui renvoie un entier et un réel dans la console
    public static void main(String[] args) {
        scanner();
        volume();
        somme();
        division();
    }

    public static void run() {
        Scanner scanner = new Scanner(System.in);
        Scanner scannerbis = new Scanner(System.in);
        System.out.println("Bonjour, quel est votre prénom?");
        String lePrenom = scannerbis.nextLine();
        int unEntier = scanner.nextInt();
        float unReel = scanner.nextFloat();
        System.out.println("J’ai recupere un entier: " + unEntier);
        System.out.println("J’ai aussi recupere un reel: " + unReel);
        System.out.println("Bonjour " + lePrenom);
    }

    public static void somme() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Veuillez saisir le premier entier");
        int premierEntier = scanner.nextInt();
        System.out.println("Veuillez saisir le deuxieme entier");
        int deuxiemeEntier = scanner.nextInt();
        int somme = premierEntier + deuxiemeEntier;
        System.out.println("La somme de " + premierEntier + " avec " + deuxiemeEntier + " est egal a " + somme);
    }

    public static void division() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Veuillez saisir le premier entier");
        float premierEntier = scanner.nextFloat();
        System.out.println("Veuillez saisir le deuxieme entier");
        float deuxiemeEntier = scanner.nextFloat();
        float division = premierEntier / deuxiemeEntier;
        System.out.println("La division de " + premierEntier + " par " + deuxiemeEntier + " est egal a " + division);

    }

    public static void volume() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Veuillez saisir la longueur");
        float longueur = scanner.nextFloat();
        System.out.println("Veuillez saisir la largeur");
        float largeur = scanner.nextFloat();
        System.out.println("Veuillez saisir la hauteur");
        float hauteur = scanner.nextFloat();
        float volume = longueur * largeur * hauteur;
        System.out.println("Le volume du pavé droit de longueur " + longueur + ", de largeur " + largeur + " et de hauteur " + hauteur + " est " + volume);

    }

    public static void scanner() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Saisir un entier");
        // On saisit ’11’
        int entier = scanner.nextInt();
        System.out.println("Saisir une operation");
        // Parce que le caractere newline n’a pas ete lu, c’est lui qui va se
        // retrouver dans la variable operation
        // Il va aussi etre impossible de saisir une autre valeur pour operation
        String operation = scanner.nextLine();
    }
}



