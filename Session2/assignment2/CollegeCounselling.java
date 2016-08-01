package session2.assignment2;

public class CollegeCounselling {

	public static void main(String[] args) {
		Candidates candidate = new Candidates();
		Counselling counselling = new Counselling();

		counselling.addCollege("BIT");
		candidate.addCandidate("Vivek");
		String str = candidate.getCandidate();
		counselling.displayAvalableCollege();
		counselling.assignCollege(str, 1);
		counselling.displayCollegeAssigned();
	}
}