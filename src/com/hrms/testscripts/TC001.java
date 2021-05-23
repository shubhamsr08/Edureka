package com.hrms.testscripts;

import com.hrms.lib.General;

public class TC001 {
// Test Cases Steps
public static void main(String args[]) {
	General obj = new General();
	obj.openApplication();
	obj.login();
	obj.logout();
	obj.closeApplication();
	
	
}

}
