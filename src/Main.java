import com.sun.security.jgss.GSSUtil;

import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.Random;
public class Main {

    public static void main(String[] args) {

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



        Scanner scanner = new Scanner(System.in);
        double a;
        double b;
        double c;

        System.out.print("Enter number1 ");
        a = scanner.nextDouble();

        System.out.print("Enter number2 ");
        b = scanner.nextDouble();

        c = a / b;
        System.out.printf("Result is %.1f\n", c);

        scanner.close();

        String name = "Max";
        int age = 20;
        double height = 170.5;
        boolean isStudent = true;

        System.out.printf("%s is %d years old and he is %f cm height, btw he is a student: %b\n", name, age, height, isStudent);

        double price = 12.3293;
        double price1 = 9404545.333;
        double price3 = -4545940.333;
        double price4 = -4545940.333;
        int id1 = 2;
        int id2 = 344;
        int id3 = 22223;

        System.out.printf("1 price: % .1f\n", price);
        System.out.printf("2 price: % ,.2f\n", price1);
        System.out.printf("3 price: % (,.2f\n", price3);
        System.out.printf("4 price: % .1f\n", price4);
        System.out.printf("1: %05d\n2: %05d\n3: %05d\n", id1, id2, id3);
        System.out.printf("1: %-5d\n2: %-5d\n3: %-5d\n", id1, id2, id3)



        Scanner scanner = new Scanner(System.in);

        double principal;
        double rate;
        int timesCompounded;
        int years;
        double amount;

        System.out.print("Enter the principal ");
        principal = scanner.nextDouble();

        System.out.print("Enter the rate in % ");
        rate = scanner.nextDouble() / 100;

        System.out.print("Enter the number compounded per year ");
        timesCompounded = scanner.nextInt();

        System.out.print("Enter the number of years ");
        years = scanner.nextInt();

        amount = principal * Math.pow(1 + rate / timesCompounded, timesCompounded * years);
        System.out.printf("The total amount after %d is %f", years, amount);



        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter your name: ");
        String name = scanner.nextLine();

        //int length = name.length();
        //char letter = name.charAt(1);
        //int index = name.indexOf("r");
        //int lastIndex = name.lastIndexOf("a");
        //name = name.toUpperCase();

        if(name.isEmpty()){
            System.out.println("It's empty");
        }
        else if(name.contains(" ")){
            System.out.println("Please enter your name without any spaces");
        }
        else if(name.equalsIgnoreCase("password")) {
            System.out.println("Your name can't be password");
        }
        else{
            System.out.printf("Hello %s", name);
        }


        //System.out.println(name);


        Scanner scanner = new Scanner(System.in);
        String email;
        String name;
        String domain;

        System.out.print("Enter your email: ");
        email = scanner.nextLine();
        if(email.contains("@") && email.contains(".com")){
            name = email.substring(0,email.indexOf("@"));
            domain = email.substring(email.indexOf("@") + 1);
            System.out.println(name);
            System.out.print(domain);
        }
        else{
            System.out.println("Please enter correct email");
        }


        Scanner scanner = new Scanner(System.in);

        double weight;
        double newWeight;
        int choice;

        System.out.print("Welcome to calculator\nWhat would you like to convert (1/2)? Kg to Lb or Lb to Kg? ");
        choice = scanner.nextInt();
        System.out.print("Please enter the weight: ");
        weight = scanner.nextDouble();

        if(choice == 1){
            newWeight = weight * 2.2046226218;
            System.out.printf("The weight in Lb is %.2f lb",newWeight);
        }
        else if(choice == 2){
            newWeight = weight * 0.45359237;
            System.out.printf("The weight in Kg is %.2f kg", newWeight);
        }
        else{
            System.out.println("You've entered not a valid choice ");
        }
        scanner.close();



        int number = 40;
        int number1 = 8;
        int time = 9;
        String ifTrue = (number >= 50) ? "true" : "false";
        String evenOrOdd = (number1 % 2 == 0) ? "even": "odd";
        String pmOrAm = (time >= 12) ? "PM" : "AM";
        System.out.println(pmOrAm);



        Scanner scanner = new Scanner(System.in);

        double temperature;
        double newTemperature;
        String unit;


        System.out.print("Enter the temperature: ");
        temperature = scanner.nextDouble();
        System.out.print("Enter the units (C or F) ");
        unit = scanner.next().toUpperCase();
        newTemperature = (unit.equals("C")) ? (temperature - 32) * 5 / 9 : (temperature * 5 / 39) + 32;
        System.out.printf("Your new temperature is %.1f %s", newTemperature, unit);
        scanner.close();



        Scanner scanner = new Scanner(System.in);
        String day;

        System.out.print("Enter the day of the week: ");
        day = scanner.nextLine().toLowerCase();

        switch(day){
            case "monday", "tuesday", "wednesday", "thursday", "friday" -> System.out.printf("%s is a weekday", day);
            case "saturday", "sunday" -> System.out.printf("%s is a weekend", day);
            default -> System.out.printf("%s isn't a day", day);
        }
        scanner.close();





        Scanner scanner = new Scanner(System.in);

        double firstNumber;
        double secondNumber;
        char operator;
        double result = 0;
        boolean validOperation = true;

        System.out.print("Enter the 1 number: ");
        firstNumber = scanner.nextDouble();
        System.out.print("Enter the operator (+,-,*,/,^): ");
        operator = scanner.next().charAt(0);
        System.out.print("Enter the 2 number: ");
        secondNumber = scanner.nextDouble();
        switch(operator){
            case '+' -> result = firstNumber + secondNumber;
            case '-' -> result = firstNumber - secondNumber;
            case '*' -> result = firstNumber * secondNumber;
            case '/' -> {
                if(secondNumber == 0){
                    System.out.println("You can't divide by 0");
                    validOperation = false;
                }
                else{
                    result = firstNumber / secondNumber;
                }
            }
            case '^' -> result = Math.pow(firstNumber, secondNumber);
            default -> {
                System.out.print("Enter a valid choice");
                validOperation = false;
            }
        }
        if(validOperation){
            System.out.printf("Your result is %.1f",result);
        }
        scanner.close();


        int num1 = 3;
        boolean isStudent = true;
        int num2 = 10;
        int temperature = 25;
        if(num1 >=3 && !isStudent && num2 <=11){
            System.out.println("Pass");
        }
        else{
            System.out.println("Fail");
        }
        if(temperature >=30 || temperature <=10){
            System.out.println("The weather is rly bad");
        }
        else{
            System.out.println("It's quite good");
        }


        Scanner scanner = new Scanner(System.in);

        String userName;
        System.out.print("Enter your Username: ");
        userName = scanner.nextLine();
        if(userName.contains(" ") || userName.contains("_")){
            System.out.println("Your username mustn't contain any spaces or underscores");
        }
        else if(userName.length() < 4 || userName.length() > 12){
            System.out.println("Your username must be between 4-12 characters");
        }
        else{
            System.out.printf("Hello, %s", userName);
        }

        scanner.close();





        Scanner scanner  = new Scanner(System.in);

        String name = "";
        int age = 0;

        while(name.isEmpty()){
            System.out.print("Enter your name: ");
            name = scanner.nextLine();
        }
        do{
            System.out.print("Enter your age: ");
            age = scanner.nextInt();
        }while(age <= 0);
        System.out.println("Hello " + name) ;
        System.out.println("You are " + age +" years old") ;
        scanner.close();





        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int userNumber;
        int min = 1;
        int max = 100;
        int randomNumber = random.nextInt(min, max+1);
        int attempts = 0;

        System.out.printf("Guess number game\nYou have to guess a number between %d-%d\nI'll guide you through the game\n", min,max);

        do{
            System.out.print("Enter the number: ");
            userNumber = scanner.nextInt();
            attempts++;

            int difference = Math.abs(randomNumber-userNumber);

            if(userNumber == randomNumber){
                System.out.print("Congratulations! You won within " + attempts + " attempts, the number was " + randomNumber);
            }
            else{
                if(difference >= 14){
                    System.out.println("Way to far...");
                }
                else if(difference >= 5){
                    System.out.println("Getting warmer...");
                }
                else if(difference >= 3){
                    System.out.println("Very close! ");
                }
                else{
                    System.out.println("You're almost there");
                }
            }
            if(userNumber < randomNumber){
                System.out.print("The number is higher\n");
            }
            else if (userNumber > randomNumber){
                System.out.print("The number is lower\n");
            }
        }while(randomNumber != userNumber);



        scanner.close();


        //for(int i = 0; i <= 10; i++){
        //for(int i = 10; i >= 0; i--){
        //for(int i = 0; i < 15; i+= 2){
        for(int i = 15; i > -2; i-= 1){
            //System.out.println("Hello");
            System.out.println(i);

        }


        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter how many times you want to loop: ");
        int max = scanner.nextInt();
        for(int i = 1; i <= max; i++){
            System.out.println(i);
        }
        System.out.print("Enter from which number you want to count down: ");
        int userNumber = scanner.nextInt();
        for(int i = userNumber; i > 0; i-- ){
            System.out.println(i);

        }
        System.out.println("Happy new year!");

        scanner.close();


        for(int num = 0; num < 11; num++){
            if(num ==5){
                break;
            }
            System.out.println(num + " ");
        }
        for(int i = 20; i > 0; i-=1){
            if(i == 13){
                System.out.println("Skip it ");
                continue;
            }
            System.out.print(i +" ");
        }


        for(int j = 1; j <=3; j++) {
            for (int i = 0; i <= 10; i++) {
                System.out.print(i);
            }
            System.out.println();

        }

        Scanner scanner = new Scanner(System.in);
        int rows;
        int columns;
        char simbol;
        System.out.print("Enter the simbol: ");
        simbol = scanner.next().charAt(0);
        System.out.print("Enter the amount of rows: ");
        rows = scanner.nextInt();
        System.out.print("Enter the amount of columns: ");
        columns = scanner.nextInt();
        for(int j = 0; j < rows; j++){
            for(int i = 0; i < columns; i++){
                System.out.print(simbol);
            }
            System.out.println();
        }

        scanner.close();


        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        String name;
        do {
            System.out.print("Enter your name: ");
            name = scanner.nextLine();
        } while(name.isEmpty());
        int age = random.nextInt(1, 21);
        happyBirthday(name,age);

        //System.out.print(cube(3));
        //System.out.print(getFullName("Bob", "Bobnik"));
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        if(ageCheck(age)){
            System.out.print("Yes, you can sign up");
        }
        else{
            System.out.print("You have to be 18+");
        }


        //System.out.print(adding(2,3));
        //System.out.print(adding(2,3, 4,5));
        System.out.print(pizza("black bread", "mozzarella", "beef/chicken"));


    }
    //some methods
    static void happyBirthday(String name, int age) {
        System.out.println("Happy Birthday to you");
        System.out.printf("Happy Birthday, dear %s\n", name);
        System.out.printf("Happy Birthday, you are %d years old\n", age);
        System.out.println("Happy Birthday to you");
    }
    static double square(double number){
        return number * number;
    }
    static double cube(double number){
        return number * number * number;
    }
    static String getFullName(String firstName, String secondName){
        return firstName + " "+ secondName;
    }
    static boolean ageCheck(int age){
        return age >= 18;

    }
    static double adding(int a, int b){
        return a+b;

    }
    static double adding(int a, int b, int c, int d){
        System.out.println();
        return a+b*c-d;
    }
    //overloaded methods
    static String pizza(String breadTipe){
        return breadTipe + " Pizza";
    }
    static String pizza(String breadTipe, String cheeseTipe){
        return breadTipe + " "+ cheeseTipe + " Pizza";
    }
    static String pizza(String breadTipe, String cheeseTipe, String meat){
        return meat + " " +breadTipe + " "+ cheeseTipe + " Pizza";



        //JAVA BANKING PROGRAM FOR BEGINNERS
        double balance = 0;
        boolean isRunning = true;
        int choice;

        System.out.println("********************");
        System.out.println("Java Banking Program");

        while (isRunning) {
            System.out.println("1. Show balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.println("Enter the option (1-4): ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1 -> showBalance(balance);
                case 2 -> balance += deposit();
                case 3 -> balance -= withdraw(balance);
                case 4 -> {
                    isRunning = false;
                    System.out.println("Have a nice day!");
                }
                default -> System.out.println("Invalid option. Pls try again!");
            }
        }
    }

