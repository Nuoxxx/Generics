//��ϵ��ʽ
class Contact implements Info{
	private String address;
	private String telephone;
	private String zipcode;
	
	public Contact(String address,String telephone,String zipcode) {
		this.setAddress(address);
		this.setTelephone(telephone);
		this.setZipcode(zipcode);
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	public String getAddress() {
		return address;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}
	public String getZipcode() {
		return zipcode;
	}
	
	public String toString(){
		return "��ϵ��ʽ��"+"\n"+
				"\t|-��ϵ�绰��"+this.telephone+"\n"+
				"\t|-��ϵ��ַ��"+this.address+"\n"+
				"\t|-�������룺"+this.zipcode;
	}
}
