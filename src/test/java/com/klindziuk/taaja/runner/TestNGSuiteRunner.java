/*
 * Copyright (c) 2022. Dandelion tutorials
 */

package com.klindziuk.taaja.runner;

import com.klindziuk.taaja.runner.listener.TaajaTestListener;
import com.klindziuk.taaja.runner.listener.TaajaSuiteListener;
import java.util.ArrayList;
import java.util.List;
import org.testng.TestNG;
import org.testng.xml.XmlPackage;
import org.testng.xml.XmlSuite;
import org.testng.xml.XmlSuite.ParallelMode;
import org.testng.xml.XmlTest;

public class TestNGSuiteRunner {

  public static void main(String[] args) {
    setAllureProperties();

    TestNG testNG = new TestNG();
    testNG.setUseDefaultListeners(Boolean.FALSE);
    testNG.addListener(new TaajaSuiteListener());
    testNG.addListener(new TaajaTestListener());
    testNG.setXmlSuites(List.of(getXmlSuite()));

    testNG.run();

    System.exit(testNG.getStatus());
  }

  private static void setAllureProperties() {
    System.setProperty("allure.results.directory", "build/allure-results");
  }

  private static List<XmlTest> getXmlTest(XmlSuite suite) {
    List<XmlTest> xmlTests = new ArrayList<>();
    XmlTest xmlTest = new XmlTest();
    xmlTests.add(xmlTest);
    xmlTest.setName("com.klindziuk.taaja.runner");
    xmlTest.setPackages(getPackages());
    xmlTest.setSuite(suite);
    return xmlTests;
  }

  private static List<XmlPackage> getPackages() {
    final List<XmlPackage> xmlPackages = new ArrayList<>();
    final XmlPackage xmlPackage = new XmlPackage();
    xmlPackage.setName("com.klindziuk.taaja.runner.test");
    xmlPackages.add(xmlPackage);
    return xmlPackages;
  }

  private static XmlSuite getXmlSuite() {
    final XmlSuite xmlSuite = new XmlSuite();
    xmlSuite.setParallel(ParallelMode.METHODS);
    xmlSuite.setPackages(getPackages());
    xmlSuite.addIncludedGroup("group-one");
    xmlSuite.addIncludedGroup("group-two");
    xmlSuite.addIncludedGroup("group-three");
    xmlSuite.setName("test-automation-as-java-application-suite");
    xmlSuite.setTests(getXmlTest(xmlSuite));
    return xmlSuite;
  }
}
