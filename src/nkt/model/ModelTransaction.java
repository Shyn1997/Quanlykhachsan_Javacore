package nkt.model;

import java.util.List;

import nkt.entity.Custommer;
import nkt.entity.Room;
import nkt.entity.Transaction;
import nkt.imodel.IModelCustommer;
import nkt.imodel.IModelTransaction;

public class ModelTransaction implements IModelTransaction {
	public boolean roomRent(List<Transaction> listTransaction,
			List<Room> listRoom, List<Custommer> listCustommer,
			Transaction transaction) {
		boolean flag = false;
		for (int i = 0; i < listRoom.size(); i++) {
			if (listRoom.get(i).getRoomCode() == transaction.getRoom()
					.getRoomCode()) {
				listRoom.get(i).setCustommer(transaction.getCustommer());
				listRoom.get(i).setCheckRoom(1);
				listTransaction.add(transaction);
				listCustommer.add(transaction.getCustommer());
				flag = true;
			}
		}
		return flag;
	}

	public boolean roomPay(List<Room> listRoom, int roomCode) {
		boolean flag = false;
		for (int i = 0; i < listRoom.size(); i++) {
			if (listRoom.get(i).getRoomCode() == roomCode) {
				listRoom.get(i).setCheckRoom(0);
				listRoom.get(i).setCustommer(null);
				flag = true;
			}
		}
		return flag;
	}

}
