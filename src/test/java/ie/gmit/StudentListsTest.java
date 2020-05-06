package ie.gmit;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class StudentListsTest {
    Students myStudent;
    StudentsList myList;

    @BeforeEach
    void setup()
    {
        myStudent = new Students("caleb","caleb@gmit");
        myList = new StudentsList();
    }
    @Test
    void testAddStudent()
    {
        myList.addStudent(myStudent);
        assertEquals(1,myList.getSize());
    }
    @Test
    void testFindByNameStudent()
    {
        myList.addStudent(myStudent);
        assertEquals(myStudent, myList.findByName("caleb"));
    }
}
