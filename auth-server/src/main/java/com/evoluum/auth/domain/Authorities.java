package com.evoluum.auth.domain;

import java.util.Arrays;

public enum Authorities {

	ROLE_USER, ROLE_ADMIN;

	public static String[] names() {
		return Arrays.stream(values()).map(Enum::name).toArray(String[]::new);
	}
}
