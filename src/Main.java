import java.util.Scanner;
import java.util.Random;
public class Main {

    public static void main(String[] args){

        // THIS IS MY FIRST JAVA PROGRAM

        /* THIS IS A MULTI-LINE
        COMMENT


        System.out.println("I like pizza");
        System.out.print("It's really good\n");
        System.out.print("Can u buy me a pizza?");



        int age = 21;
        int quantity = 3;
        double price = 45.4;
        char symbol = 'A';
        String name  = "Arkady";
        boolean isPasswordCorrect = true;
        boolean isIncluded = true;

        if(isIncluded){
            System.out.println("YES, " + name + " is included in the grade " + symbol);
        }
        else{
            System.out.println("NO, UNFORTUNATELY " + name + " isn't included");
        }

        String languageName = "Java";
        int gta = 6;
        double pi = 3.14159;
        char gender = 'M';
        boolean isAdmin = true;

        if(isAdmin){
            System.out.println(languageName + " " + gta + " " + pi + " " + gender + " " + isAdmin);
        }
        else {
            System.out.println("Try again!");
        }



        System.out.println("There are " + quantity + " students aged " + age);
        System.out.println("The price is $" + price);
        System.out.println("Your name is " + name);
        System.out.println(isPasswordCorrect);




        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        System.out.print("Enter your average grade: ");
        double averageGrade = scanner.nextDouble();

        System.out.print("Are you still a student? (true/false): ");
        boolean isStudent  = scanner.nextBoolean();


        System.out.println("Your name is " + name);
        System.out.println("You are " + age + " years old");
        System.out.println("Your average grade is " + averageGrade);
        if(isStudent) {
            System.out.println("Yes, you're enrolled as a student");
        }
        else{
            System.out.println("No, you're NOT enrolled");
        }

        if(age >= 18){
            System.out.print("You are a grown guy");
        }
        else{
            System.out.print("Enjoy your adolescence");
        }
        scanner.close();



        // Calculating the area of a rectangle
        double height = 0;
        double width = 0;
        double area = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the height: ");
        height = scanner.nextDouble();

        System.out.print("Enter the width: ");
        width = scanner.nextDouble();

        area = height * width;

        System.out.println("The area of the rectangle is " + area +"cm²");

        scanner.close();

        Scanner scanner = new Scanner(System.in);
        String name;
        System.out.println("Write sth ");
        name = scanner.nextLine();
        System.out.println("Your name is " + name);
        scanner.close();

        int a = 10;
        int b = 5;
        int c = 1;
        int z;
        z = a / b;
        System.out.println(z);
        z %= c;
        System.out.println(z);
        int e = 2;
        e++;
        System.out.println(e);



        //SHOPPING CART EXERCISE

        Scanner scanner = new Scanner(System.in);
        String item;
        int quantity;
        double price;
        char currency = '$';
        boolean isIncluded;
        double total;

        System.out.print("What would you like to buy?: ");
        item = scanner.nextLine();
        System.out.print("How many items would you like?: ");
        quantity = scanner.nextInt();
        System.out.print("Hom much would you like to pay?: ");
        price = scanner.nextDouble();
        System.out.print("Would you like to include it into your cart?: (true/false) ");
        isIncluded = scanner.nextBoolean();
        total = quantity * price;

        System.out.println("Thanks for purchasing " + quantity + " " + item + "/s");
        if(isIncluded){
            System.out.println("Thanks for adding your purchase into the cart");
        }
        System.out.println("Your total is " + total + currency);


        scanner.close();

        Scanner scanner = new Scanner(System.in);

        String name;
        int age;
        boolean isStudent;

        System.out.print("Enter your name ");
        name = scanner.nextLine();


        System.out.print("Enter your age ");
        age = scanner.nextInt();

        System.out.print("Are you a student? ");
        isStudent = scanner.nextBoolean();

        if(age > 50){
            System.out.println("You are a senior");
        }
        else if(age >= 18) {
            System.out.println("You are an adult");
        }
        else if(age < 0){
            System.out.println("You haven't been born yet");
        }
        else{
            System.out.println("You are a child");
        }

        if(isStudent){
            System.out.println("Yes, you are a student");
        }
        else{
            System.out.println("You are not");
        }


        if(name.isEmpty()){
            System.out.print("You didn't enter your name");
        }
        else{
            System.out.print("Hello " + name);
        }
        scanner.close();



        Random random = new Random();
        int number1 = random.nextInt(1,8);
        int number2 = random.nextInt(1,8);
        int number3 = random.nextInt(1,8);
        System.out.println(number1);
        System.out.println(number2);
        System.out.println(number3);
        boolean coin = random.nextBoolean();
        if(coin){
            System.out.println("Heads");
        }
        else{
            System.out.println("Tails");
        }

        double number;

        number = Math.pow(2,3);
        number = Math.abs(-9);
        number = Math.floor(9.92);
        number = Math.ceil(7.0035);
        number = Math.sqrt(16);
        number = Math.round(4.49);
        number = Math.max(4,6);
        number = Math.min(1,34);
        System.out.println(number);

         */

        // Math Pythagorean theory game
        Scanner scanner = new Scanner(System.in);

        int side;
        double firstSide;
        double secondSide;
        double hypotenuse;
        double calculation;

        System.out.println("Welcome to the Pythagorean theory game");
        System.out.print("What would you like to find? (first side - 1, second side - 2 or a hypotenuse - 3?) ");
        side = scanner.nextInt();
        if(side == 1){
            System.out.println("Got it");
            System.out.print("Enter the second side of the rectangular triangle ");
            secondSide = scanner.nextInt();
            System.out.print("Enter the hypotenuse of the rectangular triangle ");
            hypotenuse = scanner.nextInt();
            if(hypotenuse <= secondSide){
                System.out.println("Your rectangle is invalid");
            }
            else {
                calculation = Math.sqrt(Math.pow(hypotenuse, 2) - Math.pow(secondSide, 2));
                System.out.println("Your first side is " + calculation);
            }
        }
        else if(side == 2){
            System.out.println("Got it");
            System.out.print("Enter the first side of the rectangular triangle ");
            firstSide = scanner.nextInt();
            System.out.print("Enter the hypotenuse of the rectangular triangle ");
            hypotenuse = scanner.nextInt();
            if(hypotenuse <= firstSide){
                System.out.println("Your rectangle is invalid");
            }
            else {
                calculation = Math.sqrt(Math.pow(hypotenuse, 2) - Math.pow(firstSide, 2));
                System.out.println("Your second side is " + calculation);
            }
        }
        else{
            System.out.println("Got it");
            System.out.print("Enter the first side of the rectangular triangle ");
            firstSide = scanner.nextInt();
            System.out.print("Enter the second side of the rectangular triangle ");
            secondSide = scanner.nextInt();
            calculation = Math.sqrt(Math.pow(secondSide,2)+ Math.pow(firstSide,2));
            System.out.println("Your hypotenuse is " + calculation);
        }






    }

}


