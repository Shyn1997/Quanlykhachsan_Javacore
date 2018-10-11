package nkt.iview;

import java.util.List;

import nkt.entity.Room;

public interface IViewRoom {
	public Room addRoom(Room room);

	public Room editRoom(List<Room> listRoom);

	public int deleteRoom();

	public void showRoom(Room room);

	public void showAllRoom(List<Room> listRoom);

}
