package test.java.com.playg.models;

import main.java.com.playg.models.leela.LeelaInjury;
import main.java.com.playg.models.leela.LeelaInjuryResponse;
import org.junit.jupiter.api.Test;

import java.util.List;

import static java.util.Arrays.asList;
import static org.junit.jupiter.api.Assertions.assertEquals;

class LeelaInjuryResponseTest {
    
    private static final String FNOL_Y = "Y";
    private static final String FNOL_N = "N";
    private static final String BODY_PART_100 = "100";
    private static final String BODY_PART_110 = "110";
    private static final String INJURY_131 = "131";
    private static final String INJURY_132 = "132";
    private static final String INJURY_133 = "133";
    private static final String INJURY_141 = "141";
    private static final String INJURY_142 = "142";
    private static final String INJURY_143 = "143";
    
    @Test
    public void createLeelaInjuryResponseWithMultiBodyPartAndMultiInjuries() {
        //given
        LeelaInjuryResponse leelaInjuryResponse = LeelaInjuryResponse.builder()
                .leelaInjuries(buildLeelaInjuries())
                .build();
        //then
        assertEquals("LeelaInjuryResponse", leelaInjuryResponse.toString());
        assertEquals(2, leelaInjuryResponse.getLeelaInjuries().size());
        
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
    }
    
    private List<LeelaInjury> buildLeelaInjuries() {
        return asList(
                buildLeelaInjury(FNOL_Y, BODY_PART_100, asList(INJURY_131, INJURY_132, INJURY_133)),
                buildLeelaInjury(FNOL_N, BODY_PART_110, asList(INJURY_141, INJURY_142, INJURY_143)));
    }
    
    private LeelaInjury buildLeelaInjury(final String fnol, final String bodyPart, final List<String> injuries) {
        return LeelaInjury.builder()
                .fnol(fnol)
                .leelaBodyPart(bodyPart)
                .leelaInjuries(injuries)
                .build();
    }
}