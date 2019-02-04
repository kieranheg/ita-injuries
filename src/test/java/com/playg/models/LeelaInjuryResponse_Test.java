package test.java.com.playg.models;

import main.java.com.playg.models.leela.LeelaInjuryResponse;
import org.junit.jupiter.api.Test;

import static main.java.com.playg.utils.Constants.*;
import static main.java.com.playg.utils.LeelaResponseGenerator.buildLeelaInjuriesResponseWithMixedFnols;
import static main.java.com.playg.utils.LeelaResponseGenerator.buildLeelaInjuriesResponseWithOnlyFnols;
import static org.junit.jupiter.api.Assertions.assertEquals;

class LeelaInjuryResponse_Test {
    
    @Test
    public void createLeelaInjuryResponseWithMultiBodyPartAndMultiInjuriesAndOnlyFnols() {
        //given
        LeelaInjuryResponse leelaInjuryResponse = LeelaInjuryResponse.builder()
                .leelaInjuries(buildLeelaInjuriesResponseWithOnlyFnols())
                .build();
        //then
        assertEquals("LeelaInjuryResponse", leelaInjuryResponse.toString());
        assertEquals(2, leelaInjuryResponse.getLeelaInjuries().size());
        
        assertEquals(FNOL_Y, leelaInjuryResponse.getLeelaInjuries().get(0).getFnol());
        assertEquals(BP_ARM, leelaInjuryResponse.getLeelaInjuries().get(0).getLeelaBodyPart());
        assertEquals(3, leelaInjuryResponse.getLeelaInjuries().get(0).getLeelaInjuries().size());
        assertEquals(INJ_BRUISE, leelaInjuryResponse.getLeelaInjuries().get(0).getLeelaInjuries().get(0));
        assertEquals(INJ_CUT, leelaInjuryResponse.getLeelaInjuries().get(0).getLeelaInjuries().get(1));
        assertEquals(INJ_SCRATCH, leelaInjuryResponse.getLeelaInjuries().get(0).getLeelaInjuries().get(2));
        
        assertEquals(FNOL_Y, leelaInjuryResponse.getLeelaInjuries().get(1).getFnol());
        assertEquals(BP_EAR, leelaInjuryResponse.getLeelaInjuries().get(1).getLeelaBodyPart());
        assertEquals(3, leelaInjuryResponse.getLeelaInjuries().get(1).getLeelaInjuries().size());
        assertEquals(INJ_TEAR, leelaInjuryResponse.getLeelaInjuries().get(1).getLeelaInjuries().get(0));
        assertEquals(INJ_BREAK, leelaInjuryResponse.getLeelaInjuries().get(1).getLeelaInjuries().get(1));
        assertEquals(INJ_SPRAIN, leelaInjuryResponse.getLeelaInjuries().get(1).getLeelaInjuries().get(2));
    }
    
    @Test
    public void createLeelaInjuryResponseWithMultiBodyPartAndMultiInjuriesAndMixedFnols() {
        //given
        LeelaInjuryResponse leelaInjuryResponse = LeelaInjuryResponse.builder()
                .leelaInjuries(buildLeelaInjuriesResponseWithMixedFnols())
                .build();
        //then
        assertEquals("LeelaInjuryResponse", leelaInjuryResponse.toString());
        assertEquals(3, leelaInjuryResponse.getLeelaInjuries().size());
        
        assertEquals(FNOL_Y, leelaInjuryResponse.getLeelaInjuries().get(0).getFnol());
        assertEquals(BP_ARM, leelaInjuryResponse.getLeelaInjuries().get(0).getLeelaBodyPart());
        assertEquals(3, leelaInjuryResponse.getLeelaInjuries().get(0).getLeelaInjuries().size());
        assertEquals(INJ_BRUISE, leelaInjuryResponse.getLeelaInjuries().get(0).getLeelaInjuries().get(0));
        assertEquals(INJ_CUT, leelaInjuryResponse.getLeelaInjuries().get(0).getLeelaInjuries().get(1));
        assertEquals(INJ_SCRATCH, leelaInjuryResponse.getLeelaInjuries().get(0).getLeelaInjuries().get(2));
        
        assertEquals(FNOL_N, leelaInjuryResponse.getLeelaInjuries().get(1).getFnol());
        assertEquals(BP_EAR, leelaInjuryResponse.getLeelaInjuries().get(1).getLeelaBodyPart());
        assertEquals(3, leelaInjuryResponse.getLeelaInjuries().get(1).getLeelaInjuries().size());
        assertEquals(INJ_TEAR, leelaInjuryResponse.getLeelaInjuries().get(1).getLeelaInjuries().get(0));
        assertEquals(INJ_BREAK, leelaInjuryResponse.getLeelaInjuries().get(1).getLeelaInjuries().get(1));
        assertEquals(INJ_SPRAIN, leelaInjuryResponse.getLeelaInjuries().get(1).getLeelaInjuries().get(2));
        
        assertEquals(FNOL_N, leelaInjuryResponse.getLeelaInjuries().get(2).getFnol());
        assertEquals(BP_ARM, leelaInjuryResponse.getLeelaInjuries().get(2).getLeelaBodyPart());
        assertEquals(3, leelaInjuryResponse.getLeelaInjuries().get(2).getLeelaInjuries().size());
        assertEquals(INJ_TEAR, leelaInjuryResponse.getLeelaInjuries().get(2).getLeelaInjuries().get(0));
        assertEquals(INJ_BREAK, leelaInjuryResponse.getLeelaInjuries().get(2).getLeelaInjuries().get(1));
        assertEquals(INJ_SPRAIN, leelaInjuryResponse.getLeelaInjuries().get(2).getLeelaInjuries().get(2));
    }
    
}