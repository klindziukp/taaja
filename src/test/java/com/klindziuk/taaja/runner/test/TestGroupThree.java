/*
 * Copyright (c) 2022. Dandelion tutorials
 */

package com.klindziuk.taaja.runner.test;

import com.klindziuk.taaja.runner.constant.Group;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestGroupThree extends BaseTest {

  @Test(groups = {Group.GROUP_THREE})
  public void testForGroupThree() {
    logTestExecution(Group.GROUP_THREE);
    Assert.assertEquals(1, 0);
  }
}