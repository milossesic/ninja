package com.ninja.springboot.entity;

import java.sql.Date;
import java.sql.Time;

import javax.persistence.*;

@Entity
@Table(name="info")
public class User {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	@Column(name="date")
	private Date date;
	@Column(name="name")
	private String name;
	@Column(name="phone")
	private int phone;
	@Column(name="girl")
	private String girl;
	@Column(name="time_start")
	private Time time_start;
	@Column(name="time_end")
	private Time time_end;
	@Column(name="euro")
	private int euro;
	@Column(name="dinar")
	private int dinar;
	@Column(name="signature")
	private String signature;
	@Column(name="on_duty")
	private String on_duty;
	
	public User() {}
	
	public User(Date date, String name, int phone, String girl, Time time_start, Time time_end, int euro, int dinar,
			String signature, String on_duty) {
		super();
		this.date = date;
		this.name = name;
		this.phone = phone;
		this.girl = girl;
		this.time_start = time_start;
		this.time_end = time_end;
		this.euro = euro;
		this.dinar = dinar;
		this.signature = signature;
		this.on_duty = on_duty;
	}

	public User(int id, Date date, String name, int phone, String girl, Time time_start, Time time_end, int euro,
			int dinar, String signature, String on_duty) {
		this.id = id;
		this.date = date;
		this.name = name;
		this.phone = phone;
		this.girl = girl;
		this.time_start = time_start;
		this.time_end = time_end;
		this.euro = euro;
		this.dinar = dinar;
		this.signature = signature;
		this.on_duty = on_duty;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPhone() {
		return phone;
	}

	public void setPhone(int phone) {
		this.phone = phone;
	}

	public String getGirl() {
		return girl;
	}

	public void setGirl(String girl) {
		this.girl = girl;
	}

	public Time getTime_start() {
		return time_start;
	}

	public void setTime_start(Time time_start) {
		this.time_start = time_start;
	}

	public Time getTime_end() {
		return time_end;
	}

	public void setTime_end(Time time_end) {
		this.time_end = time_end;
	}

	public int getEuro() {
		return euro;
	}

	public void setEuro(int euro) {
		this.euro = euro;
	}

	public int getDinar() {
		return dinar;
	}

	public void setDinar(int dinar) {
		this.dinar = dinar;
	}

	public String getSignature() {
		return signature;
	}

	public void setSignature(String signature) {
		this.signature = signature;
	}

	public String getOn_duty() {
		return on_duty;
	}

	public void setOn_duty(String on_duty) {
		this.on_duty = on_duty;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", date=" + date + ", name=" + name + ", phone=" + phone + ", girl=" + girl
				+ ", time_start=" + time_start + ", time_end=" + time_end + ", euro=" + euro + ", dinar=" + dinar
				+ ", signature=" + signature + ", on_duty=" + on_duty + "]";
	}
	
}
