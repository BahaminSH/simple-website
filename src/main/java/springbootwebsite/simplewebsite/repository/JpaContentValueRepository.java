package springbootwebsite.simplewebsite.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import springbootwebsite.simplewebsite.entity.ContentValue;

@Repository
public interface JpaContentValueRepository extends JpaRepository<ContentValue, Integer> {

    @Query("SELECT c FROM  contentvalue c where c.user_id = :userId and c.content_type = :type and c.content_index =1")
    ContentValue retrieveByUserAndType(@Param("userId") Integer userId, @Param("type") Integer type);

}
