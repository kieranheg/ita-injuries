package test.java.com.playg.models;

import main.java.com.playg.models.ita.Injury;
import main.java.com.playg.models.ita.InjuryImpl;
import org.junit.jupiter.api.Test;

import java.util.List;

import static java.util.Arrays.asList;
import static main.java.com.playg.utils.Constants.*;
import static org.junit.jupiter.api.Assertions.*;

class Injury_Test {
    
    @Test
    public void createInjuryWithSingleBodyPart() {
        //given
        String injuryType = INJ_CUT;
        List<String> bodyPart = asList(BP_ARM);
        //when
        Injury injury = new InjuryImpl(injuryType, bodyPart);
        //then
        assertEquals(INJ_CUT, injury.getInjuryType());
        assertEquals(BP_ARM, injury.getBodyParts().get(0));
    }
    
    @Test
    public void createInjuryWithMultipleBodyParts() {
        //given
        String injuryType = INJ_BRUISE;
        List<String> bodyPart = asList(BP_ARM, BP_EAR, BP_NOSE);
        //when
        Injury injury = new InjuryImpl(injuryType, bodyPart);
        //then
        assertEquals(INJ_BRUISE, injury.getInjuryType());
        assertEquals(BP_ARM, injury.getBodyParts().get(0));
        assertEquals(BP_EAR, injury.getBodyParts().get(1));
        assertEquals(BP_NOSE, injury.getBodyParts().get(2));
    }
    
}