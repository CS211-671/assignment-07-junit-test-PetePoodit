package ku.cs.models;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class StudentListTest {

    StudentList s2;
    StudentList s3;

    @BeforeEach
    void init(){
        s2 = new StudentList();
        s3 = new StudentList();
    }

    @Test
    void testAddNewStudent(){
        s2.addNewStudent("62xxxxx", "Mark", 85.5);
    }


    @Test
    @DisplayName("ทดสอบหา ID")
    void testFindStudentById(){
        s2.addNewStudent("62xxxxx", "Mark");
        assertEquals("Mark", s2.findStudentById("62xxxxx").getName());
    }

    @Test
    @DisplayName("ทดสอบ givescore")
    void testGiveScoretoID(){
        s2.addNewStudent("62xxxxx", "Mark");
        s2.giveScoreToId("62xxxxx", 50);
        assertEquals(50, s2.findStudentById("62xxxxx").getScore());
    }



}
