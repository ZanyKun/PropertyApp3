package acres.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import acres.service.MyUserDetailsService;

@EnableWebSecurity
@Configuration
public class WebSecurityConfig extends WebSecurityConfigurerAdapter{
	
	@Autowired MyUserDetailsService service;
	
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.authenticationProvider(authProvider());
	}
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.authorizeRequests().antMatchers("/", "/welcome", "/login", "/register", "/properties", "/search", "/register/validate").anonymous()
		.and().authorizeRequests().antMatchers("/listing").hasAnyAuthority("ROLE_OWNER", "ROLE_DEALER").
		and().formLogin().loginPage("/login").loginProcessingUrl("/login/authenticate")
		.defaultSuccessUrl("/loginComplete.jsp", true)
		.failureUrl("/login")
		.and().logout().logoutUrl("/users/logout").invalidateHttpSession(true)
		.logoutSuccessUrl("/welcome").deleteCookies("JSESSIONID");
	}
	
	@Bean
	public BCryptPasswordEncoder encoder() {
		return new BCryptPasswordEncoder(11);
	}
	
	@Bean
	public AuthenticationProvider authProvider() {
		DaoAuthenticationProvider provider = new DaoAuthenticationProvider();
		provider.setUserDetailsService(service);
		provider.setPasswordEncoder(encoder());
		return provider;
	}
}