package tr.org.linux.kamp2016.word_press;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Comment {

	private String name;
	private String comment;
	private LocalDate date = LocalDate.now();
	private static List<Comment> comments = new ArrayList<Comment>();

	public Comment(String name, String comment) {
		super();
		this.name = name;
		this.comment = comment;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public void addComment(Comment comment) {
		comments.add(comment);
	}

}
