/**
 * ============================
 * Author - Pramoj Kumararathna
 * On     - 2020-05-27
 * At     - 02:39
 * ============================
 */

package com.pramoj.rentacar.repository;

import com.pramoj.rentacar.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Integer> {

//    Student save(Student student);
}
