package nkt.model;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import nkt.entity.Custommer;
import nkt.imodel.IModelCustommer;
import nkt.iview.IViewMenu;

public class ModelCustommer implements IModelCustommer{
	public boolean addCustommer(List<Custommer> listCustommer,
			Custommer custommer) {
		boolean flag = true;
		int size = listCustommer.size();
		listCustommer.add(custommer);
		if (listCustommer.size() > size) {
			flag = true;
		} else {
			flag = false;
		}
		return flag;
	}

	public boolean editCustommer(List<Custommer> listCustommer,
			Custommer custommer) {
		boolean flag = false;
		if (listCustommer != null) {
			for (int i = 0; i < listCustommer.size(); i++) {
				if (listCustommer.get(i).getIdentityCard() == custommer
						.getIdentityCard()) {
					listCustommer.set(i, custommer);
					flag = true;
				}
			}
		}
		return flag;
	}

	public boolean deleteCustommer(List<Custommer> listCustommer, int cMND) {
		boolean flag = false;
		int size = listCustommer.size();
		if (listCustommer != null) {
			for (int i = 0; i < listCustommer.size(); i++) {
				if (listCustommer.get(i).getIdentityCard() == cMND) {
					listCustommer.remove(i);
					flag = true;
				}
			}
		}
		if (listCustommer.size() < size) {
			flag = true;
		} else {
			flag = false;
		}
		return flag;
	}

	public List<Custommer> showCustommer(List<Custommer> listCustommer) {
		Collections.sort(listCustommer, new Comparator<Custommer>() {

			@Override
			public int compare(Custommer c1, Custommer c2) {
				// TODO Auto-generated method stub
				return c1.getName().compareTo(c2.getName());
			}
		});
		return listCustommer;
	}

}
