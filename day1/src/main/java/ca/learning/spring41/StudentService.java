package ca.learning.spring41;

import java.util.List;

/**
 * @author patria.lukman
 */
public class StudentService {

  private StudentFinder finder;



  public StudentService() {
    this.finder = new StudentFinderDBImpl();
  }

  public List<Student> findStudents(){

    return finder.findStudents();

  }

}
