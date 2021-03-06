package io.github.alesur.assetm.restfullwebservice;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;

@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(securedEnabled = true, prePostEnabled = true)
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        User.UserBuilder users = User.withDefaultPasswordEncoder();
        auth.inMemoryAuthentication().withUser(users.username("admin@amb.lt").password("test123").roles("ADMIN"));
        auth.inMemoryAuthentication().withUser(users.username("alesur@amb.lt").password("test123").roles("VIEWER"));
        auth.inMemoryAuthentication().withUser(users.username("jonas@amb.lt").password("test123").roles("MANAGER"));
    }

    @Override
    public void configure(WebSecurity web) throws Exception {
        web.ignoring().antMatchers("/vendors/**", "/components/**", "/js/**");
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
                .anyRequest().authenticated()
                .and()
                .formLogin()
                .loginPage("/login")
                .loginProcessingUrl("/authenticateTheUser")
                .permitAll()
                .and()
                .logout().permitAll();

    }
}
