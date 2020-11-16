package exam;
import java.util.Scanner;
public class A {
	public static void main(String args[]) {
		 System.out.println("请输入您的学号:"); 
		 Scanner reader = new Scanner(System.in);
	     int xuehao;
	     xuehao = reader.nextInt();     
	     while((xuehao/1e8)<1||(xuehao/1e8)>10) {           
	        System.out.println("输入有误，请重新输入");
	        xuehao = reader.nextInt();        
	     }	 
	    	  int age;    	  
	    	  Scanner input = new Scanner(System.in);//又重新写了一遍输入语句
	    	  System.out.println("请输入姓名：");
	    	  String name =input.nextLine();
	    	  System.out.println("请输入性别：");
	    	  String sex =input.nextLine();    	  
	    	  System.out.println("请输入年龄："); 
	    	  age = reader.nextInt();    	 
	    	  System.out.println("请输入专业：");
	    	  String zhuanye =input.nextLine();
	    	  System.out.println("请输入是否为应届生：");
	    	  String judge =input.nextLine();
	    	  System.out.println("学号:"+xuehao);
	    	  System.out.println("姓名:"+name);
	    	  System.out.println("性别："+sex);
	    	  System.out.println("年龄："+age);
	    	  System.out.println("专业："+zhuanye);
	    	  System.out.println("是否应届："+judge);   	  	      	      	                 	
	   } 
}
