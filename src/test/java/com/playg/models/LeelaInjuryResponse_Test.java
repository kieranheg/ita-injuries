package test.java.com.playg.models;

import main.java.com.playg.models.leela.LeelaInjuryResponse;
import org.junit.jupiter.api.Test;

import static main.java.com.playg.utils.Constants.*;
import static main.java.com.playg.utils.LeelaResponseGenerator.buildLeelaInjuries;
import static org.junit.jupiter.api.Assertions.assertEquals;

class LeelaInjuryResponse_Test {
    
    @Test
    public void createLeelaInjuryResponseWithMultiBodyPartAndMultiInjuries() {
        //given
        LeelaInjuryResponse leelaInjuryResponse = LeelaInjuryResponse.builder()
                .leelaInjuries(buildLeelaInjuries())
                .build();
        //then
        assertEquals("LeelaInjuryResponse", leelaInjuryResponse.toString());
        assertEquals(3, leelaInjuryResponse.getLeelaInjuries().size());
        
        assertEquals(FNOL_Y, leelaInjuryResponse.getLeelaInjuries().get(0).getFnol());
        assertEquals(BODY_PART_100, leelaInjuryResponse.getLeelaInjuries().get(0).getLeelaBodyPart());
        assertEquals(3, leelaInjuryResponse.getLeelaInjuries().get(0).getLeelaInjuries().size());
        assertEquals(INJURY_131, leelaInjuryResponse.getLeelaInjuries().get(0).getLeelaInjuries().get(0));
        assertEquals(INJURY_132, leelaInjuryResponse.getLeelaInjuries().get(0).getLeelaInjuries().get(1));
        assertEquals(INJURY_133, leelaInjuryResponse.getLeelaInjuries().get(0).getLeelaInjuries().get(2));
  
        assertEquals(FNOL_N, leelaInjuryResponse.getLeelaInjuries().get(1).getFnol());
        assertEquals(BODY_PART_110, leelaInjuryResponse.getLeelaInjuries().get(1).getLeelaBodyPart());
        assertEquals(3, leelaInjuryResponse.getLeelaInjuries().get(1).getLeelaInjuries().size());
        assertEquals(INJURY_141, leelaInjuryResponse.getLeelaInjuries().get(1).getLeelaInjuries().get(0));
        assertEquals(INJURY_142, leelaInjuryResponse.getLeelaInjuries().get(1).getLeelaInjuries().get(1));
        assertEquals(INJURY_143, leelaInjuryResponse.getLeelaInjuries().get(1).getLeelaInjuries().get(2));
        
        assertEquals(FNOL_N, leelaInjuryResponse.getLeelaInjuries().get(2).getFnol());
        assertEquals(BODY_PART_100, leelaInjuryResponse.getLeelaInjuries().get(2).getLeelaBodyPart());
        assertEquals(3, leelaInjuryResponse.getLeelaInjuries().get(2).getLeelaInjuries().size());
        assertEquals(INJURY_141, leelaInjuryResponse.getLeelaInjuries().get(2).getLeelaInjuries().get(0));
        assertEquals(INJURY_142, leelaInjuryResponse.getLeelaInjuries().get(2).getLeelaInjuries().get(1));
        assertEquals(INJURY_143, leelaInjuryResponse.getLeelaInjuries().get(2).getLeelaInjuries().get(2));
    }

}