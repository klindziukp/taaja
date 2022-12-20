/*
 * Copyright (c) 2022. Dandelion tutorials
 */

package com.klindziuk.taaja.runner.listener;

import org.apache.logging.log4j.LogManager;

import org.apache.logging.log4j.Logger;
import org.testng.IInvokedMethod;
import org.testng.IInvokedMethodListener;
import org.testng.ITestResult;

public class TaajaTestListener implements IInvokedMethodListener {

  public static final Logger LOGGER = LogManager.getLogger(TaajaTestListener.class);

  @Override
  public void beforeInvocation(IInvokedMethod method, ITestResult testResult) {
    LOGGER.info("Test Started: {}", method.getTestMethod().getQualifiedName());
  }

  @Override
  public void afterInvocation(IInvokedMethod method, ITestResult testResult) {
    LOGGER.info("Test Finished: {}", method.getTestMethod().getMethodName());
  }
}
