package interfaceuse;

public class Main {

	public static void main(String[] args) {
		//ISampleImpl 클래스에 있는 disp 라는 메소드를 호출
		//ISampleImpl sample = new ISampleImpl();
		
		//변수를 만들 때 인터페이스 이름을 사용 가능
		//대입되는 인스턴스는 반드시 인터페이스를 implements 한 클래스의 인스턴스 이어야 합니다.
		ISample sample = new ISampleImpl();
		sample.disp();
		
		//관습적으로 변수를 만들 때는 구현된 클래스가 아닌 인터페이스 이름을 사용합니다.
		UserService userService = new UserServiceImpl();
		userService.disp();

	}
}
