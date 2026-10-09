public class Bank {
    private Customer[] ApexHolders;
    private int numbOfCustomers;  
    public Bank(){
        ApexHolders = new Customer[10];
        numbOfCustomers = 0;
    }
    public void addApexHolders(String p, String l){
        Customer newApexHolders = new Customer(p, l);
        ApexHolders[numbOfCustomers] = newApexHolders;
        numbOfCustomers++;
    }  
    public int getNumbOfApexHolders(){
        return numbOfCustomers;
    }
    public Customer getApexHolders (int indeks){
        return ApexHolders [indeks];
    }
    public void showApexHolders(){
        for (int i = 0; i < numbOfCustomers; i++){
            System.out.println(ApexHolders[i].getFirstName() + " " + ApexHolders[i].getLastName() );
        }
        System.out.println("\n");
    }
}