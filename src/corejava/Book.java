package corejava;

public class Book {
	Integer bid;
	String bname;
	Integer bcost;
	
	public Book(Integer bid, String bname, Integer bcost) {
		super();
		this.bid = bid;
		this.bname = bname;
		this.bcost = bcost;
		
	}

	@Override
	public String toString() {
		return "Book [bid=" + bid + ", bname=" + bname + ", bcost=" + bcost + "]";
	}

}
