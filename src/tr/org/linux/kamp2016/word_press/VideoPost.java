package tr.org.linux.kamp2016.word_press;

public class VideoPost extends Post {
	String url;

	public VideoPost(String title, String body, String category, String slug, String url) {
		super(title, body, category, slug);
		this.url = url;
	}

	public VideoPost(String title, String body, String category, String slug) {
		super(title, body, category, slug);
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

}
