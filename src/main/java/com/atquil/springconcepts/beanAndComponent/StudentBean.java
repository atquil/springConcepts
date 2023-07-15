package com.atquil.springconcepts.beanAndComponent;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Component
public class StudentBean {
}

@Service
class StudentService{

}

@Repository
interface StudentRepository{

}

@Controller
class StudentController{

}