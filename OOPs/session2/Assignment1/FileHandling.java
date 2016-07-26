package session2.assignment1;

import java.io.*;

public class FileHandling {
	
	/**
	 * @return questionsObject(Questions) contains all the info regarding the question
	 * @throws FileNotFoundException for Exception Handling
	 * @throws IOException for Exception Handling
	 */
	public Questions inputHandler() throws FileNotFoundException,IOException {
		Questions questionsObject = new Questions();
		BufferedReader buffer = null;

		try {
			buffer = new BufferedReader(new FileReader("C:\\Users\\Anshu\\workspace\\OOPs\\src\\session2\\assignment1\\Questions.txt"));
			String thisLine = "";
			String[] commaSeparatedValues;

			while ((thisLine = buffer.readLine()) != null) {
				commaSeparatedValues = thisLine.split("[,.]");
				questionsObject.getQuestionNumber().add(
						commaSeparatedValues[0].trim());
				questionsObject.getQuestion().add(
						commaSeparatedValues[1].trim());
				questionsObject.getQuestionType().add(
						commaSeparatedValues[2].trim());
				// condition is imposed because all questions is not necessary
				// to have options(e.g. text);
				if (commaSeparatedValues.length > 3) {
					questionsObject.getOptionsAvailable().add(
							commaSeparatedValues[3].trim());
				}
			}
		} catch (java.io.IOException exception) {
			exception.getMessage();
		} finally {
			buffer.close();
		}

		return questionsObject;
	}

	//This function handles the responses which are being stored in the file named as responses.txt
	protected void handleResponses(UserHandling[] userHandler) {
		if (userHandler == null) {
			return;
		} else {
			BufferedWriter writer = null;
			String output = "";
			int totalUsers = userHandler.length;
			for (int pos = 0; pos < totalUsers; pos++) {
				output += "Participant " + (pos + 1) + ","+ userHandler[pos].responses.get(0) + ","+ userHandler[pos].responses.get(1).toString() + ","+ userHandler[pos].responses.get(2).toString() + ".\n";
			}
			try {
				writer = new BufferedWriter(new FileWriter("C:\\Users\\Anshu\\workspace\\OOPs\\src\\session2\\assignment1\\responses.txt"));
				writer.write(output);

			} catch (IOException e) {
			} finally {
				try {
					if (writer != null)
						writer.close();
				} catch (IOException e) {
				}
			}
		}
	}
}
