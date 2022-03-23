package site.metacoding.test220323.domain.post;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

// Repository는 무조건 interface로 한다.
public interface PostRepository extends JpaRepository<BoardTbl, Integer> {

    @Query(value="SELECT * FROM boardTbl WHERE title like %:keyword%", nativeQuery=true)
List<BoardTbl> mSearch(@Param("keyword") String keyword);
}