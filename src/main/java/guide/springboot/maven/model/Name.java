package guide.springboot.maven.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Name {

	@JsonProperty("id")
	private String id;
	@JsonProperty("name")
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
}
