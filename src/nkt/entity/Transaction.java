package nkt.entity;

public class Transaction {
	private int transactionCode;
	private Custommer custommer;
	private Room room;
	public Custommer getCustommer() {
		return custommer;
	}
	public void setCustommer(Custommer custommer) {
		this.custommer = custommer;
	}
	public Room getRoom() {
		return room;
	}
	public void setRoom(Room room) {
		this.room = room;
	}
	public int getTransactionCode() {
		return transactionCode;
	}
	public void setTransactionCode(int transactionCode) {
		this.transactionCode = transactionCode;
	}
	

}
