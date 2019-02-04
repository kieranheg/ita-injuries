package test.java.com.playg.models;

import main.java.com.playg.models.ita.Injury;
import main.java.com.playg.models.ita.InjuryImpl;
import org.junit.jupiter.api.Test;

import static java.util.Arrays.asList;
import static main.java.com.playg.utils.Constants.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class Injury_Test {
    
    @Test
    public void createInjuryWithSingleBodyPart() {
        //given
        Injury injury = InjuryImpl.builder()
                .injuryType(INJ_CUT)
                .bodyParts(asList(BP_ARM))
                .build();
        //then
        assertEquals("InjuryImpl", injury.toString());
        assertEquals(INJ_CUT, injury.getInjuryType());
        assertEquals(BP_ARM, injury.getBodyParts().get(0));
    }
    
    @Test
    public void createInjuryWithMultipleBodyParts() {
        //given
        Injury injury = InjuryImpl.builder()
                .injuryType(INJ_BRUISE)
                .bodyParts(asList(BP_ARM, BP_EAR, BP_NOSE))
                .build();
        //then
        assertEquals("InjuryImpl", injury.toString());
        assertEquals(INJ_BRUISE, injury.getInjuryType());
        assertEquals(BP_ARM, injury.getBodyParts().get(0));
        assertEquals(BP_EAR, injury.getBodyParts().get(1));
        assertEquals(BP_NOSE, injury.getBodyParts().get(2));
    }
    
}