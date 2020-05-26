import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner S=new Scanner(System.in);
        boolean dontquit=true;
        ArrayList<Customer> customers=new ArrayList<>();
        while(dontquit) {
            System.out.println("\t\tBank Admin Menu");
            System.out.println("Select from the below menu :");
            System.out.println("(1). Add Customer to the bank");
            System.out.println("(2). Change Customer name");
            System.out.println("(3). Check Account Balance");
            System.out.println("(4). Modify Account Balance");
            System.out.println("(5). Summary Of All Accounts");
            System.out.println("(-1). Quit ");
            int input=S.nextInt();
            if(input==1){
                System.out.println("\t\tBank cutomer Menu");
                System.out.println("enter balance : ");
                double  balance=S.nextDouble();
                        if(balance>=0) {
                            System.out.println("enter accountname : ");
                            S.nextLine();
                            String name = S.nextLine();
                            customers.add(new Customer(name, balance));
                            System.out.println("customer id is " + customers.size());
                        }
                        else{
                            System.out.println("Balance must be greater than 0");
                        }
                }
                else if(input==2){
                        System.out.println("\t\t Modifying Customer name");
                        System.out.println("enter customer id: ");
                        int id=S.nextInt();
                        if(id>customers.size() ){
                            System.out.println("enter correct id");
                        }
                        else{
                            System.out.println("Enter new name for the customer ");
                            String newname=S.nextLine();
                            String oldname=customers.get(id-1).getName();
                            customers.get(id-1).setName(newname);
                            System.out.println("Name sucessfully changed from "+oldname+"to"+newname);
                        }
                }
                else if(input==3){
                    System.out.println("\t\t Checking Customer balance");
                    System.out.println("enter customer id: ");
                    int id=S.nextInt();
                    if(id>customers.size() ){
                        System.out.println("enter correct id");
                    }
                    else{
                        System.out.println(customers.get(id-1).getName()+" Balance is "+customers.get(id-1).getBalance());
                    }
                }
                else if(input==4){
                    System.out.println("\t\t Modifying Customer balance");
                    System.out.println("enter customer id: ");
                    int id=S.nextInt();
                    if(id>customers.size() ){
                        System.out.println("enter correct id");
                    }
                    else{
                        System.out.println("Enter new balance amount ");
                        double newbalance=S.nextDouble();
                        double oldbalance=customers.get(id-1).getBalance();
                        customers.get(id-1).setBalance(newbalance);
                        System.out.println("balance updated from "+oldbalance+"to"+newbalance);
                    }
                }
                else if (input==5){
                    System.out.println("\t\t Accoounts Summary");
                    for(int i=0;i<customers.size();i++){
                        int id=i+1;
                        String name=customers.get(i).getName();
                        double balance=customers.get(i).getBalance();
                        System.out.println("\taccountid "+id+"\tcustomer name "+name+"\tbalance "+balance);
                        System.out.println("---------------------------------------");

                    }

                }
                else if (input==-1){
                        System.out.println("Do you really want to quit?");
                        System.out.print("1.Yes 2.No");
                        int choice=S.nextInt();
                        switch (choice){
                            case 1:{
                                dontquit=false;
                                break;
                            }
                            case 2:{
                                //
                                break;
                            }
                            default:{
                                System.out.println("choose correct option");
                                break;
                            }
                        }
                }
                else{
                    System.out.print("choose correct option");
                }
        }

    }
}
