public class BankDemo {
    public static void main(String[] args) {
        System.out.println("$ --- Welcome to K-Pitstop Capital --- $ \n");

        Bank kpc = new Bank ();

        kpc.addApexHolders("Kim", "Pharita");
        kpc.addApexHolders("Lee", "Dain");
        kpc.addApexHolders("Max", "Russel");
        kpc.addApexHolders("Charles", "Hamilton");

        System.out.println("K-Pitstop Capital has " + kpc.getNumbOfApexHolders() + " Customers call's Apex Holders");
        System.out.println("The Apex Holders are" );
        kpc.showApexHolders();

        kpc.getApexHolders(0).setAccount(new Account(7000000));
        kpc.getApexHolders(0).setAccount(new Account(1000000));   
        kpc.getApexHolders(1).setAccount(new Account(3000000));
        kpc.getApexHolders(2).setAccount(new Account(5000000));
        kpc.getApexHolders(3).setAccount(new Account(5000000));

        

        kpc.getApexHolders(1).getAccount(0).deposit(500000);
        System.out.println("Ms. " + kpc.getApexHolders(1).getLastName() + " make a cash deposit \n");

        kpc.getApexHolders(3).getAccount(0).withdraw(200000);
        System.out.println("Mr. " + kpc.getApexHolders(3).getLastName() + " make a withdraw cash \n");

        System.out.println("\nTheir balance are:");
        for (int i = 0; i < kpc.getNumbOfApexHolders();i++){
            System.out.println(i+1 + ". " + kpc.getApexHolders(i).getFirstName() + " " + kpc.getApexHolders(i).getLastName() + " Balance: " + kpc.getApexHolders(i).getAccount(0).getBalance());
        }
       
    }
}
