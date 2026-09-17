import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        String[] parole = {"rottonculo", "agrumi", "arancina", "pisnelo"};


        System.out.printf("Hello and welcome!");

        System.out.println("Try a letter");
        char cin = keyboard.nextLine().charAt(0);

        for (int i = 0; i<parole.length; i++){
            for (char c : parole[i].toCharArray()){
                if(cin == c)
                    pos = parole[i].; // devo ottenere il numero in array della lettera dentro parola
        }}
    }