package tr.org.linux.kamp2016.word_press;

public class TextPost extends Post {
	String summary;

	public TextPost(String title, String body, String category, String slug, String summary) {
		super(title, body, category, slug);
		if (body.length() > 10)
			this.summary = body.substring(0, 11);
		else
			this.summary = body.substring(0);

	}

	public TextPost(String title, String body, String category, String slug) {
		super(title, body, category, slug);
	}

	public String getSummary() {
		return summary;
	}

	public void setSummary(String summary) {
		this.summary = summary;
	}

}
