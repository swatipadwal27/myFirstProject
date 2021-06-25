package com.BusBookingSystem.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.access.AccessDeniedHandler;




@Configuration
@EnableConfigurationProperties
public class SecurityConfig extends WebSecurityConfigurerAdapter {
		@Autowired
		Neo4jUserDetailsService mongoUserDetailsService;
	
	   @Autowired
	   CustomAuthSuccessHandler customAuthSuccessHandler;
	   
	   @Bean
	   public AccessDeniedHandler accessDeniedHandler(){
	      return new CustomAccessDeniedHandler();
	   }
	   
	   @Override
	   protected void configure(HttpSecurity http) throws Exception {
	     
		   
		   http.csrf().disable();
		  
		   http.authorizeRequests().antMatchers("/", "/login", "/logout","/signUp","/login1").permitAll();
		  
		   http.authorizeRequests().antMatchers("/first","/adminHome","/userHome","/busBooking").authenticated();
		   
		  
		   http.authorizeRequests().antMatchers("/getUsers").hasAnyAuthority("admin").and()
		   .exceptionHandling().accessDeniedHandler(accessDeniedHandler());
		   
		   
		   http.authorizeRequests().and().formLogin().loginPage("/login")
			   .successHandler(customAuthSuccessHandler)
			   .failureUrl("/login?failed").usernameParameter("username")
			   .passwordParameter("password")
			   
			 
		       .and().logout().logoutUrl("/logout").logoutSuccessUrl("/login?logout");
	   }
	   
	   @Bean
	   public PasswordEncoder passwordEncoder() {
		   return new BCryptPasswordEncoder();
	   }
	   
	   @Override
	   public void configure(AuthenticationManagerBuilder builder) throws Exception {
	    builder.userDetailsService(mongoUserDetailsService);
	   }
}
