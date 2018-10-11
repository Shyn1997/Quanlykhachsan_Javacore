package nkt.imodel;

import java.util.List;

import nkt.entity.Custommer;

public interface IModelCustommer {
	public boolean addCustommer(List<Custommer> listCustommer,
			Custommer custommer);

	public boolean editCustommer(List<Custommer> listCustommer,
			Custommer custommer);

	public boolean deleteCustommer(List<Custommer> listCustommer, int cMND);

	public List<Custommer> showCustommer(List<Custommer> listCustommer);

}
