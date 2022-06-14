package exam.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import exam.entity1.user;


//@RepositoryRestResource(collectionResourceRel = "user1", path = "user")
public interface userRepository extends JpaRepository<user, Integer> {

  //List<user> findByLastName(@Param("name") String name);

}