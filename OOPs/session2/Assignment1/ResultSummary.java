package session2.assignment1;

import java.util.ArrayList;
import java.util.List;

public class ResultSummary {
	protected void generateResults(UserHandling[] userHandlers,
			Questions questions) {
		int totalQuestions = questions.questionNumber.size();
		List<String> temp = new ArrayList<String>();
		for (int index = 0; index < totalQuestions; index++) {
			if (questions.questionType.get(index).toString()
					.equalsIgnoreCase("Single Select")) {
				temp.add(index + "");
			}
		}
		int[] arrayForSingleSelect = new int[temp.size()];
		for (int i = 0; i < temp.size(); i++) {
			arrayForSingleSelect[i] = Integer.parseInt(temp.get(i).toString());
		}

	}

	protected String[][] getPercentages(UserHandling[] userHandlers,
			String[] options) {
		String[][] output = new String[2][options.length];
		int totalUsers = userHandlers.length;

		for (int index = 0; index < options.length; index++) {
			output[0][index] = options[index];
		}

		for (int index = 0; index < totalUsers; index++) {
			output[1][index] = (userHandlers[index].responses.get(0));
		}

		return output;
	}
}