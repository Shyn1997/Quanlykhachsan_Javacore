package controller;

import java.util.ArrayList;
import java.util.List;

import nkt.common.ICommon;
import nkt.entity.Custommer;
import nkt.entity.Room;
import nkt.entity.Transaction;
import nkt.model.ModelCustommer;
import nkt.model.ModelRoom;
import nkt.model.ModelTransaction;
import nkt.view.InputData;
import nkt.view.Menu;
import nkt.view.ViewCustommer;
import nkt.view.ViewRoom;
import nkt.view.ViewTransaction;

public class Program {
	public static void main(String[] args) {
		List<Room> listRoom = new ArrayList<Room>();
		List<Custommer> listCustommer = new ArrayList<Custommer>();
		List<Transaction> listTransaction = new ArrayList<Transaction>();
		Room room;
		Custommer custommer;
		Transaction transaction;
		Menu menu = new Menu();
		ViewRoom viewRoom = new ViewRoom();
		ViewCustommer viewCustommer = new ViewCustommer();
		ViewTransaction viewTransaction = new ViewTransaction();
		ModelRoom modelRoom = new ModelRoom();
		ModelCustommer modelCUstommer = new ModelCustommer();
		ModelTransaction modelTransaction = new ModelTransaction();
		InputData input = new InputData();
		String checkOut;
		int sc, scR, scC, scT;
		boolean flag = true;
		boolean flagC = true;
		boolean flagR = true;
		boolean flagT = true;
		boolean flagTemp;
		do {
			menu.menu();
			menu.message("Ban chon: ");
			sc = input.inputInt();
			switch (sc) {
			case ICommon.MENU_1: {
				do {
					menu.menuRoom();
					menu.message("Ban chon: ");
					scR = input.inputInt();
					switch (scR) {
					case ICommon.MENU_ROOM_ADD: {
						do {
							room = new Room();
							room = viewRoom.addRoom(room);
							flagTemp = modelRoom.addRoom(listRoom, room);
							if (flagTemp) {
								menu.message("Them thanh cong!!!");
							} else {
								menu.message("Xay ra loi, khong the them phong!!!");
							}
							menu.message("Ban muon tiep tuc chon y/n: ");
							checkOut = input.inputString();
						} while (checkOut.equalsIgnoreCase("y"));
						flagR = true;
						break;
					}
					case ICommon.MENU_ROOM_EDIT: {
						do {
							room = new Room();
							room = viewRoom.editRoom(listRoom);
							flagTemp = modelRoom.editRoom(listRoom, room);
							if (flagTemp) {
								menu.message("Sua thanh cong!!!");
							} else {
								menu.message("Xay ra loi, khong the sua thong tin phong!!!");
							}
							menu.message("Ban muon tiep tuc chon y/n: ");
							checkOut = input.inputString();
						} while (checkOut.equalsIgnoreCase("y"));
						flagR = true;
						break;
					}
					case ICommon.MENU_ROOM_DELETE: {
						do {
							int roomCode;
							roomCode = viewRoom.deleteRoom();
							flagTemp = modelRoom.deleteRoom(listRoom, roomCode);
							if (flagTemp) {
								menu.message("Xoa thanh cong!!!");
							} else {
								menu.message("Xay ra loi, khong the xoa phong!!!");
							}
							menu.message("Ban muon tiep tuc chon y/n: ");
							checkOut = input.inputString();
						} while (checkOut.equalsIgnoreCase("y"));
						flagR = true;
						break;
					}
					case ICommon.MENU_ROOM_SHOW: {
						listRoom = modelRoom.showRoom(listRoom);
						viewRoom.showAllRoom(listRoom);
						flagR = true;
						break;
					}
					case ICommon.MENU_ROOM_BACK: {
						flagR = false;
						break;
					}
					}
				} while (flagR);
				flag = true;
				break;
			}
			case ICommon.MENU_2: {
				do {
					menu.menuCustommer();
					menu.message("Ban chon: ");
					scC = input.inputInt();
					switch (scC) {
					case ICommon.MENU_CUSTOMMER_ADD: {
						do {
							custommer = new Custommer();
							custommer = viewCustommer.addCustommer(custommer);
							flagTemp = modelCUstommer.addCustommer(
									listCustommer, custommer);
							if (flagTemp) {
								menu.message("Them thanh cong!!!");
							} else {
								menu.message("Xay ra loi, khong the them phong!!!");
							}
							menu.message("Ban muon tiep tuc chon y/n: ");
							checkOut = input.inputString();
						} while (checkOut.equalsIgnoreCase("y"));
						flagC = true;
						break;
					}
					case ICommon.MENU_CUSTOMMER_EDIT: {
						do {
							custommer = new Custommer();
							custommer = viewCustommer
									.editCustommer(listCustommer);
							flagTemp = modelCUstommer.editCustommer(
									listCustommer, custommer);
							if (flagTemp) {
								menu.message("Sua thanh cong!!!");
							} else {
								menu.message("Xay ra loi, khong the sua thong tin khach!!!");
							}
							menu.message("Ban muon tiep tuc chon y/n: ");
							checkOut = input.inputString();
						} while (checkOut.equalsIgnoreCase("y"));
						flagC = true;
						break;
					}
					case ICommon.MENU_CUSTOMMER_DELETE: {
						do {
							int cMND;
							cMND = viewCustommer.deleteCustommer();
							flagTemp = modelCUstommer.deleteCustommer(
									listCustommer, cMND);
							if (flagTemp) {
								menu.message("Xoa thanh cong");
							} else {
								menu.message("Ban nhap sai ma phong, hoac phong dang duoc cho thue!!!");
							}
							menu.message("Ban muon tiep tuc chon y/n: ");
							checkOut = input.inputString();
						} while (checkOut.equalsIgnoreCase("y"));
						flagC = true;
						break;
					}
					case ICommon.MENU_CUSTOMMER_SHOW: {
						listCustommer = modelCUstommer
								.showCustommer(listCustommer);
						viewCustommer.showAllCustommer(listCustommer);
						flagC = true;
						break;
					}
					case ICommon.MENU_CUSTOMMER_BACK: {
						flagC = false;
						break;
					}
					}
				} while (flagC);
				flag = true;
				break;
			}
			case ICommon.MENU_3: {
				do {
					menu.menuTransaction();
					menu.message("Ban chon: ");
					scT = input.inputInt();
					switch (scT) {
					case ICommon.MENU_TRANSACTION_SHOWROOMAVAILABLE: {
						viewTransaction.showRoomAvailable(listRoom);
						flagT = true;
						break;
					}
					case ICommon.MENU_TRANSACTION_RENTROOM: {
						do {
							custommer = new Custommer();
							transaction = new Transaction();
							transaction = viewTransaction.roomRent(listRoom,
									custommer, transaction);
							flagTemp = modelTransaction.roomRent(
									listTransaction, listRoom, listCustommer,
									transaction);
							if (flagTemp) {
								menu.message("Giao dich thanh cong!!!");
							} else {
								menu.message("Giao dich that bai!!!");
							}
							menu.message("Ban muon tiep tuc chon y/n: ");
							checkOut = input.inputString();
						} while (checkOut.equalsIgnoreCase("y"));
						flagT = true;
						break;
					}
					case ICommon.MENU_TRANSACTION_SHOWROOMUNAVAILABLE: {
						do {
							viewTransaction.showRoomUnAvailable(listRoom);
							menu.message("Ban muon tiep tuc chon y/n: ");
							checkOut = input.inputString();
						} while (checkOut.equalsIgnoreCase("y"));
						flagT = true;
						break;
					}
					case ICommon.MENU_TRANSACTION_PAYROOM: {
						do {
							int roomCode;
							roomCode = viewTransaction.roomPay(listRoom);
							flagTemp = modelTransaction.roomPay(listRoom,
									roomCode);
							if (flagTemp) {
								menu.message("Giao dich thanh cong!!!");
							} else {
								menu.message("Giao dich that bai!!!");
							}
							menu.message("Ban muon tiep tuc chon y/n: ");
							checkOut = input.inputString();
						} while (checkOut.equalsIgnoreCase("y"));
						flagT = true;
						break;
					}
					case ICommon.MENU_TRANSACTION_BACK: {
						flagT = false;
						break;
					}
					}
				} while (flagT);
				flag = true;
				break;
			}
			case ICommon.MENU_4: {
				flag = false;
				break;
			}
			}
		} while (flag);
	}
}
