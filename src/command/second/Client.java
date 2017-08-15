package command.second;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationManager am = new ApplicationManager();
		
		User user = new User("Alice", "A");
		Command dbcommand = new CreateUserCommand(user);
		am.saveInfoOperation(dbcommand);
		
		Command acctcommand = new CreateAccountCommand(user);
		am.saveInfoOperation(acctcommand);
		
		CreditCard card = new CreditCard("123", 1000);
		Account acct = new Account(user);
		card.setValidated(true);
		Command submitcommand = new SubmitCreditCardInfoCommand(acct, card);
		am.validateCreditCardInfoOperation(submitcommand, card);
		
		CreditCard card2 = new CreditCard("134", 1000);
		Account acct2 = new Account(user);
		card2.setValidated(false);
		Command submitcommand2 = new SubmitCreditCardInfoCommand(acct2, card2);
		am.validateCreditCardInfoOperation(submitcommand2, card2);
	}

}
