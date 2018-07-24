package PhoneNum;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import org.junit.Test;

public class PhoneNum {
	
	
/*	static NumInfo[] add1 = new NumInfo[100];//创建一个数组,存放联系人基本信息
	static int num = 0;//表示数组下标索引
*/	
	Scanner sc = new Scanner(System.in);
	List<Telephone> list = new ArrayList<>();
	
	//添加联系人
	@Test
	public Telephone createTel()
	{
		System.out.print("姓名:");
		String name = sc.nextLine();
		
		System.out.print("性别:");
		String sex = sc.nextLine();
		
		System.out.print("年龄:");//17\n
		int age = sc.nextInt();
		
		sc.nextLine();
		
		System.out.print("电话:");
		String tel = sc.nextLine();
		
		System.out.print("QQ:");
		String qq = sc.nextLine();
		
		System.out.print("地址:");
		String address = sc.nextLine();
		
		Telephone telephone = new Telephone(name, sex, age, tel, qq, address);
		
		return telephone;
	
	
	/*	
		NumInfo add = new NumInfo(name, sex, age, tel, qq, addr);//新建一个对象
		
		add1[num++] = add;//对象存进数组

		System.out.println(add.toString());
		System.out.println("添加成功!");*/
	
	}
	
	public void addTel()
	{
		System.out.println("-----------添加电话本----------");
		Telephone telephone = createTel();
		System.out.println(telephone);
		
		list.add(telephone);
		
	}
	
	@Test
	public void deleteTel()
	{
		
		System.out.println("请输入删除人的名字:");
		String name = sc.nextLine();
		
		int i = selectTelByName(name);
		if (i!=-1) {
			
			list.remove(i);
			System.out.println("删除成功");
			
		}
		
		/*System.out.println("-----------------删除电话本-----------------------");
		boolean flag = false;
		System.out.println("--------------请输入删除的姓名--------------------");
		
		String name1 = sc.nextLine();
		for (int i = 0; i < num; i++) {
			if (name1.equals(add1[i].getName())) {
				flag = true;
				System.out.println(add1[i].toString());
				System.out.println("确定吗？1（是）0（否）");
				
				int n = sc.nextInt();
				if (n==1) {
					
					for (int j = 0; j < num-1; j++) {
						if (j==num-1) {
							add1[j]=null;
							
						}else {
							add1[j]=add1[j+1];
						}
					}
					num--;
					System.out.println("删除成功！");
					
				}
			}
			if (flag==false) {
				System.out.println("此人不存在");
			}
		}
		
		*/
	}
	
//	修改联系人
	@Test
	public void update()
	{
		
		System.out.println("输入修改人名称:");
		String name = sc.nextLine();
		int index = selectTelByName(name);
		
		if (index!=-1) {
			
			System.out.println("请输入新的信息:");
			Telephone telephone = createTel();
			
			list.set(index, telephone);
			
			
			
			
		}
		/*System.out.println("-----------修改电话本-----------");
		boolean flag = false;
		System.out.println("输入姓名：");
		String name1 = sc.nextLine();
		for (int i = 0; i < num; i++) {
			if (name1.equals(add1[i].getName())) {
				flag = true;
				System.out.println(add1.toString());
				System.out.println("请输入信息：");
				System.out.print("姓名:");
				String name = sc.nextLine();
				System.out.print("性别:");
				char sex = sc.nextLine().charAt(0);
				System.out.print("年龄:");
				int age = sc.nextInt();
				System.out.print("电话:");
				long tel = sc.nextLong();
				System.out.print("QQ:");
				long qq = sc.nextLong();
				System.out.print("地址:");
				sc.nextLine();
				String addr = sc.nextLine();
				Telephone add = new Telephone(name, sex, age, tel, qq, addr);//新建一个对象
				
				add1[num++] = add;//对象存进数组
				
				System.out.println(add.toString());
				System.out.println("添加成功!");
			}
		}*/
		
	}
	
	//查询所有联系人
	
	public void selectAllTel()
	{
		
		for (int i = 0; i < list.size(); i++) {
			Telephone telephone = list.get(i);
			System.out.println(telephone);
			
		}
		/*System.out.println("------------打印所有电话本------------");
		for (int i = 0; i < num; i++) {
			System.out.println(add1.toString());
		}*/
	}
	
	
	//根据姓名查询
	
	public void selectTelByName()
	{
		
		
		System.out.println("请输入要查询的人的姓名:");
		String name = sc.nextLine();
		selectTelByName(name);
	/*	System.out.println("------------------查找电话本----------------");
		boolean flag = false;
		System.out.println("输入姓名：");
		String name1 = sc.nextLine();
		for (int i = 0; i < num; i++) {
			if (name1.equals(add1[i].getName())) {
				flag = true;
				System.out.println(add1.toString());
			}
		}
		if (flag == false) {
			
			System.out.println("不存在此人");
		}*/
	}
	
	public int selectTelByName(String name)
	{
		for (int i = 0; i < list.size(); i++) {
			Telephone telephone = list.get(i);
			String name1 = telephone.getName();
			if (name1.equals(name)) {
				System.out.println(telephone);
				return i;
			}
		}
		System.out.println("无此人");
		return -1;
	}
	
	//退出
	
	public void exit()
	{
		System.out.println("退出系统！");
	}
	
	
	
}
