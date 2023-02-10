//THIS IS A JAVA PROGRAM FOR ATM INTERFACE

import java.util.*;

public class ATMInterface{

	static int availBalance = 100000;

   public static void main(String[] args){
        
		
		//available Balance at this moment is 1,00,000.
        
        int withDrawAmount,deposit;
		//Declaring withDraw and deposit variable with int type.


        Scanner scn=new Scanner(System.in);//Creating scn object using Scanner class

        String userName,passWord;
         //Taking username and password as string since We are taking them input as string

          System.out.print(" Enter UserName : ");
          userName=scn.nextLine();
          //Taking input from keyboard


          System.out.print("Enter Password : ");
          passWord=scn.nextLine();

          if((userName.equals("BankManager")&&(passWord.equals("23manager")))||(userName.equals("BankStaff1")&&(passWord.equals("23Staff1")))){
			  System.out.println("Welcome to the XYZ Bank ! ");

			  while(true){

                  System.out.println( " Choose the option you want to perform : " );
				  System.out.println( " Choose 1 to Check Bank Balance " );
                  System.out.println( " Choose 2 to Deposit " );
                  System.out.println( " Choose 3 to Withdraw " );
                  System.out.println( " Choose 4 to EXIT " );
				  System.out.println(" Enter the option, you want to perform ");

				  int choice=scn.nextInt();

				  switch(choice){

					  case 1:

						  System.out.println();
						  System.out.println(" Your Current account balance is "+availBalance);
						  System.out.println();
						  break;
                      
					  case 2:
						  System.out.println(" The amount to be deposited is");
					      
						  deposit=scn.nextInt();

						  deposit(availBalance,deposit);
						  break;

					  case 3: 
						  System.out.println(" Enter the amount to be withdrawn");
						 
						  //Enter the amount to withdraw
					      withDrawAmount=scn.nextInt();

						  //Check whether the account balance is enough to withdraw the money, then withdraw
                          withDraw(withDrawAmount);

						  break;

						case 4:
							System.exit(0);

							
					      


				  }	  }
		  }else{
			  System.out.println("Wrong UserName or PassWord, Please try again ");
		  }
   }


   public static void printBankBalance(int availBalance){
	   //This method prints the available balance
       
	   System.out.println();
	   System.out.println(" The available balance is "+availBalance);
	   System.out.println();

   }

  public static int withDraw(int withDrawAmount){
	  // This method performs the withDraw operation
       
	  //Let's check whether the current available balance is enough to withdraw the money, if available balance is >= withdrawAmount, then amount is withdrawn from the account.
      if(availBalance>=withDrawAmount){

		  System.out.println(" The amount to be withdrawn from the account is "+withDrawAmount);

		  availBalance=availBalance-withDrawAmount;
		  //Updating the availBalance after the amount is withdrawn

		  System.out.println(" Please Collect your money,and remove the card");

		  printBankBalance(availBalance);

	  }
	  else{

		  System.out.println(" Sorry for your inconvenience !! Your current available balance is not sufficent to perform withdraw ");
   

  }
  return availBalance;
  }


  public static int deposit(int availBalance, int amountDeposit){
	  //This method helps us to perform deposit operation.

      if(amountDeposit>=0){
      
	  System.out.println();
	  System.out.println("The amount to be deposited is "+amountDeposit);
	  availBalance=availBalance+amountDeposit;

	  System.out.println("Amount is Successfully deposited");

	  printBankBalance(availBalance);

	  }else{
		  System.out.println("Please check the amount entered, Make sure it is a Whole Number");

	  }
	  
	  return availBalance;
	  
}

           

}
