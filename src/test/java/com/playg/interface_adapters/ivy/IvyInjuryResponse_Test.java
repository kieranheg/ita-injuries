package test.java.com.playg.interface_adapters.ivy;

import main.java.com.playg.interface_adapters.ivy.IvyInjuryResponse;
import org.junit.jupiter.api.Test;

import static main.java.com.playg.utils.Constants.*;
import static main.java.com.playg.utils.IvyResponseGenerator.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class IvyInjuryResponse_Test {
    
    @Test
    public void createIvyInjuryResponseWithMultiBodyPartAndMultiInjuries() {
        //given
        IvyInjuryResponse ivyInjuryResponse = IvyInjuryResponse.builder()
                .ivyInjuries(buildIvyInjuriesResponse())
                .build();
        //then
        assertEquals("IvyInjuryResponse", ivyInjuryResponse.toString());
        assertEquals(3, ivyInjuryResponse.getIvyInjuries().size());
        
        assertEquals(BP_ARM, ivyInjuryResponse.getIvyInjuries().get(0).getBodyPart());
        assertEquals(3, ivyInjuryResponse.getIvyInjuries().get(0).getInjuries().size());
        assertEquals(INJ_BRUISE, ivyInjuryResponse.getIvyInjuries().get(0).getInjuries().get(0));
        assertEquals(INJ_CUT, ivyInjuryResponse.getIvyInjuries().get(0).getInjuries().get(1));
        assertEquals(INJ_SCRATCH, ivyInjuryResponse.getIvyInjuries().get(0).getInjuries().get(2));
        
        assertEquals(BP_EAR, ivyInjuryResponse.getIvyInjuries().get(1).getBodyPart());
        assertEquals(3, ivyInjuryResponse.getIvyInjuries().get(1).getInjuries().size());
        assertEquals(INJ_TEAR, ivyInjuryResponse.getIvyInjuries().get(1).getInjuries().get(0));
        assertEquals(INJ_BREAK, ivyInjuryResponse.getIvyInjuries().get(1).getInjuries().get(1));
        assertEquals(INJ_SPRAIN, ivyInjuryResponse.getIvyInjuries().get(1).getInjuries().get(2));
        
        assertEquals(BP_ARM, ivyInjuryResponse.getIvyInjuries().get(2).getBodyPart());
        assertEquals(3, ivyInjuryResponse.getIvyInjuries().get(2).getInjuries().size());
        assertEquals(INJ_TEAR, ivyInjuryResponse.getIvyInjuries().get(2).getInjuries().get(0));
        assertEquals(INJ_BREAK, ivyInjuryResponse.getIvyInjuries().get(2).getInjuries().get(1));
        assertEquals(INJ_SPRAIN, ivyInjuryResponse.getIvyInjuries().get(2).getInjuries().get(2));
    }
}