package demo;

import java.util.Scanner;
import java.util.Date;
public class Stock {
	private String symbol;
	private String name;
	private double previousClosingPrice;
	private double currentPrice;
	
	public Stock(){
		
	}
	
	public Stock(String symbol,String name){
		
	}
	
	public void setPreviousClosingPrice(double previousClosingPrice) {
		this.previousClosingPrice = previousClosingPrice;
	}
	
	public void setCurrentPrice(double currentPrice) {
		this.currentPrice = currentPrice;
	}
	
/*	public double getChangePercent(){
		return previousClosingPrice - currentPrice;
	}*/

		public double getChangePercent(){
		return Math.abs(previousClosingPrice - currentPrice) / currentPrice;
	}
/*	
	public static void main(String[] args){
		Stock st = new Stock();
		Scanner input = new Scanner(System.in);
		System.out.printf("请输入股票代码：");
		st.symbol = input.nextLine();
		System.out.printf("请输入股票名称：");
		st.name = input.nextLine();
		System.out.printf("请输入股票昨日价格：");
		st.previousClosingPrice = input.nextDouble();
		System.out.printf("请输入股票今日价格：");
		st.currentPrice = input.nextDouble();
		System.out.printf("市值变化百分比为：%.2f" , st.getChangePercent());
		
		Date d = new Date();
		System.out.println(d.toString());
	}*/
	public static void main(String[] args){
		Stock st = new Stock("ORCL","Oracle Corporation");
		st.setCurrentPrice(34.5);
		st.setPreviousClosingPrice(34.35);
		System.out.println(st.getChangePercent()*100);
	}
}
