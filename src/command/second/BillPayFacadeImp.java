package command.second;

public class BillPayFacadeImp implements BillPayFacadeInterface {

	@Override
	public Account createPaymentAccount(User user) {
		// TODO Auto-generated method stub
		Account newAcct = new Account(user);
		System.out.println("New account for User " + user.getFirstName() + " has been created.");
		return newAcct;
	}

	@Override
	public void removePaymentAccount(Account account) {
		// TODO Auto-generated method stub
		System.out.println("Account Info for User: " + account.getUser().getFirstName() + " " + account.getUser().getLastName() +
				" has been removed.");
	}

	@Override
	public boolean submitCreditCard(CreditCard card) {
		System.out.println("Validating the card info...");
		if(card.isValidated())
			System.out.println("Validatation passed");
		else
			System.out.println("Validatation failed. You have to remove the account info.");
		
		return card.isValidated();
	}

}
