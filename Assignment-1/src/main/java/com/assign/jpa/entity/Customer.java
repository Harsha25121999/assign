package com.assign.jpa.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.List;

@Entity
public class Customer {
    @Id
    @GeneratedValue
    private int Customer_Id;
    @Override
	public String toString() {
		return "Customer [Customer_Id=" + Customer_Id + ", Customer_Name=" + Customer_Name + ", Email=" + Email
				+ ", MobileNumber=" + MobileNumber + ", City=" + City + ", products=" + products + "]";
	}
	public int getCustomer_Id() {
		return Customer_Id;
	}
	public void setCustomer_Id(int customer_Id) {
		Customer_Id = customer_Id;
	}
	public String getCustomer_Name() {
		return Customer_Name;
	}
	public void setCustomer_Name(String customer_Name) {
		Customer_Name = customer_Name;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public long getMobileNumber() {
		return MobileNumber;
	}
	public void setMobileNumber(long mobileNumber) {
		MobileNumber = mobileNumber;
	}
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	public List<Purchase> getProducts() {
		return products;
	}
	public void setProducts(List<Purchase> products) {
		this.products = products;
	}
	private String Customer_Name;
    private String Email;
    private long MobileNumber;
    private String City;
    @OneToMany(targetEntity = Purchase.class,cascade = CascadeType.ALL)
    @JoinColumn(name ="cp_fk",referencedColumnName = "Customer_Id")
    private List<Purchase> products;
}