    static void showBalance(double balance) {
        System.out.println("********************");
        System.out.printf("$%.2f\n", balance);
        System.out.println("********************");
    }
    static double deposit(){
        double amount;
        System.out.print("Enter the deposit amount: ");
        amount = scanner.nextDouble();
        if(amount <0){
            System.out.print("You can't deposit the negative number");
            return 0;
        }
        else{
            return amount;

        }
    }
    static double withdraw(double balance){
        double amount;
        System.out.println("Enter the withdraw amount: ");
        amount = scanner.nextDouble();
        if(amount < 0){
            System.out.print("You can't withdraw the negative amount");
            return 0;
        }
        else if(balance < amount){
            System.out.print("You don't have enough money");
            return 0;
        }
        else{
            return amount;
        }



        //JAVA RESTAURANT PROGRAM
        int choice;
        double bill = 0;
        boolean isWorking = true;
        System.out.println("*************");
        System.out.println("Welcome to Java Restaurant");
        System.out.println("*************");

        while(isWorking){
            System.out.println("1.Show menu\n2.Order Item\n3.Show bill\n4.Exit");
            System.out.print("Enter a choice: ");
            choice = scanner.nextInt();
            switch(choice){
                case 1 -> showMenu();
                case 2 -> bill = orderItem(bill);
                case 3 -> showBill(bill);
                case 4 -> {
                    System.out.printf("Have a good day! Your total bill is $%.2f", bill);
                    isWorking = false;
                }
                default -> System.out.println("Invalid choice");
            }
        }


    }
    static void showMenu(){
        System.out.println("--Menu--");
        System.out.println("1.Burger - $5.50\n2.Pizza - $8.00\n3.Soda - $1.50\n4.Ice cream - $3.00");
        System.out.println("*************");
    }
    static double orderItem(double bill){
        int orderChoice;
        double burger = 5.50;
        double pizza = 8.00;
        double soda = 1.50;
        double iceCream = 3.00;
        System.out.println("What would you like to order (1-4): ");
        orderChoice = scanner.nextInt();
        switch(orderChoice){
            case 1 -> {
                System.out.println("You ordered a Burger");
                bill+=burger;
            }
            case 2 -> {
                System.out.println("You ordered a Pizza");
                bill+=pizza;
            }
            case 3 -> {
                System.out.println("You ordered a Soda");
                bill+=soda;
            }
            case 4 -> {
                System.out.println("You ordered an Ice cream");
                bill+=iceCream;
            }
            default -> System.out.println("Invalid choice");
        }
        return bill;
    }
    static void showBill(double bill){
        System.out.printf("Your total bill is $%.2f\n", bill);

         */

        //JAVA DICE ROLLING PROGRAM
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int numberOfDice;
        int total = 0;

        System.out.println("*************");
        System.out.println("DICE ROLLING");
        System.out.println("*************");

        System.out.print("Enter the number of dice to be rolled: ");
        numberOfDice = scanner.nextInt();
        while(numberOfDice<=0 || numberOfDice >=10){
            System.out.println("Invalid number");
            System.out.print("Enter the number of dice to be rolled: ");
            numberOfDice = scanner.nextInt();
        }

        for(int i = 0; i < numberOfDice; i++){
            int roll = random.nextInt(1,7);
            total+=roll;
            showAscii(roll);
            System.out.println("You got " + roll + (roll == 1 ? " die" : " dices"));
        }
        System.out.print("the total is " + total);
        scanner.close();

    }
    static void showAscii(int roll){
        String dice1 = """
                 _______
                |       |
                |   ●   |
                |       |
                 ‾‾‾‾‾‾‾
                """;
        String dice2 = """
                 _______
                | ●     |
                |       |
                |     ● |
                 ‾‾‾‾‾‾‾
                
                """;
        String dice3 = """
                 _______
                | ●     |
                |   ●   |
                |     ● |
                 ‾‾‾‾‾‾‾
                """;
        String dice4 = """
                 _______
                | ●   ● |
                |       |
                | ●   ● |
                 ‾‾‾‾‾‾‾
                """;
        String dice5= """
                 _______
                | ●   ● |
                |   ●   |
                | ●   ● |
                 ‾‾‾‾‾‾‾
                """;
        String dice6 = """
                 _______
                | ●   ● |
                | ●   ● |
                | ●   ● |
                 ‾‾‾‾‾‾‾
                """;
        switch(roll){
            case 1 -> System.out.println(dice1);
            case 2 -> System.out.println(dice2);
            case 3 -> System.out.println(dice3);
            case 4 -> System.out.println(dice4);
            case 5 -> System.out.println(dice5);
            case 6 -> System.out.println(dice6);
        }
    }



}











