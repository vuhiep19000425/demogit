package bai_tap_interface_abstract;
public abstract class Phone	{
	private String name;
	private String phone;
	private String newnumber;
	private String name2;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public abstract void insertPhone(String name, String phone);
	public abstract void removePhone(String name);
	public abstract void updatePhone(String name, String newnumber);
	public abstract void searchPhone(String name);
	public abstract void sort();
}
