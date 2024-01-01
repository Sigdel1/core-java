package oppconcept;

public class BankAccountApplication {public static void main(String[] args) {
    BankAccount tamanAccount = new BankAccount();
    //tamanAccount.accountHolderName="Taman Neupane";
    tamanAccount.setAccountHolderName("Taman Neupane");
    //tamanAccount.accountNumber="1233456";
    tamanAccount.setAccountNumber("5674321");
   // tamanAccount.accountHolderGender=Gender.MALE;
    tamanAccount.setAccountHolderGender(Gender.MALE);
    //tamanAccount.accountType=Accounttype.CHECKING;
    tamanAccount.setAccountType(Accounttype.CHECKING);

    BankAccount abcAccount = new BankAccount();
   // abcAccount.accountHolderName="ABC Neupane";
    abcAccount.setAccountHolderName("Hari");
   // abcAccount.accountNumber="34568956";
    abcAccount.setAccountNumber("674905");
   // abcAccount.accountHolderGender=Gender.PREFER_NOT_TO_SAY;
    abcAccount.setAccountHolderGender(Gender.PREFER_NOT_TO_SAY);
    //abcAccount.accountType=Accounttype.SAVING;
    abcAccount.setAccountType(Accounttype.SAVING);


   // System.out.println(tamanAccount.accountHolderName);
   // System.out.println(abcAccount.accountHolderName);


}









}
