package com.programem.login;

import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.config.annotation.authentication.configurers.provisioning.InMemoryUserDetailsManagerConfigurer;
//import org.springframework.security.config.annotation.authentication.configurers.provisioning.UserDetailsManagerConfigurer;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@EnableWebSecurity
public class SecurityWebConfig extends WebSecurityConfigurerAdapter {

  @Override
  protected void configure(AuthenticationManagerBuilder builder) throws Exception {
    builder
        .inMemoryAuthentication()
        .withUser("leonardo").password("123456")
            .roles("USER")
        .and()
        .withUser("hilson").password("123456")
         .roles("USER")
        .and()
        .withUser("daniel").password("123456")
         .roles("USER");
  }

  //private UserDetailsManagerConfigurer<AuthenticationManagerBuilder, InMemoryUserDetailsManagerConfigurer<AuthenticationManagerBuilder>> and() {
    //return null;
  //}

 
}