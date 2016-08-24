package session1;

public class TitlesPOJO {

	private String title_Name,title_Id;
	
	/**
	 * @return the title ID
	 */
	public String getTitleId() {
		return title_Id;
	}

	/**
	 * @param title_Id is the title ID of that book title
	 */
	public void setTitleId(String title_Id) {
		this.title_Id = title_Id;
	}

	/**
	 * @return title name of that book
	 */
	public String getTitleName() {
		return title_Name;
	}

	/**
	 * @param title_Name is name of that book
	 */
	public void setTitleName(String title_Name) {
		this.title_Name = title_Name;
	}
}