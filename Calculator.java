import java.util.Scanner;
public class Calculator {

    static int[] getintegervariable(){
        Scanner input = new Scanner(System.in);
        System.out.print("1stNumber:  ");
        int n1 = input.nextInt();
        System.out.print("2ndNumber:  ");
        int n2 = input.nextInt();
        return new int[]{n1, n2};
    }

    static double[] getdoublevariable() {
        Scanner input = new Scanner(System.in);
        System.out.print("1stNumber:  ");
        double n1 = input.nextDouble();
        System.out.print("2ndNumber:  ");
        double n2 = input.nextDouble();
        return new double[]{n1, n2};
    }

    static int addition (){
        int[] callback = getintegervariable();
        return callback[0]+callback[1];

    }

    static int subtraction (){
        int[] callback = getintegervariable();
        return callback[0] - callback[1];
    }

    static int multiplication (){
        int[] callback = getintegervariable();
        return callback[0] * callback[1];
    }

    static double division ()throws Exception {
        double[] callback = getdoublevariable();

        if (callback[0] >= callback[1]) {
            return (callback[0] / callback[1]);
        } else {
            throw new Exception("Error! Division by zero can not get calculated!");
        }
    }

    static void exponent (){
        Scanner input = new Scanner(System.in);

        System.out.print("Base Number:  ");
        int base = input.nextInt();
        int temp = base;

        System.out.print("Exponent Number:  ");
        int exp = input.nextInt();

        for (int i = 1; i < exp; i++){
            temp = temp * base;
            //System.out.println(temp);
        }
        System.out.println("Base Number = " + base
                            + " \nExponent Number = "+ exp
                            + " \nResult = "+ temp);

    }

    static void factorial (){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Factorial Number:  ");
        int no = input.nextInt();
        int factorialno = 1;

        for(int i = 1; i<=no; i++){
            factorialno = factorialno * i;
        }
        System.out.println("The Result of " + no + "! is " + factorialno);
    }

    static void modding (){
        Scanner input = new Scanner(System.in);

        System.out.println("Division Numbers!");
        System.out.print("Dividend:  ");
        double dividend = input.nextDouble();
        System.out.print("Divisor Number:  ");
        double divisor = input.nextDouble();

        double quotient = dividend / divisor;
        System.out.println("The Result of Division " + quotient);

        double modding = dividend % divisor;
        System.out.println("The Result of Modding in Division " + modding);

        /*System.out.print("Please Enter The Base Number:  ");
        double base = input.nextDouble();
        System.out.print("Please Enter The Mode Number:  ");
        double mode = input.nextDouble();

        double modding = base % mode;
        System.out.println("Result is " + modding);*/
    }

    static void areaofrectangle (){
        //The Formula for Area of a rectangle =   Length * Width
        Scanner input = new Scanner(System.in);

        System.out.print("Length of Rectangle:  ");
        double length = input.nextDouble();
        System.out.print("Width of Rectangle:  ");
        double width = input.nextDouble();

        double result = length * width;
        System.out.println("Area of Rectangle: " + result);
    }

    static void perimeterofrectangle (){
        //The Formula for Perimeter of a rectangle = 2(Length + Width)
        Scanner input = new Scanner(System.in);

        System.out.print("Length of Rectangle:  ");
        double length = input.nextDouble();
        System.out.print("Width of Rectangle:  ");
        double width = input.nextDouble();

        double perimeter = 2 * (length + width);
        System.out.println("Perimeter of a Rectangle: "+ perimeter);
    }


    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);
        String operationslist = """
                Welcome! :)
                1-Addition
                2-Subtraction
                3-Multiplication
                4-Division
                5-Exponent
                6-Factorial
                7-Modding
                8-Area of Rectangle
                9-Perimeter of Rectangle""";

        while (true){
            System.out.println(operationslist);
            System.out.print("Please Choose an Operation:  ");
            int select = input.nextInt();

            if (select == 0){
                break;
            }
            switch (select){
                case 1:
                    System.out.println(addition());
                    break;
                case 2:
                    System.out.println(subtraction());
                    break;
                case 3:
                    System.out.println(multiplication());
                    break;
                case 4:
                    System.out.println(division());
                    break;
                case 5:
                    exponent();
                    break;
                case 6:
                    factorial();
                    break;
                case 7:
                    modding();
                    break;
                case 8:
                    areaofrectangle();
                    break;
                case 9:
                    perimeterofrectangle();
                    break;
            }

        }
    }
}
