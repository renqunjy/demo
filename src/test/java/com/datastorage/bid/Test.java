package com.datastorage.bid;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * 测试类
 * 
 * @author RQ
 *
 */
public class Test {

	public static void main(String[] args) {

		/*
		 * System.out.println("--------------------------------- ");
		 * 
		 * Bird bird = new Bird("bird", "黄色"); bird.fly(); bird.eat();
		 * 
		 * System.out.println("--------------------------------- ");
		 * 
		 * Maque maque = new Maque("麻雀","灰色"); maque.fly(); maque.eat();
		 * 
		 * System.out.println("--------------------------------- ");
		 * 
		 * Qie qie = new Qie("企鹅","白色"); qie.fly(); qie.eat(); qie.youyong();
		 * 
		 * System.out.println("--------------------------------- ");
		 */

		// -----------------------------------------------------------------------------------------------------------------------

		/*
		 * List<Student> list = new ArrayList<Student>(); list.add(new
		 * Student(1, "松岛枫", 18)); list.add(new Student(2, "更地撒", 19));
		 * list.add(new Student(3, "还是", 20)); list.add(new Student(4, "好多",
		 * 21)); list.add(new Student(5, "权限", 22));
		 * 
		 * System.out.println("----------------- ");
		 * System.out.println("修改前的名字： "); for(int i = 0; i < list.size(); i++){
		 * System.out.println(list.get(i).getName()); }
		 * 
		 * System.out.println("----------------- ");
		 * 
		 * Scanner input = new Scanner(System.in); for(int r = 0; r < 1;){
		 * System.out.println("请输入修改的id: "); int id = input.nextInt(); for(int i
		 * = 0; i < list.size(); i++){ if(id == list.get(i).getId()){
		 * System.out.println("请输入修改的name： "); String name = input.next();
		 * list.get(i).setName(name); System.out.println("修改成功！"); break; } if(i
		 * == list.size() - 1){ System.out.println("不存在"); break; } }
		 * System.out.println("是否继续？ y/n"); String go = input.next();
		 * if("n".equals(go)){ break; } }
		 * 
		 * System.out.println("----------------- ");
		 * System.out.println("修改后的名字： "); for(int i = 0; i < list.size(); i++){
		 * System.out.println(list.get(i).getName()); }
		 */

		// -----------------------------------------------------------------------------------------------------------------------

		/*HashMap<Integer, String> map = new HashMap<Integer, String>();
		for (int i = 0; i < 1000; i++) {
			map.put(i, "第" + i + "个");
		}
		
		long t1 = System.nanoTime();
		
		// 循环第一种
		Object key[] = map.keySet().toArray();
		for (int i = 0; i < map.size(); i++) {
			map.get(key[i]);
		}
		
		long t2 = System.nanoTime();
		
		// 循环第二种
		for (Entry<Integer, String> entry : map.entrySet()) {
			entry.getValue();
		}
		
		long t3 = System.nanoTime();
		
		// 循环第三种
		Iterator<Integer> it = map.keySet().iterator();
		while (it.hasNext()) {
			Integer ii = (Integer) it.next();
			map.get(ii);
		}
		
		long t4 = System.nanoTime();
		
		// 循环第四种
		for (Integer kk : map.keySet()) {
			map.get(kk);
		}
		
		long t5 = System.nanoTime();
		
		System.out.println("第一种方法耗时：" + (t2 - t1) / 1000 + "微秒");
		System.out.println("第二种方法耗时：" + (t3 - t2) / 1000 + "微秒");
		System.out.println("第三种方法耗时：" + (t4 - t3) / 1000 + "微秒");
		System.out.println("第四种方法耗时：" + (t5 - t4) / 1000 + "微秒");*/
		
		// -----------------------------------------------------------------------------------------------------------------------
		/*Map<String, Product> map = new HashMap<String, Product>();
		map.put("10001", new Product("10001", "商品1", "2", "100", "个"));
		map.put("10002", new Product("10002", "商品2", "8.8", "10", "包"));
		map.put("10003", new Product("10003", "商品3", "100.1", "10", "袋"));
		Scanner input = new Scanner(System.in);
		System.out.println(">> 新增商品");
		System.out.println("请输入商品编号：");
		String no = input.next();
		if(map.containsKey(no)){
			System.out.println("对不起，此商品已存在！");
		}else{
			System.out.println("请输入商品名称：");
			String name = input.next();
			System.out.println("请输入商品单价：");
			String price = input.next();
			System.out.println("请输入商品数量：");
			String num = input.next();
			System.out.println("请输入商品单位：");
			String unit = input.next();
			map.put(no, new Product(no, name, price, num, unit));
			System.out.println("新增成功！");
			
			System.out.println("商品编号\t商品名称\t商品单价\t单位\t数量");
			for (String key : map.keySet()) {
				Product p = map.get(key);
				System.out.println(p.getNo() + "\t" + p.getName() + "\t" + p.getPrice() + "\t" + p.getUnit() + "\t" + p.getNum());
			}
		}*/
		
		//--------------------------------------------------------------------------
		
		try {
			Class clazz = Class.forName("com.datastorage.bid.Student");
			Object obj = clazz.newInstance();  
			Field[] fields = clazz.getDeclaredFields();
			for (Field field : fields) {
				field.set(field, "123");
				System.out.println(field);
			}
			
		} catch (ClassNotFoundException e) {
		} catch (InstantiationException e) {
		} catch (IllegalAccessException e) {
		}  
		
		
	}

}
