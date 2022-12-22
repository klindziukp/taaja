/*
 * Copyright (c) 2022. Dandelion tutorials
 */

package com.klindziuk.taaja.runner.test;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public abstract class BaseTest {

  public final Logger LOGGER = LogManager.getLogger(getClass());

  protected void logTestExecution(String testGroup){
    LOGGER.info("Test Running group '{}'", testGroup);
  }
}