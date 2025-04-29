import java.util.*;

class HelloTillStop {
    Scanner sc = new Scanner(System.in);

    // Outputs "hello" while user types 'h'
    void showHello() {
        String choice; // Guard variable

        System.out.println("For hello type 'h', anything else to stop");
        choice = sc.next(); // Set guard variable
        
        while (choice.equals("h")) { // While user types 'h'
            System.out.println("hello");
            choice = sc.next(); // Update guard variable
        }
    }

    public static void main(String[] args) {
        HelloTillStop obj = new HelloTillStop();
        obj.showHello();
    }
}



