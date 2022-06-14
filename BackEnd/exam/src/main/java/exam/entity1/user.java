package exam.entity1;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="user1")
public class user {
	@Id
	@GeneratedValue
	int id;
	String name1;
	int weight;
	
	
	public user() {
		
	}
	
	
	public user(int id, String name, int age) {
		this.id = id;
		this.name1 = name;
		this.weight = age;
	}


	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name1;
	}
	public void setName(String name) {
		this.name1 = name;
	}
	public int getAge() {
		return weight;
	}
	public void setAge(int weight) {
		this.weight = weight;
	}


	@Override
	public String toString() {
		return "{\"id\":"+id+",\"name\":\""+name1+"\", \"weight\":"+weight+"}";
	}
	

}