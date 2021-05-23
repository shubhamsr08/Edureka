package com.hrms.lib;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class General extends Global{
//Functions/Methods
	public void openApplication() {	
		System.setProperty("webdriver.gecko.driver", "C:\\webdrivers\\geckodriver.exe");	
		driver = new FirefoxDriver();	
		driver.navigate().to(url);	
		System.out.println("Application Opened");	
		}	
		public void closeApplication() {	
			
		driver.close();	
			System.out.println("Application Closed");
		}	
		public void login() {	
		driver.findElement(By.name(txt_loginname)).sendKeys(un);	
		driver.findElement(By.name(txt_password)).sendKeys(pw);	
		driver.findElement(By.name(btn_login)).click();	
		System.out.println("Login Completed");	
			
		}	
		public void logout() {	
		driver.findElement(By.id("welcome")).click();	
			System.out.println("Logout Completed");
		}	
		public void addEmp() {	
			System.out.println("Add new Emp");
		}	
			
		public void delEmp() {	
			System.out.println("Delete Emp");
			
			
		}	
		}	



