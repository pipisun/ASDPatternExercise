package command.second;

public class DBFacadeImp implements DBFacadeInterface {

	@Override
	public void save(User user) {
		// TODO Auto-generated method stub
		System.out.println("User:" + user.getFirstName() + " " + user.getLastName() +" info has been saved.");
	}

	@Override
	public void remove(User user) {
		// TODO Auto-generated method stub
//		System.out.println("User:" + user.getFirstName() + " " + user.getLastName() +" info has been removed.");
	}

}
