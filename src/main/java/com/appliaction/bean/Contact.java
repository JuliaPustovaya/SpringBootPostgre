package com.appliaction.bean;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "CONTACTS")
public class Contact {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private String name;

	public Contact() {
	}

	public Contact(Integer id, String name) {
		this.id = id;
		this.name = name;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int hashCode() {
		int hash = 7;
		hash = 79 * hash + Objects.hashCode(this.id);
		hash = 79 * hash + Objects.hashCode(this.name);
		return hash;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		final Contact other = (Contact) obj;
		if (!Objects.equals(this.name, other.name)) {
			return false;
		}
		return Objects.equals(this.id, other.id);
	}

	@Override
	public String toString() {
		return "Contact{" + "id=" + id + ", name=" + name
				+ '}';
	}
}
