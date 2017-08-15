package command.second;

public class CreateUserCommand implements Command {
	private DBFacadeInterface dbfif = new DBFacadeImp();
	private User user;
	
	CreateUserCommand(User user) {
		this.user = user;
	}
	
	@Override
	public boolean execute() {
		// TODO Auto-generated method stub
		dbfif.save(user);
		
		return true;
	}

	@Override
	public void undo() {
		// TODO Auto-generated method stub
	}

}
