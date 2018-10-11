package nkt.entity;

public class Room {
     private String kindOfRoom;
	 private int cost;
     private int roomCost;
	 private int numberOfDayRent;
	 private int numberOfPeople;
	 private int checkRoom;
	 private int roomCode;
	 private Custommer custommer;
	public String getKindOfRoom() {
		return kindOfRoom;
	}
	public void setKindOfRoom(String kindOfRoom) {
		this.kindOfRoom = kindOfRoom;
	}
	public int getNumberOfDayRent() {
		return numberOfDayRent;
	}
	public void setNumberOfDayRent(int numberOfDayRent) {
		this.numberOfDayRent = numberOfDayRent;
	}
	public int getNumberOfPeople() {
		return numberOfPeople;
	}
	public void setNumberOfPeople(int numberOfPeople) {
		this.numberOfPeople = numberOfPeople;
	}
	public int getCheckRoom() {
		return checkRoom;
	}
	public void setCheckRoom(int checkRoom) {
		this.checkRoom = checkRoom;
	}
	public int getRoomCode() {
		return roomCode;
	}
	public void setRoomCode(int roomCode) {
		this.roomCode = roomCode;
	}
	public Custommer getCustommer() {
		return custommer;
	}
	public void setCustommer(Custommer custommer) {
		this.custommer = custommer;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	public int getRoomCost() {
		return roomCost;
	}
	public void setRoomCost(int roomCost) {
		this.roomCost = roomCost;
	}
	
	 
}
