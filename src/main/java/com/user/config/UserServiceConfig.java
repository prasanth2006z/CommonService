package com.user.config;

import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.user.dao.UserDao;
import com.user.dao.impl.UserDaoImpl;
import com.user.service.UserService;
import com.user.service.impl.UserServiceImpl;

@Configuration
@ComponentScan(basePackages = "com.user")
public class UserServiceConfig extends WebMvcConfigurationSupport {

  @Bean
  public MappingJackson2HttpMessageConverter customJackson2HttpMessageConverter() {
    MappingJackson2HttpMessageConverter jsonConverter = new MappingJackson2HttpMessageConverter();
    ObjectMapper objectMapper = new ObjectMapper();
    objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
    jsonConverter.setObjectMapper(objectMapper);
    return jsonConverter;
  }

  @Override
  public void configureMessageConverters(List<HttpMessageConverter<?>> converters) {
    converters.add(customJackson2HttpMessageConverter());
    super.addDefaultHttpMessageConverters(converters);
  }

  @Bean
  public UserService userService() {
    return new UserServiceImpl();
  }

  @Bean
  public UserDao userDao() {
    return new UserDaoImpl();
  }
}
