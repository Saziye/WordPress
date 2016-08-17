package tr.org.linux.kamp2016.word_press;

public abstract class Post extends Page {
	private String slug;

	public Post(String title, String body, String category, String slug) {
		super(title, body, category);
		this.slug = slug;
	}

	public String getSlug() {
		return slug;
	}

	public void setSlug(String slug) {
		this.slug = slug;
	}

}
