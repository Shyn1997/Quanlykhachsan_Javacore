package nkt.view;

import java.util.List;

import nkt.entity.Custommer;
import nkt.iview.IViewCustommer;
import nkt.iview.IViewMenu;


public class ViewCustommer implements IViewCustommer {
	InputData input = new InputData();

	public Custommer addCustommer(Custommer custommer) {
		System.out.print("Ten khach hang: ");
		custommer.setName(input.inputString());
		System.out.print("CMND : ");
		custommer.setIdentityCard(input.inputInt());
		System.out.print("Dia chi: ");
		custommer.setAddress(input.inputString());
		System.out.print("Nam sinh: ");
		custommer.setdOB(input.inputString());
		System.out.print("Tuoi : ");
		custommer.setYearOld(input.inputInt());
		return custommer;
	}

	public Custommer editCustommer(List<Custommer> listCustommer) {
		int Temp = 0;
		int cMND;
		Custommer custommer;
		do {
			custommer = new Custommer();
			System.out.print("\nNhap so CMND khach can sua thong tin:");
			cMND = input.inputInt();
			for (Custommer custommer1 : listCustommer) {
				if (custommer1.getIdentityCard() == cMND) {
					System.out.print("\n------Thong tin cu:------\n");
					this.showCustommer(custommer1);
					Temp = 1;
				}
			}
			if (Temp == 1) {
				System.out.print("\nBat dau sua thong tin khach :");
				custommer.setIdentityCard(cMND);
				System.out.print("\nHo ten :");
				custommer.setName(input.inputString());
				System.out.print("Dia chi: ");
				custommer.setAddress(input.inputString());
				System.out.print("Nam sinh: ");
				custommer.setdOB(input.inputString());
				System.out.print("Tuoi : ");
				custommer.setYearOld(input.inputInt());
			} else {
				System.out
						.print("Khong tim thay phong vua nhap, moi nhap lai ma phong!!!");
			}
		} while (Temp == 0);
		return custommer;
	}

	public int deleteCustommer() {
		int cMND;
		System.out.print("\nNhap so CMND khach muon xoa: ");
		cMND = input.inputInt();
		return cMND;
	}
	public void showCustommer(Custommer custommer){
		System.out.print("\n==========================");
		System.out.print("\nHo ten: "+custommer.getName());
		System.out.print("\nCMND: "+custommer.getIdentityCard());
		System.out.print("\nDia chi: "+custommer.getAddress());
		System.out.print("\nNam sinh: "+custommer.getdOB());
		System.out.print("\nTuoi: "+custommer.getYearOld());
		System.out.print("==========================\n");
	}
	public void showAllCustommer(List<Custommer> listCustommer){
		for(Custommer custommer : listCustommer){
			this.showCustommer(custommer);
		}
	}
}
