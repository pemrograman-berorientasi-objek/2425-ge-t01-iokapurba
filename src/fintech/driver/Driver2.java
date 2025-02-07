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

            Account account = null;
            command = scanner.nextLine();
            if(command.equals("create-account")) {
                owner = scanner.nextLine();
                acc_name = scanner.nextLine();
                account = new Account(owner, acc_name);

                System.out.println(account.toString());
            } 
            command = scanner.nextLine();
            if (command.equals("create-transaction")){
                String acc_name1 = scanner.nextLine();
                Double ammount = scanner.nextDouble();
                scanner.nextLine();
                String posted = scanner.nextLine();
                String note = scanner.nextLine();
                Transaction transaction = new Transaction(acc_name1, ammount+account.getbalance(), posted, note);
                System.out.println(transaction.toString());
            }
    }
}
