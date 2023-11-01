package com.user.management.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

import com.user.management.handler.CustomSucessHandler;
import com.user.management.service.CustomUserDetailsService;

import static org.springframework.security.config.Customizer.withDefaults;

import org.springframework.security.core.userdetails.User;
@Configuration

public class SecurityConfig {

	
	@Autowired
	CustomSucessHandler customSucessHandler;
	
	@Autowired
	CustomUserDetailsService customUserDetailsService;

//    
//	 @Bean
//	 public UserDetailsService userDetailsService() {
//	        UserDetails userDetails = User.builder().
//	                username("Anjali")
//	                .password(passwordEncoder().encode("Singh")).roles("Admin").
//                build();
//      return new InMemoryUserDetailsManager(userDetails);
//	    }
	 
	 @Bean
	public BCryptPasswordEncoder passwordEncoder() {
	     return new BCryptPasswordEncoder();
	 }

	// @Bean
		//SecurityFilterChain defaultSecurityFilterChain (HttpSecurity http) throws Exception {
//	 
//			http.authorizeHttpRequests ((requests) ->
//			requests.requestMatchers (new AntPathRequestMatcher("/home")).permitAll()
//			.anyRequest().authenticated())
//	 
//			.csrf(csrf -> csrf.disable())
//			.httpBasic(withDefaults());
//			return http.build();
//	 
//		}
//	
	 
	 @Bean
	 public SecurityFilterChain defaultFilterChain(HttpSecurity http) throws Exception{
		 http.csrf(c->c.disable())
	.authorizeHttpRequests(request->request.requestMatchers(AntPathRequestMatcher.antMatcher("/admin-page")).
			hasAuthority("ADMIN")
			
	//.requestMatchers("/user-page").hasAuthority("USER")
		
	//	.requestMatchers("/Registration","/createUser","/Login**").permitAll()
//	
	.anyRequest().authenticated()
			)
	.formLogin(form-> form.loginPage("/").loginProcessingUrl("/")
			
		.successHandler(customSucessHandler).permitAll())
	
	.logout(form->form.invalidateHttpSession(true).clearAuthentication(true)
		.logoutRequestMatcher(new AntPathRequestMatcher("/home"))
	
		.logoutSuccessUrl("/?Logout").permitAll());
	return http.build();
	 }
	
	
	 @Autowired
	 public void configure (AuthenticationManagerBuilder auth) throws Exception{
	 auth.userDetailsService(customUserDetailsService).passwordEncoder(passwordEncoder());
 }

}
	

