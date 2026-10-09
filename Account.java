public class Account {
    private  double balance;
    public Account (double firstadd){
        balance = firstadd;
    }
    public boolean deposit (double added){
        if (added > 0){
            balance = balance + added;
            return true;
        }else {
            return false;
        }
    }
    public boolean withdraw (double minus){
        if (balance >= minus){
            balance = balance - minus;
            return true;
        }else {
            return false;
        }
    }
    public double getBalance(){
        return balance;
    }
}
