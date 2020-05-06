package ie.gmit;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class StudentTest {

    @Test
    void testConstructor()
    {
        Students myStudents = new Students("Paul","caleb96@gmail.com");
        assertEquals("Paul",myStudents.getName());
    }

    @Test
    void testConstructorNoName()
    {
        //Students myStudents = new Students("Paul","caleb96@gmail.com");
        assertThrows(IllegalArgumentException.class,()-> new Students("","caleb96@gmail.com"));
    }

    @Test
    void testConstructorNoEmail()
    {
        assertThrows(IllegalArgumentException.class,()-> new Students("caleb",""));
    }

}
