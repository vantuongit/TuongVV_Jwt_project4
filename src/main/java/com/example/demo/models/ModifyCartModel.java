package com.example.demo.models;

import com.fasterxml.jackson.annotation.JsonProperty;


public class ModifyCartModel {

	@JsonProperty
	private long itemId;

	@JsonProperty
	private String username;

	@JsonProperty
	private int quantity;

	public long getItemId() {
		return itemId;
	}

	public void setItemId(long itemId) {
		this.itemId = itemId;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
}
