package com.qingyuanos.openshiftapis.example;

import com.qingyuanos.core.googleprotobuf.openshiftapis.ProjectAndBuild.FindProjectResponse;
import com.qingyuanos.openshiftapis.googleprotobufrpc.APIEngine;

public class App {

	public static void main(String[] args) {
		APIEngine engine = new APIEngine("172.17.4.50", 8086);
		FindProjectResponse response = engine.findProject("tangfeixiong");		
		System.out.printf("Found: %s", response.getOdefv1RawData().toString());
	}
}
