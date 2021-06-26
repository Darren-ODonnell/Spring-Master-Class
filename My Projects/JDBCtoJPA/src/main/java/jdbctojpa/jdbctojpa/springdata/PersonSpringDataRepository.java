package jdbctojpa.jdbctojpa.springdata;

import jdbctojpa.jdbctojpa.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonSpringDataRepository extends JpaRepository<Person, Integer> {
}
