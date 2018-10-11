package nkt.view;

import nkt.common.ICommon;
import nkt.iview.IViewMenu;

public class Menu implements IViewMenu {
	public void menu(){
		System.out.print("Enter "+ICommon.MENU_1+" room manager.");
		System.out.print("\nEnter "+ICommon.MENU_2+" custommer manager.");
		System.out.print("\nEnter "+ICommon.MENU_3+" transaction manager.");
		System.out.print("\nEnter "+ICommon.MENU_4+" end..");
	}

	public void menuRoom(){
		System.out.print("\nEnter "+ICommon.MENU_ROOM_ADD+" add room.");
		System.out.print("\nEnter "+ICommon.MENU_ROOM_EDIT+" edit room.");
		System.out.print("\nEnter "+ICommon.MENU_ROOM_DELETE+" delete room.");
		System.out.print("\nEnter "+ICommon.MENU_ROOM_SHOW+" show room.");
		System.out.print("\nEnter "+ICommon.MENU_ROOM_BACK+" back");
	}

	public void menuCustommer(){
		System.out.print("\nEnter "+ICommon.MENU_CUSTOMMER_ADD+" add custommer.");
		System.out.print("\nEnter "+ICommon.MENU_CUSTOMMER_EDIT+" edit custommer.");
		System.out.print("\nEnter "+ICommon.MENU_CUSTOMMER_DELETE+" delete custommer.");
		System.out.print("\nEnter "+ICommon.MENU_CUSTOMMER_SHOW+" show custommer.");
		System.out.print("\nEnter "+ICommon.MENU_CUSTOMMER_BACK+" back");
	}

	public void menuTransaction(){
		System.out.print("\nEnter "+ICommon.MENU_TRANSACTION_SHOWROOMAVAILABLE+" show rom available.");
		System.out.print("\nEnter "+ICommon.MENU_TRANSACTION_RENTROOM+" rent.");
		System.out.print("\nEnter "+ICommon.MENU_TRANSACTION_SHOWROOMUNAVAILABLE+" show rom unavailable.");
		System.out.print("\nEnter "+ICommon.MENU_TRANSACTION_PAYROOM+" pay room.");
		System.out.print("\nEnter "+ICommon.MENU_TRANSACTION_BACK+" back");
	}

	public void message(String message){
		System.out.print("\n"+message);
	}
}
