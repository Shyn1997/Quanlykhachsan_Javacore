package nkt.imodel;

import java.util.List;

import nkt.entity.Custommer;
import nkt.entity.Room;
import nkt.entity.Transaction;

public interface IModelTransaction {
	public boolean roomRent(List<Transaction> listTransaction, List<Room> listRoom, List<Custommer> listCustommer,Transaction transaction);

	public boolean roomPay(List<Room> listRoom, int roomCode);

}
