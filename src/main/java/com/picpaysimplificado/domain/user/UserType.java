package com.picpaysimplificado.domain.user;

public enum UserType {
	COMMON("Common"), MERCHANT("Merchant");
	
	
	private String value;

	private UserType(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}

	@Override
	public String toString() {
		return value;
	}
}
