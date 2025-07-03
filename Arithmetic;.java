package Arithmetic;
//java program to demonstrate handling

import java.io;

class ArithmeticJava {
    public static void main(string[]args)
    {
        int number1 = 300;
        int number2 = 0;

        try{

            //code that may throw an exception
            int answer = number1/ number2;
            system.out.println("Answer:" + answer);

        }
        catch (ArithmeticException e) {
             //handling the exception
             system.out.println("Error: Division by zero is not allowed!");
        }
        finally{
            system.out.ptintln("program continues after handling the exception");
        }
        }
        }
