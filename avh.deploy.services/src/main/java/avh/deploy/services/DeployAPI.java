package avh.deploy.services;

import java.util.Date;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import avh.deploy.model.Person;

@RestController
public class DeployAPI {
	
	@GetMapping("/deploy/api/user/find")
	public Person findUser(@RequestParam(value="email") String email) {
		Person res = new Person();
		res.setEmail(email);
		res.setFirstname("Hassan");
		res.setGender("Male");
		res.setJoiningDate(new Date());
		res.setLastname("Esper");
		res.setPhone("+971 56 130 9362");
		return res;
	}
}
