import java.util.Scanner;

class WindChill{
    public static void main(String[] args){
        /*
        w = 35.74 + 0.6215 t + (0.4275 t - 35.75) v^0.16

        the formula is not valid if t is larger than 50 in absolute value 
        or if v is larger than 120 or less than 3. Print out error messages 
        to inform the user if the values are out of range.
        */

        Scanner sc = new Scanner(System.in);
        System.out.print("What's your name? :");
        String name = sc.nextLine();
        System.out.println("Hi " + name + "!");
        




        sc.close();
    }
}

