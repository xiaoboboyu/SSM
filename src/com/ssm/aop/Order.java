package com.ssm.aop;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component("order")
public class Order {
	@Value("����")
	private String customerName;
	@Value("�ʼǱ�����")
	private String goodsName;	
	@Value("3")	
	private int purchaseNum;
	//�¶��������
	public void add() {
		System.out.println("�˿�������"+customerName+"\n"
				         + "��Ʒ���ƣ�"+goodsName+"\n"
				         + "����������"+purchaseNum)	;			
	}
	
	
	
	
	
	
	//ɾ�����������
	public void delete() {
		System.out.println("������ɾ��");			
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
