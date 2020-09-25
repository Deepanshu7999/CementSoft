package com.Babbar.JaiBhole;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.Babbar.Controller.CementController;

@SpringBootApplication
public class JaiBholeApplication {

	
	
	public static void main(String[] args) {
		SpringApplication.run(JaiBholeApplication.class, args);
	}
	
//	public void run(String... args) throws Exception {
//		try{
//			CementController cementController=new CementController();
//			cementController.getTotal("Bharat Cement");
//		}catch(Exception exception){
//			System.out.println("Error");
//		}
//	}

}
