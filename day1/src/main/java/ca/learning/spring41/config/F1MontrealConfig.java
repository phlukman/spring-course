package ca.learning.spring41.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.io.ClassPathResource;

/**
 * @author patria.lukman
 */

@Configuration
@ComponentScan(basePackages = "ca.learning.spring41")
public class F1MontrealConfig {


  @Bean
  public
  static PropertySourcesPlaceholderConfigurer placeholderConfigurer() {
    PropertySourcesPlaceholderConfigurer p = new PropertySourcesPlaceholderConfigurer();
    p.setLocation(new ClassPathResource("some.properties"));
    return p;
  }
}
