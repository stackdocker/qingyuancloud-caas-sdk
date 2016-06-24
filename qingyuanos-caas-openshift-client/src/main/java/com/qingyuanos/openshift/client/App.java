/**
 * Hello world!
 *
 */
package com.qingyuanos.openshift.client;

import com.openshift.restclient.authorization.BasicAuthorizationStrategy;
import com.openshift.restclient.authorization.IAuthorizationStrategyVisitor;
import com.openshift.restclient.authorization.IRequest;
import com.openshift.restclient.authorization.TokenAuthorizationStrategy;
import com.openshift.restclient.authorization.URLConnectionRequest;
import com.openshift.restclient.utils.Base64Coder;

import java.io.*;
import java.net.URL;
import java.net.URLConnection;


public class App {
	private BasicAuthorizationStrategy strategy;
	private URLConnection connection;
	private IRequest request;
	private IAuthorizationStrategyVisitor visitor;

	public static void main(String[] args) {
		System.out.println("Hello World!");
		String usernamePassword = String.format("Basic %s", Base64Coder.encode("aUserName:aPassword"));
		App app = new App();
		app.request = app.withCredential("u", "p");
		app.visitor = new App.AuthStrategyVistor();
	}

	private static class AuthStrategyVistor implements IAuthorizationStrategyVisitor {

		@Override
		public void visit(BasicAuthorizationStrategy strategy) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void visit(TokenAuthorizationStrategy tokenAuthorizationStrategy) {
			// TODO Auto-generated method stub
			
		}
		
	}

	private void login() {
		strategy = new BasicAuthorizationStrategy("aUserName", "aPassword", null);
		strategy.authorize(request);
		strategy.accept(visitor);
	}

	private URLConnection withConnection(String theUrl) {
		URLConnection urlConnection = null;
		try {
			// create a url object
			URL url = new URL(theUrl);

			// create a urlconnection object
		    urlConnection = url.openConnection();
		} catch (IOException ex) {
			ex.printStackTrace();
		} finally {
			return urlConnection;
		}
	}

	private IRequest withCredential(String username, String password) {
		URLConnectionRequest req = new URLConnectionRequest(connection);
		req.setProperty(username, password);
		return req;
	}
}
