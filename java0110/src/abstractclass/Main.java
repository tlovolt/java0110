package abstractclass;

public class Main {

	public static void main(String[] args) {
		Starcraft star = new Terran();
		star.attack();
		
		star = new Zerg();
		star.attack();
		
		star = new Protoss();
		star.attack();
		
		//Starcraft 가 추상 클래스가 아니라면 인스턴스 생성 가능
		//Starcraft 는 상속관계를 만들기 위해서 생성한 클래스
		//이 클래스는 작업을 할 클래스는 아님
		star = new Starcraft();

	}

}





