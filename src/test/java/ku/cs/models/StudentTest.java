package ku.cs.models;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    Student s1;

    @BeforeEach
    void init(){
        s1 = new Student("61xxxxx", "Pete");
    }
    @Test
    void testAddScore(){
        Student s1 = new Student("61xxxxx", "Pete" );
        s1.addScore(45.15);
        assertEquals(45.15, s1.getScore());

    }
    @Test
    @DisplayName("ทดสอบการคิดเกรด")
    void testCalculateGrade(){
        Student s1 = new Student("61xxxxx", "Pete");
        s1.addScore(60.8);
        assertEquals(60.8, s1.getScore());

    }
    @Test
    @DisplayName(("ทดสอบการเชค ID"))
    void testisID(){
        String id = s1.getId();
        assertTrue(s1.isId(id));
    }

    @Test
    @DisplayName("ทดสอบการเปลี่ยนชื่อ")
    void testChangeName(){
        s1.changeName("Poodit");
        assertEquals("Poodit", s1.getName());
    }

    @Test
    @DisplayName("ทดสอบ toString")
    void testToString(){
        Student s1 = new Student("61xxxxx", "Pete", 45.15);

        String expected = "{id: '61xxxxx', name: 'Pete', score: 45.15}";
        assertEquals(expected, s1.toString());

    }

    @Test
    @DisplayName("ทดสอบ getName")
    void testGetName(){
        String name = s1.getName();
        assertEquals(name, s1.getName());
    }

    @Test
    @DisplayName("ทดสอบ getID")
    void testGetID(){
        String id = s1.getId();
        assertEquals(id, s1.getId());
    }

    @Test
    @DisplayName("ทดสอบ getScore")
    void testGetScore(){
        double score = s1.getScore();
        assertEquals(score, s1.getScore());
    }

}