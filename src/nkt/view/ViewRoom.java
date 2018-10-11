package nkt.view;

import java.util.List;

import nkt.entity.Room;
import nkt.iview.IViewMenu;
import nkt.iview.IViewRoom;

public class ViewRoom implements IViewRoom{
	InputData input = new InputData();

	public Room addRoom(Room room) {
		System.out.print("Ma phong: ");
		room.setRoomCode(input.inputInt());
		System.out.print("Loai phong: ");
		room.setKindOfRoom(input.inputString());
		System.out.print("So nguoi : ");
		room.setNumberOfPeople(input.inputInt());
		System.out.print("So ngay thue : ");
		room.setNumberOfDayRent(input.inputInt());
		System.out.print("Gia phong: ");
		room.setCost(input.inputInt());
		room.setCheckRoom(0);
		return room;
	}

	public Room editRoom(List<Room> listRoom) {
		int Temp = 0;
		int codeRoom;
		Room room;
		do {
			room = new Room();
			System.out.print("\nNhap ma phong muon sua :");
			codeRoom = input.inputInt();
			for (Room room1 : listRoom) {
				if (room1.getRoomCode() == codeRoom) {
					System.out.print("\n------Thong tin cu:------\n");
					this.showRoom(room1);
					Temp = 1;
				}
			}
			if (Temp == 1) {
				System.out.print("\nBat dau sua thong tin phong :");
				room.setRoomCode(codeRoom);
				System.out.print("\nLoai phong: ");
				room.setKindOfRoom(input.inputString());
				System.out.print("So nguoi : ");
				room.setNumberOfPeople(input.inputInt());
				System.out.print("So ngay thue : ");
				room.setNumberOfDayRent(input.inputInt());
				System.out.print("Gia phong: ");
				room.setCost(input.inputInt());
				System.out
						.print("Trang thai: (Phong trong --->0; Phong da thue ---->1)");
				room.setCheckRoom(input.inputInt());
			} else {
				System.out
						.print("Khong tim thay phong vua nhap, moi nhap lai ma phong!!!");
			}
		} while (Temp == 0);
		return room;
	}

	public int deleteRoom() {
		int codeRoom;
		System.out.print("\nNhap ma phong muon xoa: ");
		codeRoom = input.inputInt();
		return codeRoom;
	}

	public void showRoom(Room room) {
		System.out.print("\n==========================");
		System.out.print("\nMa phong: " + room.getRoomCode());
		System.out.print("\nLoai phong: " + room.getKindOfRoom());
		System.out.print("\nGia phong: " + room.getCost());
		System.out.print("\nNgay thue: " + room.getNumberOfDayRent());
		System.out.print("\nSo nguoi: " + room.getNumberOfPeople());
		System.out.print("\nThanh toan: " + room.getRoomCost());
		System.out.print("\nTrang thai: ");
		if (room.getCheckRoom() == 0) {
			System.out.print("Phong con trong.");
		} else {
			System.out.print("Phong da cho thue.");
		}
		System.out.print("==========================\n");
	}

	public void showAllRoom(List<Room> listRoom) {
		for (Room room : listRoom) {
			this.showRoom(room);
		}
	}
}
