//个人基本信息
class Introduction implements Info{
	private String name;
	private String sex;
	private int age;
	
	public Introduction(String name,String sex,int age) {
		this.setName(name);
		this.setSex(sex);
		this.setAge(age);
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public String toString(){
		return "基本信息："+"\n"+
				"\t|-姓名："+this.name+"\n"+
				"\t|-性别："+this.sex+"\n"+
				"\t|-年龄："+this.age;
	}
}
