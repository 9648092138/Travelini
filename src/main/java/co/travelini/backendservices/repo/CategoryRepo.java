package co.travelini.backendservices.repo;

import co.travelini.backendservices.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CategoryRepo extends JpaRepository<Category, Long> {

    Category  findByCategoryId(long categoryId);

    List<Category> findByInterestId(long interestId);
}
