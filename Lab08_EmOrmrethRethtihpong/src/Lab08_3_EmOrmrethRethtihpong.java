import java.util.ArrayList;
import java.util.Scanner;

class Account{
  private String accountName;
  private float accountBalance;
  private String accountID;

  public String getAccountName() {
    return accountName;
  }

  public float getAccountBalance() {
    return accountBalance;
  }

  public String getAccountID() {
    return accountID;
  }

  public void setAccountName(String accountName) {
    this.accountName = accountName;
  }

  public void setAccountBalance(float accountBalance) {
    this.accountBalance = accountBalance;
  }

  public void setAccountID(String accountID) {
    this.accountID = accountID;
  }
  public void display(ArrayList<Account> accounts){
    for(int i=0;i<accounts.size();i++){
      System.out.println("No #" + (i+1));
      System.out.println("ACC_ID: " + accounts.get(i).getAccountID());
      System.out.println("ACC_HOLDER: " + accounts.get(i).getAccountName());
      System.out.println("ACC_BALANCE: " + accounts.get(i).getAccountBalance());
      System.out.println();
    }
  }
}
class BankManagement extends Account{
  private float amount;
  private boolean searchFound;

  public void setAmount(float amount) {
    this.amount = amount;
  }

  public float getAmount() {
    return amount;
  }

  public void withdraw(ArrayList<Account> accounts){
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter account ID: ");
    String id = scanner.nextLine();
    int index = searchByID(accounts,id);
    try {
    if(searchFound){
        System.out.print("Enter amount to withdraw: ");
        setAmount(scanner.nextFloat());
        String floatStr = Float.toString(getAmount());
        String []strArr = floatStr.split("\\.");
        if(strArr[1].length() > 2){
          throw new Exception("Invalid input please try again");
        }else {
          if(getAmount() > accounts.get(index).getAccountBalance()){
            throw new Exception("The amount to withdraw must be less than the balance");
          }else if (getAmount() <= 0){
            throw new Exception("Invalid amount...");
          }else{
            accounts.get(index).setAccountBalance(accounts.get(index).getAccountBalance() - getAmount());
            System.out.println("Successfully withdraw");
          }
        }
    }else{
      System.out.println("Invalid ID...");
      throw  new Exception("Search is not found");
    }
    }catch (Exception e){
      System.out.println(e.getMessage());
    }
  }
  public void deposit(ArrayList<Account> accounts){
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter account ID: ");
    String id = scanner.nextLine();
    int index = searchByID(accounts,id);
    try {
      if(searchFound){
        System.out.print("Enter amount to deposit: ");
        setAmount(scanner.nextFloat());
        String floatStr = Float.toString(getAmount());
        String []strArr = floatStr.split("\\.");
        if(strArr[1].length() > 2){
          throw new Exception("Invalid input please try again");
        }else {
          if(getAmount() > 0 && getAmount() <= 1000){
            accounts.get(index).setAccountBalance(accounts.get(index).getAccountBalance() + getAmount());
            System.out.println("Successfully deposit");
          }else{
            throw new Exception("The amount must be between (0-1000)");
          }
        }
      }else{
        System.out.println("Invalid ID...");
        throw  new Exception("Search is not found");
      }
    }catch (Exception e){
      System.out.println(e.getMessage());
    }
  }
  public int searchByID(ArrayList<Account> accounts,String id){
    int index=0;
    searchFound = false;
    for(index = 0;index<accounts.size();index++){
      if(accounts.get(index).getAccountID().equals(id)){
        searchFound = true;
        break;
      }
    }
    return index;
  }
  public void transfer(ArrayList<Account> accounts){
    System.out.print("Enter your account ID: ");
    Scanner scanner = new Scanner(System.in);
    String id = scanner.nextLine();
    int ownAccount = searchByID(accounts,id);
    try {
      if(searchFound){
        System.out.print("Enter the account ID that you want to transfer: ");
        int transferAcc = searchByID(accounts,scanner.nextLine());
        if(searchFound){
          System.out.print("Enter amount to transfer: ");
          setAmount(scanner.nextFloat());
          String floatStr = Float.toString(getAmount());
          String []strArr = floatStr.split("\\.");
          if(strArr[1].length() > 2){
            throw new Exception("Invalid input please try again");
          }else {
            accounts.get(ownAccount).setAccountBalance(accounts.get(ownAccount).getAccountBalance() - getAmount());
            accounts.get(transferAcc).setAccountBalance(accounts.get(transferAcc).getAccountBalance() + getAmount());
            System.out.println("Transfer Success");
          }
        }else{
          throw  new Exception("Transfer account is not found");
        }
      }else{
        System.out.println("Invalid ID...");
        throw  new Exception("Wrong account..");
      }
    }catch (Exception e){
      System.out.println(e.getMessage());
    }
  }
}
public class Lab08_3_EmOrmrethRethtihpong {
  static void menu(){
    System.out.println("::::: The Bank ::::::");
    System.out.println("1. Account List");
    System.out.println("2. Create an account");
    System.out.println("3. Deposit to an account");
    System.out.println("4. Withdraw from an account");
    System.out.println("5. Transfer to another account");
    System.out.println("6. Quit");
    System.out.print("Choose an opt: ");
  }
  public static void main(String[] args) {
    ArrayList<Account> accountArrayList = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);
    Account account = new Account();
    BankManagement bankManagement = new BankManagement();
    int input;
    do {
      menu();
      input = scanner.nextInt();
      switch (input){
        case 1:
          account.display(accountArrayList);
          break;
        case 2:
          account = new Account();
          System.out.print("Enter account ID: ");
          scanner.nextLine();
          account.setAccountID(scanner.nextLine());
          System.out.print("Enter account holder: ");
          account.setAccountName(scanner.nextLine());
          System.out.print("Enter account balance: ");
          Float amount = scanner.nextFloat();
          try {
            String floatStr = Float.toString(amount);
            String []strArr = floatStr.split("\\.");
            if(strArr[1].length() > 2){
              throw new Exception("Invalid input please try again");
            }else{
              account.setAccountBalance(amount);
              accountArrayList.add(account);
            }
          }catch (Exception e){
            System.out.println(e.getMessage());
          }
        break;
        case 3:
          bankManagement.deposit(accountArrayList);
          break;
        case 4:
          bankManagement.withdraw(accountArrayList);
          break;
        case 5:
          bankManagement.transfer(accountArrayList);
          break;
        case 6:
          System.exit(0);
          break;
        default:
          System.out.println("Invalid Input....");
          break;
        }
    }while (true);
  }
}
