package coms.sourav.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import coms.sourav.model.Student;

@Repository
public interface StudentRepo extends JpaRepository<Student, Integer>{

}
