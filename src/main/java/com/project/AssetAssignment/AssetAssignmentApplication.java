package com.project.AssetAssignment;

import com.project.AssetAssignment.service.AssetServices;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class AssetAssignmentApplication {

	public static void main(String[] args) {
		ApplicationContext context=SpringApplication.run(AssetAssignmentApplication.class, args);
		AssetServices asset_services=context.getBean(AssetServices.class);



	}

}
