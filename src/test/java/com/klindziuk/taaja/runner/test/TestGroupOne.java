/*
 * Copyright (c) 2022. Dandelion tutorials
 */

package com.klindziuk.taaja.runner.test;

import com.klindziuk.taaja.runner.constant.Group;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestGroupOne extends BaseTest {

  @Test(groups = {Group.GROUP_ONE})
  public void testForGroupOne() {
    LOGGER.info("Running test method for group {}", Group.GROUP_ONE);
    Assert.assertEquals(1, 1);
  }
}