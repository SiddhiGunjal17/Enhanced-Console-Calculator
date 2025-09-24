import java.util.Scanner;

public class calculator {

    // ---------- Basic Arithmetic ----------
    static double add(double a, double b) { return a + b; }
    static double subtract(double a, double b) { return a - b; }
    static double multiply(double a, double b) { return a * b; }
    static double divide(double a, double b) { 
        if (b == 0) {
            System.out.println("❌ Cannot divide by zero!");
            return 0;
        }
        return a / b; 
    }

    // ---------- Scientific Functions ----------
    static double squareRoot(double a) { return Math.sqrt(a); }
    static double power(double a, double b) { return Math.pow(a, b); }
    static double log(double a) { return Math.log(a); } // natural log
    static double sin(double a) { return Math.sin(Math.toRadians(a)); }
    static double cos(double a) { return Math.cos(Math.toRadians(a)); }
    static double tan(double a) { return Math.tan(Math.toRadians(a)); }

    // ---------- Unit Conversions ----------
    static double celsiusToFahrenheit(double c) { return (c * 9/5) + 32; }
    static double fahrenheitToCelsius(double f) { return (f - 32) * 5/9; }
    static double kmToMiles(double km) { return km * 0.621371; }
    static double milesToKm(double miles) { return miles / 0.621371; }

    // ---------- Main Menu ----------
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n=== Enhanced Calculator ===");
            System.out.println("1. Basic Arithmetic");
            System.out.println("2. Scientific Functions");
            System.out.println("3. Unit Conversion");
            System.out.println("0. Exit");
            System.out.print("Choose option: ");
            choice = sc.nextInt();

            switch(choice) {
                case 1:
                    System.out.println("Enter two numbers:");
                    double a = sc.nextDouble();
                    double b = sc.nextDouble();
                    System.out.println("Addition: " + add(a,b));
                    System.out.println("Subtraction: " + subtract(a,b));
                    System.out.println("Multiplication: " + multiply(a,b));
                    System.out.println("Division: " + divide(a,b));
                    break;

                case 2:
                    System.out.println("1. Square Root\n2. Power\n3. Log\n4. Sin\n5. Cos\n6. Tan");
                    int sciChoice = sc.nextInt();
                    double num1, num2;
                    switch(sciChoice) {
                        case 1: 
                            System.out.print("Enter number: ");
                            num1 = sc.nextDouble();
                            System.out.println("√ = " + squareRoot(num1)); 
                            break;
                        case 2: 
                            System.out.print("Enter base and exponent: ");
                            num1 = sc.nextDouble(); num2 = sc.nextDouble();
                            System.out.println("Result = " + power(num1, num2)); 
                            break;
                        case 3:
                            System.out.print("Enter number: ");
                            num1 = sc.nextDouble();
                            System.out.println("log(" + num1 + ") = " + log(num1));
                            break;
                        case 4:
                            System.out.print("Enter angle (degrees): ");
                            num1 = sc.nextDouble();
                            System.out.println("sin = " + sin(num1));
                            break;
                        case 5:
                            System.out.print("Enter angle (degrees): ");
                            num1 = sc.nextDouble();
                            System.out.println("cos = " + cos(num1));
                            break;
                        case 6:
                            System.out.print("Enter angle (degrees): ");
                            num1 = sc.nextDouble();
                            System.out.println("tan = " + tan(num1));
                            break;
                    }
                    break;

                case 3:
                    System.out.println("1. Celsius → Fahrenheit\n2. Fahrenheit → Celsius\n3. Km → Miles\n4. Miles → Km");
                    int convChoice = sc.nextInt();
                    double value;
                    switch(convChoice) {
                        case 1: System.out.print("Enter °C: "); value = sc.nextDouble(); 
                                System.out.println("= " + celsiusToFahrenheit(value) + "°F"); break;
                        case 2: System.out.print("Enter °F: "); value = sc.nextDouble(); 
                                System.out.println("= " + fahrenheitToCelsius(value) + "°C"); break;
                        case 3: System.out.print("Enter Km: "); value = sc.nextDouble(); 
                                System.out.println("= " + kmToMiles(value) + " miles"); break;
                        case 4: System.out.print("Enter Miles: "); value = sc.nextDouble(); 
                                System.out.println("= " + milesToKm(value) + " km"); break;
                    }
                    break;

                case 0:
                    System.out.println("👋 Exiting Calculator...");
                    break;

                default:
                    System.out.println("❌ Invalid option!");
            }

        } while(choice != 0);

        sc.close();
    }
}