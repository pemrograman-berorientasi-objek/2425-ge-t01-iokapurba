package fintech.driver;
import fintech.model.Account;
import fintech.model.Transaction;
import java.util.Scanner;
/**
 * @author NIM Nama
 * @author NIM Nama
 */

public class Driver2 {
    
    public static void main(String[] _args) {
        
        Scanner scanner = new Scanner(System.in);
        String command;
        String owner;
        String acc_name;
        command = scanner.nextLine();
        owner = scanner.nextLine();
        acc_name = scanner.nextLine();
        Account account = new Account(owner, acc_name);
       

        
        int y = 0;
        while(y == 0){
            command = scanner.nextLine();
            if(command.equals("create-account")) {
                command = scanner.nextLine();
                owner = scanner.nextLine();
                acc_name = scanner.nextLine();
                System.out.println(account.toString());
            } 
            if (command.equals("create-transaction")){
                String acc_name1 = scanner.nextLine();
                Double ammount = scanner.nextDouble();
                scanner.nextLine();
                String posted = scanner.nextLine();
                String note = scanner.nextLine();
                Transaction transaction = new Transaction(acc_name1, ammount, posted, note);
                System.out.println(transaction.toString());
            }
            if(command.equals("---")){
                y++;
            }
        }
    }
}
