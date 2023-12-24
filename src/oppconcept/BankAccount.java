package oppconcept;

public class BankAccount {

    //accountHolderName-String-variable
    String accountHolderName;
    //accountHolderAddress-String-variable
    String accountHolderAddress;
    //accountHolderDateOfBirth-String-variable
    String accountHolderDateOfBirth;
    //socialSecurityNumber-String-variable
    String socialSecurityNumber;
    Gender accountHolderGender;
    Accounttype accountType;
    //accountBalance-double-variable
    double accountBalance;

    //accountNumber-String-variable
    String accountNumber;
    //routingNumber-String-variable
    String routingNumber;
    //phoneNumber-String-variable
    String phoneNumber;
    //emailAddress-String-variable
    String emailAddress;
    //isMinorAccount-boolean-variable
    boolean isMinorAccount;
    //bankName-String-constant(if single bank is take into consideration)
    final String BANK_NAME = "Bank Of America";

    //Behavior

    public static void main(String[] args) {
        BankAccount tamanAccount = new BankAccount();
        tamanAccount.accountHolderName="Taman Neupane";
        tamanAccount.accountNumber="1233456";
        tamanAccount.accountHolderGender=Gender.MALE;
        tamanAccount.accountType=Accounttype.CHECKING;


        BankAccount abcAccount = new BankAccount();
        abcAccount.accountHolderName="ABC Neupane";
        abcAccount.accountNumber="34568956";
        abcAccount.accountHolderGender=Gender.PREFER_NOT_TO_SAY;
        abcAccount.accountType=Accounttype.SAVING;


        System.out.println(tamanAccount.accountHolderName);
        System.out.println(abcAccount.accountHolderName);


    }
}
