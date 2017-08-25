package com.user.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.user.service.UserService;

/**
 * 
 * @author  Prasanth.P
 *
 */
@RestController
public class UserController {

  @Autowired
  private UserService userService;

  @RequestMapping(value = "/", method = RequestMethod.GET)
  public Map<String, String> read() {
    Map<String, String> map = new HashMap<>();
    map.put("test", userService.getUserDetails(1));
    return map;
  }

}
