package observable_custom;

public class Main {

	public static void main(String[] args) {

		NewsAgency observable = new NewsAgency();
		NewsChannel observer = new NewsChannel();
		NewsChannel observer2 = new NewsChannel();

		observable.addObserver(observer);
		observable.addObserver(observer2);
		observable.setNews("new updates");

		System.out.println(observer.getNews());
		System.out.println(observer2.getNews());
	}
}
