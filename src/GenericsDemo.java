
public class GenericsDemo {

	public static void main(String[] args) {
		Person<Contact> person = null;
		person = new Person<Contact>(new Contact("������", "01051283346", "100088"));
		System.out.println(person);
		
		Person<Introduction> person2 = null;
		person2 = new Person<Introduction>(new Introduction("���˻�", "��", 30));
		System.out.println(person2);
	}

}
