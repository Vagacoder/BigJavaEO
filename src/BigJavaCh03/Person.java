package BigJavaCh03;

public class Person {

	private String name;
	private String friend;
	private int friendNumber;

	public Person(String name) {

		this.name = name;
		this.friend = " ";
		this.friendNumber = 0;

	}

	public void beFriend(Person p) {

		friend = friend + " " + p.name;
		friendNumber = friendNumber + 1;

	}

	public void unFriend(Person p) {

		String name = p.name;
		friend = friend.replace(" " + name, "");
		friendNumber = friendNumber - 1;

	}

	public String getFriendNames() {

		return friend.trim();
	}

	public int getFriendNumber() {

		return friendNumber;
	}
}
