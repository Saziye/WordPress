package tr.org.linux.kamp2016.word_press;

import java.util.Scanner;

public class Menu {
	public static void PrintMenu() {
		StringBuilder menu = new StringBuilder(50);

		menu.append("******MENU******");
		menu.append("\n");
		menu.append("1- Add Page");
		menu.append("2- Add Post");
		menu.append("3- Add Comment");
		menu.append("4- Show Pages");
		menu.append("5- Show Posts");

		Scanner input = new Scanner(System.in);

		System.out.println("Choose menu:");

		int inputValue = input.nextInt();

	}

	public static void PrintAddPage() {
		Scanner input = new Scanner(System.in);
		System.out.println("****ADD PAGE****");
		System.out.println("Title: ");
		String title = input.nextLine();
		System.out.println("Body: ");
		String body = input.nextLine();
		System.out.println("Category: ");
		String category = input.nextLine();
		Page page = new Page(title, body, category);
		WordPressHelper.addPages(page);
		PrintMenu();

	}

	public static void PrintAddPost() {
		Scanner input = new Scanner(System.in);
		System.out.println("****ADD POST****");
		System.out.println("Title: ");
		String title = input.nextLine();
		System.out.println("Body: ");
		String body = input.nextLine();
		System.out.println("Category: ");
		String category = input.nextLine();
		System.out.println("Slug: ");
		String slug = input.nextLine();
		System.out.println("Post: ");
		String post = input.nextLine();
		Post p = new VideoPost(title, body, category, slug);
		// Post p = new TextPost(title, body, category, slug);
		if (p instanceof VideoPost) {
			System.out.println("Url: ");
			String url = input.nextLine();
			VideoPost videopost = new VideoPost(title, body, category, slug, url);// !!
			WordPressHelper.addVideoPosts(videopost);

		} else if (p instanceof TextPost) { // !!!
			System.out.println("Summary: ");
			String summary = input.nextLine();
			TextPost textpost = new TextPost(title, body, category, slug, summary);// !!
			WordPressHelper.addTextPosts(textpost);
		}
		PrintMenu();
	}

	public static void PrintAddComment() {
		ShowPost();
		Scanner input = new Scanner(System.in);
		System.out.println("Select a post to comment");
		int select = input.nextInt();
		System.out.println("Name:");
		String name = input.nextLine();
		System.out.println("Comment:");
		String comment = input.nextLine();
		PrintMenu();
	}

	public static void ShowPage() {
		System.out.println("***SHOW PAGE***");

	}

	public static void ShowPost() {
		System.out.println("***SHOW POST***");

	}

}
