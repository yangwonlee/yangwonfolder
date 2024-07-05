package practice02;

public class ControllerExample {

	public static void main(String[] args) {
//		Controller controller = new Controller();
//		controller.setService(new MemberService());

		Controller Controller = new Controller();
		Controller.setService(new MemberService());
		Controller.service.login();

		Controller.setService(new AService());
		Controller.service.login();

		
		
		
	}

}
