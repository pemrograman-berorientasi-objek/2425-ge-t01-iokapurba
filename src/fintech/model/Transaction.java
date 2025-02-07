package fintech.model;

/**
 * @author NIM Nama
 * @author NIM Nama
 */
public class Transaction {
    private final String acc_name;
    private Double ammount = 0.0;
    private final String posted;
    private final String note;
    private Double balance = 0.0;
    private int id_idx = 0;
    private int id;

    public Transaction(String acc_name, Double ammount, String posted, String note){
        id_idx++;
        this.id = id_idx; 
        this.acc_name = acc_name;
        this.ammount = ammount;
        this.posted = posted;
        this.note = note;
        this.balance = balance + ammount;
    }

    public double getbal(){
        return this.balance;
    }


    @Override
    public String toString(){
        return this.id+"|"+this.acc_name+"|"+this.ammount+"|"+this.posted+"|"+this.note+"|"+this.balance;
    }
}

