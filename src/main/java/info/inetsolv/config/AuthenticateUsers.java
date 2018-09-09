package info.inetsolv.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableGlobalMethodSecurity(securedEnabled=true)
public class AuthenticateUsers extends WebSecurityConfigurerAdapter{

	

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http
		.authorizeRequests()
		.antMatchers("/").permitAll()
			.anyRequest().authenticated()
			.and()
		.formLogin();
		
//		http.authorizeRequests()
//			.antMatchers("/admin").hasAnyRole("ADMIN")	
//			.anyRequest().authenticated().and().formLogin();
	}

	@Override
	@Autowired
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.inMemoryAuthentication()
		.withUser("ghoshd").password("ghoshd").roles("USER")
		.and()
		.withUser("svp").password("svp").roles("ADMIN");
	}

	
}
