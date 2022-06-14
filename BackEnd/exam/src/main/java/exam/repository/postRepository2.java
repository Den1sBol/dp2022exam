package exam.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import exam.entity1.Post2;

//@RepositoryRestResource(collectionResourceRel = "user1", path = "user")
public interface postRepository2 extends JpaRepository<Post2, Integer> {

  //List<user> findByLastName(@Param("name") String name);

}