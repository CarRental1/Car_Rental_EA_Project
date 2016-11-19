package ea.project.repository;

import org.springframework.data.repository.CrudRepository;

import ea.project.domain.Category;

public interface CategoryRepository extends CrudRepository<Category, Integer>{

}
