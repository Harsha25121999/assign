package com.assign.jpa.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Purchase
{
	
	@Id
	private int pid;
	private int price;
	private int mrp;
	private int quantity;
	private int cp_fk;
	@Override
	public String toString() {
		return "Purchase [pid=" + pid + ", price=" + price + ", mrp=" + mrp + ", quantity=" + quantity + ", cp_fk="
				+ cp_fk + "]";
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getMrp() {
		return mrp;
	}
	public void setMrp(int mrp) {
		this.mrp = mrp;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public int getCp_fk() {
		return cp_fk;
	}
	public void setCp_fk(int cp_fk) {
		this.cp_fk = cp_fk;
	}
}