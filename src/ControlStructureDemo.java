
public class ControlStructureDemo {

	public static void main(String[] args) {

		System.out.println("If else example");
		int x = 3, y = 3;
		if (x < y) {
			System.out.println("x is less than y");
		} else if (x == y) {
			System.out.println("x is equal to y");
		} else {
			System.out.println("x is greater than y");
		}
		System.out.println("-------------------------");

		String time = "morning";
		switch (time) {
		case "morning": {
			System.out.println("Good morning");
			break;
		}
		case "afternoon": {
			System.out.println("Good afternoon");
			break;
		}
		case "evening": {
			System.out.println("Good evening");
			break;
		}
		default: {
			System.out.println("Have a nice day");
		}
		}// switch

		System.out.println("-----------------------------");
		System.out.println("for loop example:");
		for (int i = 0; i < 5; i++) {
			if (i == 3) {
				continue;
			}
			System.out.println("Hello " + i);
		}
		System.out.println("enhanced for loop example:");
		int[] nums = { 10, 20, 30, 40, 50, 60, 70 };
//		for(int i = 0; i<nums.length; i++) {
//			System.out.println("nums of i: " + i + " " + nums[i]);
//		}
		for (int i : nums) {
			System.out.println(i);
		}

		System.out.println("-----------------------------");
		System.out.println("while loop example:");

		int j = 0;
		while (j < 5) {
			System.out.println(j);
			j++;
		} // while

		System.out.println("-----------------------------");
		System.out.println("do-while loop example:");

		j = 5;
		do { //do-while will run the loop AT LEAST ONCE
			System.out.println(j);
			j++;
		} while (j < 5);// do-while

	}// main
}// class
