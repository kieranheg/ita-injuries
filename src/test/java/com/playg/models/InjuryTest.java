package test.java.com.playg.models;

import main.java.com.playg.models.Injury;
import main.java.com.playg.models.InjuryImpl;
import org.junit.jupiter.api.Test;

import java.util.List;

import static java.util.Arrays.asList;
import static org.junit.jupiter.api.Assertions.*;

class InjuryTest {
    
    @Test
    public void createInjuryWithSingleBodyPart() {
        //given
        String injuryType = "cut";
        List<String> bodyPart = asList("arm");
        //when
        Injury injury = new InjuryImpl(injuryType, bodyPart);
        //then
        assertEquals("cut", injury.getInjuryType());
        assertEquals("arm", injury.getBodyParts().get(0));
    }
    
    @Test
    public void createInjuryWithMultipleBodyParts() {
        //given
        String injuryType = "bruise";
        List<String> bodyPart = asList("arm", "ear", "nose");
        //when
        Injury injury = new InjuryImpl(injuryType, bodyPart);
        //then
        assertEquals("bruise", injury.getInjuryType());
        assertEquals("arm", injury.getBodyParts().get(0));
        assertEquals("ear", injury.getBodyParts().get(1));
        assertEquals("nose", injury.getBodyParts().get(2));
    }
    
}