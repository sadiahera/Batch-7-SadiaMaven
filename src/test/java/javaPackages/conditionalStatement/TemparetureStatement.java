package conditionalStatement;
import java.util.Scanner;

public class TemparetureStatement {

  /* Take a tempareture as user input as a farenhight
  if it is 30-49 print cold
  if it is 50-69 print warm
  if it is 70-89 - it is super hot visit bangladesh/ india
   */

    public void tempareture() {

        Scanner scan = new Scanner(System.in);
        int tempareture = scan.nextInt();

        if ((tempareture == 30) || (tempareture < 49)) {
            System.out.println("cold");
        }
        if ((tempareture == 49) || (tempareture < 69)) {
            System.out.println("Warm");
        }
        if ((tempareture == 69) || (tempareture < 89)) {
            System.out.println("it is supper hot visit to bangladesh/india");
        }


    }

    public static void main(String[] args) {
        TemparetureStatement obj = new TemparetureStatement();
        obj.tempareture();

    }
}