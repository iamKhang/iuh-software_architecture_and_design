package main;

import adapter.*;

public class Main {
	public static void main(String[] args) {
		// Sample XML data
		String sampleXml = """
			<?xml version="1.0" encoding="UTF-8"?>
			<student>
				<id>21083791</id>
				<name>Le Hoang Khang</name>
				<age>22</age>
				<gpa>3.22</gpa>
			</student>
		""";

		// Create XML data object
		XmlData xmlData = new XmlData();
		xmlData.setXmlData(sampleXml);
		System.out.println("Original XML Data:");
		System.out.println(xmlData.getXmlData());

		// Create XML to JSON adapter
		XmlToJsonAdapter adapter = new XmlToJsonAdapter(xmlData);

		// Create JSON application
		JsonApplication app = new JsonApplication();

		// Process the XML data through adapter
		System.out.println("\nProcessing XML data through JSON application:");
		app.processData(adapter);

		// Demonstrate conversion back to XML
		String newJsonData = """
			{
				"student": {
					"id": 21083791,
					"name": "Le Hoang Khang",
					"age": 22,
					"gpa": 3.22
				}
			}
		""";

		// Set new JSON data through adapter
		adapter.setJsonData(newJsonData);
		
		System.out.println("\nConverted back to XML:");
		System.out.println(xmlData.getXmlData());
	}
}
