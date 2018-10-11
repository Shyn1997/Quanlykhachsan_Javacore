package nkt.imodel;

import java.util.List;

import nkt.entity.Room;

public interface IModelRoom {
	public boolean addRoom(List<Room> listRoom, Room room);

	public boolean editRoom(List<Room> listRoom, Room room);

	public boolean deleteRoom(List<Room> listRoom, int roomcode);

	public List<Room> showRoom(List<Room> listRoom);

}
