package com.Stavrou.doctors.repository;

import com.Stavrou.doctors.model.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface DoctorRepository extends JpaRepository<Doctor, Long> {

    List<Doctor> findBySpeciality(String speciality);

}
