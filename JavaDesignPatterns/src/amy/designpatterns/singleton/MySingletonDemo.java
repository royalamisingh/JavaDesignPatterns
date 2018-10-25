package amy.designpatterns.singleton;

public class MySingletonDemo {

	public static void main(String[] args) {
		MySingleton instance = MySingleton.getInstsance();
		
		System.out.println(instance);
		
		MySingleton instance2 = MySingleton.getInstsance();
		
		System.out.println(instance2);
		
		if(instance == instance2) {
			System.out.println("Instances are Equal");
		}

	}

}
