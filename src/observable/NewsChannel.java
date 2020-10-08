package observable;

import java.util.Observable;
import java.util.Observer;

public class NewsChannel implements Observer {
	private String news;

	@Override
	public void update(Observable o, Object arg) {
		this.setNews(arg.toString());
	}

	public String getNews() {
		return news;
	}

	public void setNews(String news) {
		this.news = news;
	}

}
