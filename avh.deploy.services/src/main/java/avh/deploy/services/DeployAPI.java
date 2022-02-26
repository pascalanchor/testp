package avh.deploy.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import avh.deploy.data.Person;

@RestController
public class DeployAPI {
	@Autowired
	private PersonRep rep;
	
	@GetMapping("/deploy/api/user/find")
	public Person findUser(@RequestParam(value="email") String email) {
		List<Person> res = rep.findByEmail(email);
		if ((res != null) && (res.size() > 0))
			return res.get(0);
		return null;
	}
}
