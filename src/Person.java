
class Person<T extends Info>{
	private T info;
	public Person(T info) {
		this.setInfo(info);
	}
	
	public T getInfo() {
		return info;
	}
	public void setInfo(T info) {
		this.info = info;
	}
	
	@Override
	public String toString() {
		return this.info.toString();
	}
}
