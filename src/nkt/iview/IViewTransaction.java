package nkt.iview;

import java.util.List;

import nkt.entity.Custommer;
import nkt.entity.Room;
import nkt.entity.Transaction;

public interface IViewTransaction {
	public Transaction roomRent(List<Room> listRoom, Custommer custommer, Transaction transaction);

	public int roomPay(List<Room> listRoom);

	public void showRoomAvailable(List<Room> listRoom);

	public void showRoomUnAvailable(List<Room> listRoom);

	public int enterTransactionCode();

}
