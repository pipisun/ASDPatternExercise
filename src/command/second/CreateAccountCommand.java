package command.second;

public class CreateAccountCommand implements Command {
	private BillPayFacadeInterface bpfi = new BillPayFacadeImp();
	private Account account;
	private User user;
	
	CreateAccountCommand(User user) {
		this.user = user;
	}
	
	@Override
	public boolean execute() {
		// TODO Auto-generated method stub
		account = bpfi.createPaymentAccount(user);
		
		return true;
	}

	@Override
	public void undo() {
		// TODO Auto-generated method stub
		bpfi.removePaymentAccount(account);
	}

	public Account getAccount() {
		return account;
	}

}
