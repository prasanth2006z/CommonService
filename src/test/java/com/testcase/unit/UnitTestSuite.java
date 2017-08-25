package com.testcase.unit;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import com.testcase.unit.user.TestUserServiceApplication;

@RunWith(Suite.class)
@Suite.SuiteClasses({
  TestUserServiceApplication.class
})

public class UnitTestSuite {

}
