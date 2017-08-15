package command.second;

public class SubmitCreditCardInfoCommand implements Command {
	private BillPayFacadeInterface bpfif = new BillPayFacadeImp();
	private CreditCard card;
	private Account account;
	
	SubmitCreditCardInfoCommand(Account account, CreditCard card) {
		this.account = account;
		this.card = card;
		
	}
	
	@Override
	public boolean execute() {
		// TODO Auto-generated method stub
		return bpfif.submitCreditCard(card);
	}

	@Override
	public void undo() {
		// TODO Auto-generated method stub
		bpfif.removePaymentAccount(account);
	}

}
