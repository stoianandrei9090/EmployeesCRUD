package ro.andreistoian.EmployeesCRUD.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ro.andreistoian.EmployeesCRUD.models.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
