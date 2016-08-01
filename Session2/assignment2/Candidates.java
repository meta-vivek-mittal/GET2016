package session2.assignment2;

public class Candidates {

	// object of queue class is created
	MyQueue<String> candidateList;

	// constructor of candidate class
	public Candidates() {
		candidateList = new MyQueue<String>(5);
	}

	/**
	 * Following function adds the candidate in the queue.
	 * @param name(String) denotes the name of the candidate.
	 */
	public void addCandidate(String name) {
		candidateList.enqueue(name);
	}

	/**
	 * Following function gets candidate from queue and returns the name of candidates.
	 * @return (String) returns the candidate.
	 */
	public String getCandidate() {
		String candi = (String) candidateList.dequeue();
		return candi;
	}
}