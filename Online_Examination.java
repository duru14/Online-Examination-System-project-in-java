import java.util.*;

public class Online_Examination {

	Scanner sc = new Scanner(System.in);
	HashMap<String, Integer> data = new HashMap<String, Integer>();

	public void login() {
		data.put("DURGA", 2003);
		data.put("DURGA", 1603);
		System.out.println("\n\n*WELCOME TO ONLINE EXAM SYSTEM*");
		String UserId;
		int password;
		System.out.println("CONTINUE TO LOGIN");
		System.out.print("Enter UserId : ");
		UserId = sc.next();
		System.out.print("Enter password : ");
		password = sc.nextInt();
		if (data.containsKey(UserId) && data.get(UserId) == password) {
			System.out.println("\nSUCCESSFULLY LOGIN");
			option_menu();
		} else {
			System.out.println(" OOPS INVALID LOGIN ");
			System.out.println("Try Again");
			login();
		}
	}

	public void option_menu() {
		int select;
		System.out.println("\nEnter the Option you want to Perform Operation");
		System.out.println("1.Update Profile and Password");
		System.out.println("2.Start  Exam");
		System.out.println("3.Logout");
		select = sc.nextInt();
		switch (select) {
			case 1:
				data = update();
				option_menu();
				break;
			case 2:
				exam_que();
				option_menu();
				break;
			case 3:
				System.exit(0);
				break;
			default:
				System.out.println("Wrong Entry");
		}
	}

	public HashMap<String, Integer> update() {
		String uUser;
		int upassword;
		System.out.println("Welcome to Update Profile");
		System.out.println("Enter Username");
		uUser = sc.next();
		if (data.containsKey(uUser)) {
			System.out.println("Enter new Password you to want to Update to your Profile");
			upassword = sc.nextInt();
			data.replace(uUser, upassword);
		} else {
			System.out.println("User Doesn't Exist");
		}
		return data;
	}

	public void exam_que() {
		long examtime = System.currentTimeMillis();
		long endtime = examtime + 30;
		int ans_count = 0;
		int ans, score;
		System.out.println("Start Your Exam");

		// Question starts
		while (System.currentTimeMillis() < endtime) {
			System.out.println("You have 30 seconds to answer 5 questions");
			System.out.println("Each Question carries 10 marks" + " " + "-5 for wrong answer");
			System.out.println("\n\nQ.1) Who is the first prime minister of india ?");
			System.out.println("\n(1) Manmohan Singh" + "\t" + "(2) Jawaharlal Nehru" + "\t" + "(3) Narendra Modi"
					+ "\t" + "(4) Lal Bahadur Shastri");
			System.out.println("Enter Correct Option");
			ans = sc.nextInt();
			System.out.println("Answer Locked...");
			if (ans == 2) {
				ans_count++;
			}
			System.out.println("\n\nQ.2)______ is the hottest planet in our solar system?");
			System.out.println("1)Jupiter" + "\t" + "2)Venus" + "\t" + "3) Neptune" + "\t" + "4)Moon");
			System.out.println("Enter correct option");
			ans = sc.nextInt();
			System.out.println("Answer Locked...");
			if (ans == 2) {
				ans_count++;
			}
			System.out.println("\n\nQ.3)Which among the following key is used for checking grammar and spelling?");
			System.out.println("1) F7" + "\t" + "(2) F3" + "\t" + "3)F2" + "\t" + "4)F9");
			System.out.println("Enter correct option");
			ans = sc.nextInt();
			System.out.println("Answer Locked...");
			if (ans == 1) {
				ans_count++;
			}
			System.out.println("\n\nQ.4)Who established the Satya Shodhak Samaj (1873) in Maharashtra?");
			System.out.println("1) Sri Narayan Guru" + "\t" + "2) Mukund Rao Patil" + "\t" + "3) Dr. B.R.Ambedkar"
					+ "\t" + "4)Jyotirao Phule");
			System.out.println("Enter correct option");
			ans = sc.nextInt();
			System.out.println("Answer Locked...");
			if (ans == 4) {
				ans_count++;
			}
			System.out.println("\n\nQ.5)Which day is celebrated as World Water Day?");
			System.out
					.println("1)22 March" + "\t" + "2) 10 December" + "\t" + "3) 13 November" + "\t" + "4) 27 January");
			System.out.println("Enter correct option");
			ans = sc.nextInt();
			System.out.println("Answer Locked...");
			if (ans == 1) {
				ans_count++;
			}
			break;
		}
		System.out.println("You have finished the exam");
		score = ans_count * 10 - ((5 - ans_count) * 5);
		System.out.println("Your score is..." + " " + score + "/50");
	}

	public static void main(String[] args) {
		Online_Examination log = new Online_Examination();
		log.login();
	}
}
