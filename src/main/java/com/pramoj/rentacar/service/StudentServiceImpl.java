/**
 * ============================
 * Author - Pramoj Kumararathna
 * On     - 2020-05-27
 * At     - 02:36
 * ============================
 */

package com.pramoj.rentacar.service;

import com.pramoj.rentacar.model.Student;
import com.pramoj.rentacar.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    StudentRepository studentRepository;

    @Override
    public Student save(Student student) {
        return studentRepository.save(student);
    }
}
