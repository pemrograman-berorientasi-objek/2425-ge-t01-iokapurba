package fintech.driver;
import fintech.model.Account;
import java.util.Scanner;;
/**
 * @author NIM Nama
 * @author NIM Nama
 */

public class Driver1 {
    
    public static void main(String[] _args) {
        
        Scanner scanner = new Scanner(System.in);
        String command;
        String owner;
        String acc_name;
        // float balance = 0;
        command = scanner.nextLine();
        owner = scanner.nextLine();
        acc_name = scanner.nextLine();
        Account account = new Account(owner, acc_name);
       

        if(command.equals("create-account")) {

            System.out.println(account.toString());
            // System.out.println(acc_name+"|"+owner+"|"+balance);

        } else if (command.equals("create-transaction")){
            


        }
    }
}
