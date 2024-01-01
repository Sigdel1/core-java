package oppconcept;

public class BankAccount {


   private String accountHolderName;
   public void setAccountHolderName(String accountHolderName){
      this.accountHolderName=accountHolderName;}
    public String getAccountHolderName(){
       return this.accountHolderName;
    }
    //accountHolderName-String-variable
    private String accountHolderAddress;
   public void setAccountHolderAddress(String accountHolderAddress){

       this.accountHolderAddress=accountHolderAddress;
   }
   public String getAccountHolderAddress(){
       return this.accountHolderAddress;
   }

    //accountHolderAddress-String-variable
   private String accountHolderDateOfBirth;
   public void setAccountHolderDateOfBirth(String accountHolderDateOfBirth){
       this.accountHolderDateOfBirth=accountHolderDateOfBirth;
   }
   public String getAccountHolderDateOfBirth(){

       return this.accountHolderDateOfBirth;
   }
    //accountHolderDateOfBirth-String-variable
   private String socialSecurityNumber;
   public void setSocialSecurityNumber(String socialSecurityNumber){

       this.socialSecurityNumber=socialSecurityNumber;
   }
   public String getSocialSecurityNumber(){

       return this.socialSecurityNumber;
   }
    //socialSecurityNumber-String-variable
    private Gender accountHolderGender;
   public void setAccountHolderGender(Gender accountHolderGender){

       this.accountHolderGender=accountHolderGender;
   }
   public Gender getAccountHolderGender(){
       return this.accountHolderGender;
   }
    private Accounttype accountType;
   public void setAccountType(Accounttype accountType){

       this.accountType=accountType;
    }
    public Accounttype getAccountType(){
        return this.accountType;

    }

   private double accountBalance;
   public void setAccountBalance(Double accountBalance){
       this.accountBalance=accountBalance;
   }
   public Double getAccountBalance(){
       return this.accountBalance;
   }
    //accountBalance-double-variable

   private String accountNumber;
   public void setAccountNumber(String accountNumber){
       this.accountNumber=accountNumber;
   }
   public String getAccountNumber(){
       return this.accountNumber;
   }
    //accountNumber-String-variable
   private String routingNumber;
   public void setRoutingNumber(String routingNumber){
       this.routingNumber=routingNumber;
   }
   public String getRoutingNumber(){
       return this.routingNumber;
   }
    //routingNumber-String-variable
   private String phoneNumber;
   public void setPhoneNumber(String phoneNumber){
       this.phoneNumber=phoneNumber;
   }
   public String getPhoneNumber(){
       return this.phoneNumber;
   }
    //phoneNumber-String-variable
   private String emailAddress;
   public void setEmailAddress(String emailAddress){
       this.emailAddress=emailAddress;
   }
   public String getEmailAddress(){
       return this.emailAddress;
   }
    //emailAddress-String-variable
    private boolean isMinorAccount;
   public void setIsMinorAccount(Boolean isMinorAccount){
       this.isMinorAccount=isMinorAccount;
   }
   public Boolean getIsMinorAccount(){
       return this.isMinorAccount;
   }
    //isMinorAccount-boolean-variable
    private final String BANK_NAME = "Bank Of America";
   public String getBank_Name(){
       return this. BANK_NAME;

    }



}
