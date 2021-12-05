import java.util.Scanner;

public class CLGT {
 
public static void main(String[] args) {
    final int max = 80;
    final int min = 1;
    int range = (max - min) + 1;

    int myPartnerNumber = (int) (Math.random() * range) + min;
//    System.out.println(myPartnerNumber);
    Scanner sc = new Scanner(System.in);
    int myGuess;
    int dem = 1;
    do {
        System.out.println("Give your guess!");
        myGuess = sc.nextInt();
        if (myGuess > myPartnerNumber){
            System.out.println("Your guess is bigger than your partner!");
            dem++;
        }else if (myGuess < myPartnerNumber){
            System.out.println("Your guess is smaller than your partner!");
            dem++;
        }else {
            System.out.println("Successful!");
            System.out.println("Number of guess:" +dem);
        }
    } while (myPartnerNumber != myGuess );

}
}

