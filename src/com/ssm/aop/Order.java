package com.ssm.aop;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component("order")
public class Order {
	@Value("张三")
	private String customerName;
	@Value("笔记本电脑")
	private String goodsName;	
	@Value("3")	
	private int purchaseNum;
	//下订单切入点
	public void add() {
		System.out.println("顾客姓名："+customerName+"\n"
				         + "商品名称："+goodsName+"\n"
				         + "购买数量："+purchaseNum)	;			
	}
	
	
	
	
	
	
	//删除订单切入点
	public void delete() {
		System.out.println("订单已删除");			
	}
	
	
	
	
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getGoodsName() {
		return goodsName;
	}
	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}
	public int getPurchaseNum() {
		return purchaseNum;
	}
	public void setPurchaseNum(int purchaseNum) {
		this.purchaseNum = purchaseNum;
	}
	
	
	
}
