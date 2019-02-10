package test.java.com.playg.models;

import main.java.com.playg.models.ita.entity.InjuryEntity;
import main.java.com.playg.models.ita.entity.InjuryEntityImpl;
import org.junit.jupiter.api.Test;

import static java.util.Arrays.asList;
import static main.java.com.playg.utils.Constants.*;
import static org.junit.jupiter.api.Assertions.*;

class InjuryEntity_Test {
    
    @Test
    public void createInjuryWithSingleBodyPart() {
        //given
        InjuryEntity injuryEntity = InjuryEntityImpl.builder()
                .fnol(true)
                .injuryType(INJ_CUT)
                .bodyParts(asList(BP_ARM))
                .build();
        //then
        assertEquals("InjuryEntityImpl", injuryEntity.toString());
        assertTrue(injuryEntity.isFnol());
        assertEquals(INJ_CUT, injuryEntity.getInjuryType());
        assertEquals(BP_ARM, injuryEntity.getBodyParts().get(0));
    }
    
    @Test
    public void createInjuryWithMultipleBodyParts() {
        //given
        InjuryEntity injuryEntity = InjuryEntityImpl.builder()
                .fnol(true)
                .injuryType(INJ_BRUISE)
                .bodyParts(asList(BP_ARM, BP_EAR, BP_NOSE))
                .build();
        //then
        assertEquals("InjuryEntityImpl", injuryEntity.toString());
        assertTrue(injuryEntity.isFnol());
        assertEquals(INJ_BRUISE, injuryEntity.getInjuryType());
        assertEquals(BP_ARM, injuryEntity.getBodyParts().get(0));
        assertEquals(BP_EAR, injuryEntity.getBodyParts().get(1));
        assertEquals(BP_NOSE, injuryEntity.getBodyParts().get(2));
    }
    
}