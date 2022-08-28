
package selfchallenges;

import java.util.Scanner;


public class ArrayChallenge {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        String email[] = {"cheece33@gmail.com", 
                          "jake527@yahoo.com", 
                          "alex@students.nu-baliwag.edu.ph", 
                          "tyrone00@git.net", 
                          "reece18@meta.mail"};
        String userName[] = {"cheecey",
                             "jake",
                             "alexandria",
                             "dipperpines",
                             "reecesaints"};
        String password[] = {"mozzarellaShticks",
                             "cakedays",
                             "I<3steve",
                             "marryMeWendy",
                             "Nobita272"};
        
        //for this activity, I used a Scanner for the user to be able to type the index or (userID) of the account they want to identify.
        System.out.print("Enter userID: ");
        int userID = scan.nextInt();
        
        //after the user typed in their 
        System.out.println("User ID:  " + userID);
        System.out.println("Email:    " + email[userID]);
        System.out.println("Username: " + userName[userID]);
        System.out.println("Password: " + password[userID]);
    }
}
