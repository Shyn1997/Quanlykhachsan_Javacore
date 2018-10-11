package nkt.iview;

import java.util.List;

import nkt.entity.Custommer;

public interface IViewCustommer {
	public Custommer addCustommer(Custommer custommer);

	public Custommer editCustommer(List<Custommer> listCustommer);

	public int deleteCustommer();

	public void showCustommer(Custommer custommer);

	public void showAllCustommer(List<Custommer> listCustommer);

}
