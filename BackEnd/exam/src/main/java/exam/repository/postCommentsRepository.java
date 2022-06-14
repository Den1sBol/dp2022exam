package exam.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import exam.entity1.PostComment2;

//@RepositoryRestResource(collectionResourceRel = "user1", path = "user")
public interface postCommentsRepository extends JpaRepository<PostComment2, Long> {

  //List<user> findByLastName(@Param("name") String name);

}