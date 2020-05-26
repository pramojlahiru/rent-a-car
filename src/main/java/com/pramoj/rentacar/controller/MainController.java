/**
 * ============================
 * Author - Pramoj Kumararathna
 * On     - 2020-05-25
 * At     - 04:58
 * ============================
 */

package com.pramoj.rentacar.controller;

import com.pramoj.rentacar.model.Student;
import com.pramoj.rentacar.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @Autowired
    StudentService studentService;

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String greeting1() {
        return "GET ::: Hello Pramoj !";
    }

    @RequestMapping(value = "/hello", method = RequestMethod.POST)
    public String greeting2() {
        return "POST ::: Hello Pramoj !";
    }

    @RequestMapping(value = "/student", method = RequestMethod.POST)
    public Student save(@RequestBody Student student) {
        return studentService.save(student);
    }
}
