package com.qingyuanos.openshift.client;

import com.openshift.restclient.authorization.BasicAuthorizationStrategy;
import com.openshift.restclient.authorization.IAuthorizationStrategyVisitor;
import com.openshift.restclient.authorization.IRequest;
import com.openshift.restclient.authorization.TokenAuthorizationStrategy;
import com.openshift.restclient.utils.Base64Coder;

/**
 * Hello world!
 *
 */
import java.net.URLConnection;

public class App 
{
	private BasicAuthorizationStrategy strategy;
	private URLConnection connection;
	private IRequest request;
	private IAuthorizationStrategyVisitor visitor
	
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    	String usernamePassword =  String.format("Basic %s", Base64Coder.encode("aUserName:aPassword"));
        request = withCredential("u", "p")
        vistor = new AuthStrategyVistor()
    }
	
	private static class AuthStrategyVistor implents IAuthorizationStrategyVisitor {
		@override
		void visit(BasicAuthorizationStrategy strategy) {
			
		}
		
		void visit(TokenAuthorizationStrategy tokenAuthorizationStrategy) {
			
		}
	}
    
    private void login() {
    	strategy = new BasicAuthorizationStrategy("aUserName", "aPassword",null);
		strategy.authorize(request);
		strategy.accept(vistor)
    }
    
    private URLConnection withConnection(String theUrl) {
        // create a url object
        URL url = new URL(theUrl);
   
        // create a urlconnection object
        URLConnection urlConnection = url.openConnection();    	
    }
    
    private IRequest withCredential(String username, String password) {
    	URLConnectionRequest req = new URLConnectionRequest(connection)
    	req.setProperty(username, password)
    	return req
    }
}
