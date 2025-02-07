package fintech.model;

/**
 * @author NIM Nama
 * @author NIM Nama
 */
public class Account {

        private final String owner;
        private final String accountname;
        private Double balance = 0.0;

        public Account(String Owner, String acc){
            this.owner = Owner;
            this.accountname = acc;
        }

        @Override
        public String toString(){
            return accountname+"|"+owner+"|"+balance;
        }
}