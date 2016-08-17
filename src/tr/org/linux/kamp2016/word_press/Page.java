package tr.org.linux.kamp2016.word_press;

import java.time.LocalDate;
import java.util.Set;

public class Page {

	private String title;
	private String body;
	private String category;
	private Set<Comment> comments;
	private LocalDate date = LocalDate.now();

	public Page(String title, String body, String category) {
		super();
		this.title = title;
		this.body = body;
		this.category = category;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public Set<Comment> getComments() {
		return comments;
	}

	public void setComments(Set<Comment> comments) {
		this.comments = comments;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "Page [title=" + title + ", body=" + body + ", category=" + category + ", date=" + date + "]";
	}

}
