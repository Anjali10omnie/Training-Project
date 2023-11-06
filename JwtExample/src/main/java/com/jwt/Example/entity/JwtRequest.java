package com.jwt.Example.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;


@AllArgsConstructor
@Data
@NoArgsConstructor
@Builder
@ToString
public class JwtRequest {
	private String email;
	private String password;

}
