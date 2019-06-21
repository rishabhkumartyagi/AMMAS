package amrita;

public class suggestion {
	
	private String suggest;
	private int srno;


	private int key;
	

	public suggestion(String suggest, int srno, int key) {
		super();
		this.suggest = suggest;
		this.srno = srno;
		this.key = key;
	}
	
	
	public String getSuggest() {
		return suggest;
	}


	public void setSuggest(String suggest) {
		this.suggest = suggest;
	}


	public int getSrno() {
		return srno;
	}


	public void setSrno(int srno) {
		this.srno = srno;
	}


	public int getKey() {
		return key;
	}


	public void setKey(int key) {
		this.key = key;
	}

	

}
