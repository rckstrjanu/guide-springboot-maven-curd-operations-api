package guide.springboot.maven.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import guide.springboot.maven.model.Name;

@RestController
@RequestMapping("/CurdOperation")
public class SpringBootCurdOperationController {

	private static Map<String, String> map = new HashMap<String, String>();

	@GetMapping(value = "/getMessage/{id}")
	public String getMessage(@PathVariable(value = "id", required = true) String id) {

		if (map.size() >= Integer.valueOf(id)) {
			return map.get(id);
		}

		return "No Message found with the request index/ invalid param";
	}

	@PostMapping(value = "/updateMessage", consumes = MediaType.APPLICATION_JSON_VALUE)
	public String updateMessage(@RequestBody Name name) {

		if (null != name.getId() && map.size() >= Integer.valueOf(name.getId())) {
			String existingValue = map.get(name.getId());
			map.put(name.getId(), name.getName());
			return "Update the Value from: " + existingValue + " To: " + name.getName();
		}

		return "No Message found with the request index/ invalid param";
	}

	@PostMapping(value = "/addMessage", consumes = MediaType.APPLICATION_JSON_VALUE)
	public String addMessage(@RequestBody Name name) {

		if (map.size() > 0) {
			System.out.println("IF Loop");
			map.put(name.getId(), name.getName());
		} else {
			System.out.println("ELse Loop");
			map.put(name.getId(), name.getName());
		}

		return "Message : " + map.get(name.getId()) + " Added to cache (Map) successfully";
	}

}
