package ex9;

/*
 * 属性：学号、姓名、年龄
 * 方法：获取和设置相应属性
 *       获得字符串
 */

public class Student {
	private String id;
	private String name;
	private int age;
	
	public Student(String id,String name,int age) {
		this.setId(id);
		this.setName(name);
		this.setAge(age);
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	/*
	 * 返回学号+姓名+年龄的字符串
	 */
	@Override
	public String toString() {
		return this.id + "\t" + this.name + "\t" + this.age;
	}
	
}
