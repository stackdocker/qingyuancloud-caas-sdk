package me.tom.openstack_keystone;

public final class KeystoneAdminCredential {
    public static String adminURL;
    public static String tenantName;
    public static String userName;
    public static String password;
    
    public static void init(
    		String adminURL, String tenantName, String userName, String password) {
    	KeystoneAdminCredential.adminURL = adminURL;	
    	KeystoneAdminCredential.tenantName = tenantName;
    	KeystoneAdminCredential.userName = userName;
    	KeystoneAdminCredential.password = password;
    }
}
