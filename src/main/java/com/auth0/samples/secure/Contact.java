package com.auth0.samples.secure;

import java.util.List;

import com.google.common.collect.Lists;

public class Contact {

	private static Contact contact;
	
	private String name;
	private String phone;
	
	private Contact() {
	}
	
	public static Contact builder() {
//		if(contact == null) {
//			contact = new Contact();
//		}
		contact = new Contact();
		return contact;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
	

	public Contact name(String name) {
		contact.setName(name);
		return contact;
	}
	
	public Contact phone(String phone) {
		contact.setPhone(phone);
		return contact;
	}
	
	public Contact build() {
		return contact;
	}
	
//	public static void main(String[] args) {
//		List<Contact> contacts = Lists.newArrayList(
//				Contact.builder().name("Bruno Krebs").phone("+5551987654321").build(),
//				Contact.builder().name("John Doe").phone("+5551888884444").build());
//		System.out.println(contacts.get(0).getName());
//		System.out.println(contacts.get(1).getName());
//	}
}
