package io.github.alesur.assetm.restfullwebservice;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;

@Configuration
@EnableWebSecurity
public class DemoSecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        //super.configure(auth);
        User.UserBuilder users = User.withDefaultPasswordEncoder();
        auth.inMemoryAuthentication().withUser(users.username("admin").password("test123").roles("ADMIN"));
        auth.inMemoryAuthentication().withUser(users.username("alesur").password("test123").roles("VIEWER"));
        auth.inMemoryAuthentication().withUser(users.username("jonas").password("test123").roles("MANAGER"));
    }
}
