package work20180713;


/*练习9（基础）：
(1)定义Person类,有4个属性：String name; int age; String school; String major，
(2)定义Person类的3个构造方法:
		第一个构造方法Person(String n, int a)设置类的name和age属性；
		第二个构造方法Person(String n, int a, String s)设置类的name,   
        age 和school属性；
		第三个构造方法Person(String n, int a, String s, String m)设置类的name, age ,school和major属性；
(3)在main方法中分别调用不同的构造方法创建的对象，并输出其属性值
*/
public class Person1 {
	private String name;
	private int age;
	private String school;
	private String major;
	
	//name,age构造函数
	public Person1(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	//name,age,school构造函数
	public Person1(String name, int age, String school) {
		super();
		this.name = name;
		this.age = age;
		this.school = school;
	}
	
	//全部属性构造函数
	public Person1(String name, int age, String school, String major) {
		super();
		this.name = name;
		this.age = age;
		this.school = school;
		this.major = major;
	}
	
	@Override
	public String toString() {
		return "Person1 [name=" + name + ", age=" + age + ", school=" + school + ", major=" + major + "]";
	}
	
	

	
	
	
	
}
