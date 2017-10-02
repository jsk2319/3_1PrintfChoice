/**
 *@author jsk2319@email.vccs.edu
 * Author: Jude Kallista-Fitzpatrick
 * Purpose: To give the user a choice between println and printf for how they want information displayed
 */

/* imports */
import javafx.application.Application;
import javafx.scene.control.TextInputDialog;
import javafx.stage.Stage;
import java.util.Optional;


public class PrintfChoice extends Application {


    @Override
    public void start(Stage primaryStage) {
        TextInputDialog printInput = new TextInputDialog("1");
            printInput.setTitle("Println or Printf?");
            printInput.setContentText("Type \"1\" for println or \"2\" for printf. It will greet you, spell out \"Jude\", display Jude's birth year, and Jude's height in feet.");
        Optional<String> input = printInput.showAndWait();
        String option = input.get();

        //Println output
        if(option.equals("1")) {
            System.out.println("You have entered 1.");
            System.out.println("Hello, User");
            System.out.println("J");
            System.out.println("u");
            System.out.println("d");
            System.out.println("e");
            System.out.println("Birth year: 1999");
            System.out.println("Height: 5.9");

            //Printf output
        } else if (option.equals("2")) {
            System.out.printf("You have entered 2.");
            System.out.printf("\n Hello %s \n ","User");
            System.out.printf("%c \n", 74);
            System.out.printf("%c \n", 117);
            System.out.printf("%c \n", 100);
            System.out.printf("%c \n", 101);
            System.out.printf("Birth year: %d \n", 1999);
            System.out.printf("Height with exponent: %e \n", 5.9);
            System.out.printf("Height with Float: %f \n", 5.9 );
        }


    }
}
