package nkt.view;

import java.util.List;

import nkt.entity.Transaction;
import nkt.entity.Custommer;
import nkt.entity.Room;
import nkt.iview.IViewMenu;
import nkt.iview.IViewTransaction;

public class ViewTransaction implements IViewTransaction {
	InputData input = new InputData();
	ViewRoom viewRoom = new ViewRoom();
	ViewCustommer viewCustommer = new ViewCustommer();

	public Transaction roomRent(List<Room> listRoom, Custommer custommer, Transaction transaction) {
		int roomCode;
		int temp = 0;
		int transactionCode;
		do {
			System.out.print("\nNhap ma phong cho thue: ");
			roomCode = input.inputInt();
			for (int i = 0; i< listRoom.size(); i++) {
				if (listRoom.get(i).getRoomCode() == roomCode && listRoom.get(i).getCheckRoom() == 0) {
					System.out.print("\nNhap thong tin khach thue: \n");
					viewCustommer.addCustommer(custommer);
					transactionCode = this.enterTransactionCode();
					transaction.setTransactionCode(transactionCode);
					transaction.setRoom(listRoom.get(i));
					transaction.setCustommer(custommer);
					temp = 1;
				}
			}
			if (temp == 0) {
				System.out.print("\nPhong da duoc thue hoac khong ton tai, moi nhap lai: ");
			}
		} while (temp == 0);
		return transaction;
	}
	public int roomPay(List<Room> listRoom) {
		int roomCode;
		int temp = 0;
		do {
			System.out.print("\nNhap ma phong muon tra: ");
			roomCode = input.inputInt();
			for (Room room : listRoom) {
				if (room.getRoomCode() == roomCode && room.getCheckRoom() != 0) {
					System.out.print("\nTien thue phong = : "+(room.getCost()*room.getNumberOfDayRent()));
					temp = 1;
					return roomCode;
				}
			}
			if (temp == 0) {
				System.out.print("\nBan da nhap sai ma phong, moi nhap lai: ");
			}
		} while (temp == 0);
		return roomCode;
	}

	public void showRoomAvailable(List<Room> listRoom) {
		for (Room room : listRoom) {
			if (room.getCheckRoom() == 0) {
				System.out.print(room.getRoomCode() + "("
						+ room.getKindOfRoom() + ")\t");
			}
		}
	}

	public void showRoomUnAvailable(List<Room> listRoom) {
		for (Room room : listRoom) {
			if (room.getCheckRoom() != 0) {
				viewRoom.showRoom(room);
				System.out.print("\nThong tin khach thue phong:\n");
				viewCustommer.showCustommer(room.getCustommer());
			}
		}
	}
	public int enterTransactionCode(){
		int transactionCode;
		System.out.print("\nNhap ma giao dich:");
		transactionCode = input.inputInt();
		return transactionCode;
	}

}
