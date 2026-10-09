public class Customer {
    private String firstName;
    private String lastName;
    private Account[] accounts = new Account[5];
    private int numberOfaccount = 0;
    public Customer (String f, String l){
        firstName = f;
        lastName = l;
    }
    public String getFirstName(){
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public Account getAccount(int indeks){
        return accounts [indeks];
    }
    public void setAccount (Account acc){
        if(numberOfaccount < 5){
            accounts [numberOfaccount++] = acc;
        }
    }
    public int getNumberOfAccount(){
        return numberOfaccount;
    }
}
