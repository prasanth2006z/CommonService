package com.testcase.integration;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import com.testcase.integration.user.UserServiceApplicationIT;

@RunWith(Suite.class)
@Suite.SuiteClasses({
  UserServiceApplicationIT.class
})

public class IntegrationTestSuite {

}
