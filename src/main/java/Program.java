import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String fullName = null;
		String formattedName = null;
		while (formattedName == null) {
			try {
				System.out.println("Enter full name");
				fullName = scanner.nextLine();
				String[] words = fullName.split("\\s+");
				if (words.length == 3) {
					for (int i = 0; i < words.length; i++) {
						if (i == 0) {
							words[i] = words[i].substring(0, 1).toUpperCase() + words[i].substring(1).toLowerCase();
						} else {
							words[i] = words[i].substring(0, 1);
							words[i] = words[i].toUpperCase();
						}
					}
					fullName = words[0] + " " + words[1] + "." + words[2] + ".";
					formattedName = fullName;
				}
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
		System.out.println(fullName);
		System.out.println("Press enter to continue...");
		scanner.nextLine();
	}
}