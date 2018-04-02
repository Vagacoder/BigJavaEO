package BigJavaCh03;

public class PersonTester {

	public static void main(String[] args) {

		Person Qirui = new Person("Qirui");
		Person Jiawei = new Person("Jiawei");
		Person Jack = new Person("Jack");
		Person Mary = new Person("Mary");
		Person Terry = new Person("Terry");

		Qirui.beFriend(Jiawei);
		System.out.println(Qirui.getFriendNumber());
		Qirui.beFriend(Jack);
		Qirui.beFriend(Mary);
		System.out.println(Qirui.getFriendNames());
		System.out.println(Qirui.getFriendNumber());
		Qirui.unFriend(Jack);
		Qirui.beFriend(Terry);
		System.out.println(Qirui.getFriendNames());
		System.out.println(Qirui.getFriendNumber());
	}

}
