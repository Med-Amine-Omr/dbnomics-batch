package com.amineomrani.dbnomics;

import org.springframework.boot.SpringApplication;

public class TestDbnomicsBatchApplication {

	public static void main(String[] args) {
		SpringApplication.from(DbnomicsBatchApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
