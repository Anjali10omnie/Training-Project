package com.product.api.Security;

import java.beans.Customizer;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration

public class SecurityConfig {
	
	

	 @Bean
	    public UserDetailsService userDetailsService() {
	        UserDetails userDetails = User.builder().
	                username("Anjali")
	                .password(passwordEncoder().encode("Singh")).roles("ADMIN").
	                build();
	        return new InMemoryUserDetailsManager(userDetails);
	    }
	    

	@Bean
	public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
    http.csrf()
	      .disable()
	      .authorizeRequests()
	      .anyRequest()
      .authenticated()
      .and()
	      .httpBasic()
      .and()
      .sessionManagement()
      .sessionCreationPolicy(SessionCreationPolicy.STATELESS);

    return http.build();
	}

	    

	    @Bean
	    public PasswordEncoder passwordEncoder() {
	        return new BCryptPasswordEncoder();
	    }

//
}
