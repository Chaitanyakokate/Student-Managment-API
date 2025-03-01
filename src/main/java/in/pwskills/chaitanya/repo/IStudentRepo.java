package in.pwskills.chaitanya.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.pwskills.chaitanya.model.Student;

public interface IStudentRepo extends JpaRepository<Student, Integer>{

}
