import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number : ");
        int num1 = input.nextInt();
        System.out.print("Enter the second number : ");
        int num2 = input.nextInt();
        System.out.print("Enter the third number : ");
        int num3 = input.nextInt();


        System.out.println("The smallest number is : "+smallest(num1,num2,num3));

        System.out.println("****************************");
        System.out.println("Enter a number to check if it positive or negative or zero");
        int num_check = input.nextInt();
        check(num_check);
        System.out.println("****************************");

        System.out.println("1. A password must have at least eight characters.\n" +
                "2. A password consists of only letters and digits.\n" +
                "3. A password must contain at least two digits\n" +
                "Input a password (You are agreeing to the above Terms and Conditions.):");
        Scanner input1 = new Scanner(System.in);

        System.out.println("Enter your password : ");

        String password  = input1.nextLine();
        System.out.println(password);
        if (check_pass(password)){
            System.out.println("Password is valid");
        }else {
            System.out.println("Password is not valid");
        }

    }
//     1 - Write a Java method to find the smallest number among three numbers.

    public static int smallest (int num1 , int num2 , int num3){

        if (num1 < num2 &&num1 < num3){
            return num1;
        } else if (num2 <num1 && num2 <num3) {
            return num2 ;
        }else {
            return num3 ;
        }

    }





//            2 - Write a Java method that check if the entered number is
//    negative or positive or zero.
    public static void check(int num){
        if(num>0){
            System.out.println("The number is positive ");
        } else if (num<0) {
            System.out.println("The number is negative");
        }else {
            System.out.println("The number is zero");
        }
    }

//        3 - Write a Java method to check whether a string is a valid password.
//    Password rules:
//    A password must have at least ten characters.
//    A password consists of only letters and digits.
//    A password must contain at least two digits.
//    Input the first number: 25
//    Input the Second number: 37
//    Input the third number: 29
//    Expected Output:
//    The smallest value is 25.0
//    Expected Output:
//            1. A password must have at least eight characters.
//            2. A password consists of only letters and digits.
//            3. A password must contain at least two digits
//    Input a password (You are agreeing to the above Terms and Conditions.):
//    abcd1234
//    Password is valid: abcd1234


    public static boolean check_pass(String pass){

        if (pass.length()<8 ){
            System.out.println("the password length should be 8 or more ");
          return false ;
        }
        if(!pass.matches("^[a-zA-Z0-9]+$")){
            System.out.println("the password should contain digit and char only ");
            return false;
        }

        if (count_num(pass)<2 ){
            System.out.println("the password should have at least two digit");
            return false;
        }

        return true;

    }

    public static int count_num(String pass){

        int counter =0 ;

        for (int i = 0; i <pass.length() ; i++) {
            if(pass.charAt(i) >= '0' && pass.charAt(i)<='9' ){
                    counter++;
            }
        }
     return counter;
    }



}

