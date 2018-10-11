package nkt.model;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import nkt.entity.Room;
import nkt.imodel.IModelCustommer;
import nkt.imodel.IModelRoom;

public class ModelRoom implements IModelRoom {
	public boolean addRoom(List<Room> listRoom, Room room) {
		boolean flag = true;
		int size = listRoom.size();
		room.setRoomCost(room.getNumberOfDayRent() * room.getCost());
		listRoom.add(room);
		if (listRoom.size() > size) {
			flag = true;
		} else {
			flag = false;
		}
		return flag;
	}

	public boolean editRoom(List<Room> listRoom, Room room) {
		boolean flag = false;
		room.setRoomCost(room.getNumberOfDayRent() * room.getCost());
		if (listRoom != null) {
			for (int i = 0; i < listRoom.size(); i++) {
				if (listRoom.get(i).getRoomCode() == room.getRoomCode()) {
					listRoom.set(i, room);
					flag = true;
				}
			}
		}
		return flag;
	}

	public boolean deleteRoom(List<Room> listRoom, int roomcode) {
		boolean flag = false;
		int size = listRoom.size();
		if (listRoom != null) {
			for (int i = 0; i < listRoom.size(); i++) {
				if (listRoom.get(i).getRoomCode() == roomcode
						&& listRoom.get(i).getCheckRoom() == 0) {
					listRoom.remove(i);
					flag = true;
				}
			}
		}
		if (listRoom.size() < size) {
			flag = true;
		} else {
			flag = false;
		}
		return flag;
	}

	public List<Room> showRoom(List<Room> listRoom) {
		Collections.sort(listRoom, new Comparator<Room>() {

			@Override
			public int compare(Room r1, Room r2) {
				if (r1.getRoomCode() - r2.getRoomCost() > 0) {
					return 1;
				} else if (r1.getRoomCode() - r2.getRoomCode() < 0) {
					return -1;
				} else {
					return 0;
				}
			}

		});
		return listRoom;
	}

}
