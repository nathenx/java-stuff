public class hello {
public static void main(String[] args) {
System.out.println("Hello Tim");

boolean isAlien = false;
if (isAlien == false)
    System.out.println("It is not an alien!");
    System.out.println("And I am scared of aliens");

    int topScore = 80;
    if (topScore <= 100)
        System.out.println("You got the high score!");




    int secondTopScore = 79;
    if ((topScore > secondTopScore) && (topScore <= 100))
        System.out.println("Greater than second top score and less than 100");


    if ((topScore > 90) || (secondTopScore <= 90)){
        System.out.println("One of these tests is true");
    }

    double newValue = 50.00;
    if (newValue == 50)
        System.out.println("This is true and new value is 50");
        if (newValue != 50)
            System.out.println("This is not true and new value is not 50");

    boolean isCar = false;
    if (isCar == true)
        System.out.println("This is not supposed to happen");
}
}