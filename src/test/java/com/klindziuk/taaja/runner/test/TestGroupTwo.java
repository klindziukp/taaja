/*
 * Copyright (c) 2022. Dandelion tutorials
 */

package com.klindziuk.taaja.runner.test;

import com.klindziuk.taaja.runner.constant.Group;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestGroupTwo extends BaseTest {

  @Test(groups = {Group.GROUP_TWO})
  public void testForGroupTwo() {
    logTestExecution(Group.GROUP_TWO);
    Assert.assertEquals(1, 1);
  }
}