package com.qingyuanos.openshiftapis.example;

import io.fabric8.openshift.api.model.Project;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.qingyuanos.core.googleprotobuf.openshiftapis.ProjectAndBuild.FindProjectResponse;
import com.qingyuanos.openshiftapis.googleprotobufrpc.APIEngine;

public class App {

	public static void main(String[] args) {
		APIEngine engine = new APIEngine("172.17.4.50", 8086);
		FindProjectResponse response = engine.findProject("tangfeixiong");		
		System.out.printf("Found: %s", response.getOdefv1RawData().toString());
		InputStream input = new ByteArrayInputStream(response.getOdefv1RawData().toByteArray());
		ObjectMapper mapper = new ObjectMapper();
		Project project = null;
		try {
			project = mapper.readValue(input, Project.class);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if (project != null) {
			System.out.printf("Project: %s", project.toString());
		}
	}
}
