import java.util.Scanner;
import java.util.ArrayList;
import animals.*;

class Main {

    public static void main(String[] args) {
        ArrayList<Animal> animalArr = new ArrayList<Animal>();
        Scanner sc = new Scanner(System.in);
        String input;

        System.out.println("Bem vindo a Fazenda do Jair V0.3 - Autor: Henrique Hott");
        while (!(input = sc.nextLine()).equals("0")) {
            // reading animals
            String[] params = input.split(" ");
            if (params[0].equals("cow")) {
                Cow cow = new Cow(Integer.parseInt(params[1]), Double.parseDouble(params[2]), params[3]);
                animalArr.add(cow);

            } else if (params[0].equals("bat")) {
                Bat bat = new Bat(Integer.parseInt(params[1]), Double.parseDouble(params[2]), params[3],
                        Double.parseDouble(params[4]));
                animalArr.add(bat);

            } else if (params[0].equals("chicken")) {
                Chicken chicken = new Chicken(Integer.parseInt(params[1]), Double.parseDouble(params[2]), params[3]);
                animalArr.add(chicken);
            } else if (params[0].equals("duck")) {
                Duck duck = new Duck(Integer.parseInt(params[1]), Double.parseDouble(params[2]), params[3],
                        Double.parseDouble(params[4]));
                animalArr.add(duck);

            } else {
                System.out.println("Animal invalido");
                continue;

            }
        }

        // printing animals list
        for (Animal animal : animalArr) {
            System.out.print("{ ");
            System.out.print(animal + " ");
            animal.emmitSound();
            System.out.print(" }\n");
        }

        sc.close();
    }
}