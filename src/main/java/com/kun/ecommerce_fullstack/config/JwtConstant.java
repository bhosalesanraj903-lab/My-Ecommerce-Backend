package com.kun.ecommerce_fullstack.config;

public class JwtConstant {

	// set JWT_SECRET in the environment (see .env.example), at least 32 characters
	public static final String SECRET_KEY=System.getenv("JWT_SECRET");
	public static final String JWT_HEADER="Authorization";
}
