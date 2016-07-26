package session2.assignment1;

import java.util.Scanner;

public class Display {

	Questions questions;

	public Display(Questions questions) {
		this.questions = questions;
		System.out
				.println("---------------------SURVEY-----------------------");
	}

	protected UserHandling generateUI(UserHandling user) {
		int questionNumberSize = this.questions.question.size();
		int optionsSize = this.questions.optionsAvailable.size();
		for (int index = 0; index < questionNumberSize; index++) {
			String outputString = this.questions.questionNumber.get(index)
					+ "  ---  " + this.questions.question.get(index)
					+ "  ---  " + this.questions.questionType.get(index)
					+ "  ---  ";
			if (index < optionsSize) {
				outputString += this.questions.optionsAvailable.get(index);
			}
			System.out.println(outputString);
			System.out.println("Enter your response");
			user.responses.add(takeInput(index, outputString));

		}
		return user;

	}

	// This function takes input from the user and also check for validation of
	// response
	protected String takeInput(int index, String output) {
		String response = null;
		Validation validation = new Validation();
		Scanner scanner = new Scanner(System.in);
		response = scanner.nextLine();
		String options = "";
		if (questions.questionType.get(index).toString()
				.equalsIgnoreCase("text")) {
			options = "";
		} else {

			options = questions.optionsAvailable.get(index).toString();
		}
		if (!validation.isInputValid(response, options)) {
			System.out.println("Please enter valid response");
			System.out.println(output);
			// scanner.close();
			return takeInput(index, output);
		}
		// scanner.close();
		return response;
	}

	// This function generates the result in the form of percentage.
	protected void generateResult(UserHandling[] userHandlers,
			int[] indicesOfSingleSelect, Questions questions) {
		if (userHandlers == null || indicesOfSingleSelect == null
				|| questions == null) {
			return;
		} else {
			int size = indicesOfSingleSelect.length;
			String output = "";
			for (int index = 0; index < size; index++) {
				output = questions.question.get(index).toString()
						+ ", Single Select,"
						+ questions.optionsAvailable.get(index);
				int[] countResponses = new int[questions.singleSelect.singleSelectOptions.length];
				countResponses[Integer.parseInt(userHandlers[index].responses
						.get(0).toString())] += 1;
				int[] percentages = new int[size];
				int total = 0;
				for (int i = 0; i < size; i++) {
					total += countResponses[i];
				}
				System.out.println("total is:" + total);
				for (int i = 0; i < size; i++) {
					percentages[i] = (countResponses[i] / total) * 100;
					output += (i + 1) + "-" + percentages[i] + "%";
				}

				System.out.println(output);
			}
		}
	}
}