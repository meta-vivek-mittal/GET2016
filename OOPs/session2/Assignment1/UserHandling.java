package session2.assignment1;

import java.util.ArrayList;
import java.util.List;

public class UserHandling {

	List<String> responses;

	public UserHandling() {
		this.responses = new ArrayList<String>();
	}

	public List<String> getResponses() {
		return responses;
	}

	public void setResponses(List<String> responses) {
		this.responses = responses;
	}

}