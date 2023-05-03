package org.helper;

import java.io.File;
import java.util.LinkedList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class Report {

	public static void toGenerateBDDReport(String jsonpath) {

		File f = new File("C:\\jdk\\New folder\\CucumberAutomation\\Reports\\JVM");
		Configuration con = new Configuration(f, "FaceBook");

		con.addClassifications("Automation", "Selenium");
		con.addClassifications("version", "4.8.0");
		con.addClassifications("FrameWork", "Cucumber");
		List<String> li = new LinkedList<String>();
		li.add(jsonpath);
		ReportBuilder rep = new ReportBuilder(li, con);
		rep.generateReports();

	}

}
