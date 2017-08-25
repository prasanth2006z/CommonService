package com.testcase.unit.user;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.user.config.UserServiceConfig;
import com.user.dao.UserDao;
import com.user.service.UserService;

/**
 * @author Prasanth.P
 * Unit test for simple App.
 * 
 */
@DirtiesContext
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = UserServiceConfig.class)
@WebAppConfiguration
public class TestUserServiceApplication {

  @Autowired
  private UserService userService;

  @MockBean
  private UserDao userDao;

  @Test
  public void testGetUserDetails() {
    Mockito.when(userDao.getUserDetails(1)).thenReturn(new String("test1"));
    Assert.assertEquals("test1", userService.getUserDetails(1));
  }
}
