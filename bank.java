// class customer of the bank
import java.util.*;

 public class bank
 {
    public static void main(String []args)
            {     
                  Scanner in= new Scanner(System.in);
                  String option=in.nextLine();
                  HashMap<String,bankAccount> bankAccountList;
                   if(option=="createBankAccount")
                        {
                           
                            System.out.println("enter your name");
                            String name= in.nextLine();
                            System.out.println("enter some initial balanace");
                            int balance=in.nextInt();
                            System.out.println("enter the phone no");
                            int phNo=in.nextInt();                          
                            bankAccountList=new HashMap<>();
                            String AccNo="bankAcc"+name+todaysDate.toString().replaceAll("\\s+","");
                            bankAccount b1=new bankAccount(name,balance,phNo,AccNo);
                            bankAccountList.put(AccNo,b1);
                            
                        }   
            }
 }
 class transaction 
 {
      int amount;
      String name;
      String transactionId;
      Date   firstDate; 
      transaction(int a,String n)
      {
         firstDate = new Date();
         amount=a;
         name=n;
         transactionId=name+firstDate.toString().replaceAll("\\s+",""); //removing whitespaces

      } 
      
 } 


 class customer
    {         
            String name;
            int phNo;
            // customer(String n,int ph)
            //     {
            //         name=n; 
            //         phNo=ph;
            //         ArrayList<transaction> t;
            //         t=new ArrayList<transaction>();
            //         transaction t1=new transaction(323,"dasdasda");
            //         t.add(t1);
            //     }
            
    }
  
    class bankAccount  extends customer
    {     
          int balance;
          String accountNo;
          Date dateOfOpening;
          Scanner in= new Scanner(System.in);
          Date todaysDate= new Date();
          bankAccount(String n,int b,int p,int acc)
          {
            accountNo=acc;
            phNo=p;
            balance=b;
            name=n;    
          }
          void debit()
          {  

            //String name= in.nextLine(); 




          }
        //   credit()
        //   {

        //   }

          
                
    }    



