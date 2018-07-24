package PhoneNum;

import java.util.Scanner;

public class MainUI {
	public static void main(String[] args) {
		while (true) {
		
		System.out.println("-------------------------电话本管理系统--------------------");
		System.out.println("1.添加       2.删除     3.修改    4.查询所有   5.根据姓名查询     0.退出");
		System.out.println("-------------------------电话本管理系统--------------------");
		System.out.println("请选择业务:");
		Scanner sc =new Scanner(System.in);
		int key = sc.nextInt();
		PhoneNum adnum = new PhoneNum();
		
		switch (key) {
		case 1:
			adnum.addTel();
			break;
		case 2:
			adnum.deleteTel();
			break;
		case 3:
			adnum.update();
			break;
		case 4:
			adnum.selectAllTel();
			break;
		case 5:
			adnum.selectTelByName();
			break;
		case 0:
			System.out.println("谢谢使用");
			System.exit(0);
			break;
		default:
			System.out.println("输入错误！");
			break;
		
		/*if (key==1) {
			adnum.add();
		}else if (key==2) {
			adnum.del();
		}else if (key==3) {
			adnum.update();
		}else if (key==4) {
			adnum.selectAll();
		}else if (key==5) {
			adnum.selectName();
		}else if (key==0) {
			adnum.exit();
		}else {
			System.out.println("输入错误！");
		}*/

		}
	}
}
	
}

	

