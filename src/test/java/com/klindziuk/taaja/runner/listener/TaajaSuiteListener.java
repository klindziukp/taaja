/*
 * Copyright (c) 2022. Dandelion tutorials
 */

package com.klindziuk.taaja.runner.listener;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.ISuite;
import org.testng.ISuiteListener;

public class TaajaSuiteListener implements ISuiteListener {

  public static final Logger LOGGER = LogManager.getLogger(TaajaSuiteListener.class);

  @Override
  public void onStart(ISuite suite) {
    LOGGER.info("Test Suite Started: {}", suite.getXmlSuite().getName());
    deleteTestOutputDirectory();
  }

  @Override
  public void onFinish(ISuite suite) {
    LOGGER.info("Test Suite Finished: {}", suite.getXmlSuite().getName());
  }

  private void deleteTestOutputDirectory() {
    final String messageFormat = "Directory with test-output deleted: {}";
    File file = new File("test-output");
    if (file.exists()) {
      try {
        FileUtils.deleteDirectory(file);
      } catch (IOException ioException) {
        LOGGER.info(messageFormat, false);
      }
      LOGGER.info(messageFormat, true);
    }
  }
}
