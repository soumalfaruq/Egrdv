package com.api.erdv;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.api.erdv.repository.RoleRepository;

@SpringBootApplication
public class ErdvApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(ErdvApplication.class, args);
	}
	@Autowired
	RoleRepository role;


	@Override
	public void run(String... args) throws Exception {
		//role.deleteAll();
//role.save(new Role(RoleEnum.ROLE_USER));
//role.save(new Role(RoleEnum.ROLE_CLIENT));
//		role.save(new Role("ROLE_ADMIN"));
//role.save(new Role(RoleEnum.ROLE_PROSPECT));
	//for (int i = 0; i < role.findAll().size(); i++) {
		//	System.out.println(role.findAll().get(i).getName());
		//}

	}

	

}
