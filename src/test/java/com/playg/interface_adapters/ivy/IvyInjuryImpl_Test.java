package test.java.com.playg.interface_adapters.ivy;

import main.java.com.playg.interface_adapters.ivy.IvyInjuryImpl;
import org.junit.jupiter.api.Test;

import static java.util.Arrays.asList;
import static main.java.com.playg.utils.Constants.*;
import static main.java.com.playg.utils.IvyResponseGenerator.buildIvyInjury;
import static org.junit.jupiter.api.Assertions.assertEquals;

class IvyInjuryImpl_Test {
    
    @Test
    public void createIvyInjury() {
        IvyInjuryImpl ivyInjury =
                buildIvyInjury(BP_ARM, asList(INJ_BRUISE, INJ_CUT, INJ_SCRATCH));
    
        assertEquals(3, ivyInjury.getInjuries().size());
        assertEquals(BP_ARM, ivyInjury.getBodyPart());
        assertEquals(INJ_BRUISE, ivyInjury.getInjuries().get(0));
        assertEquals(INJ_CUT, ivyInjury.getInjuries().get(1));
        assertEquals(INJ_SCRATCH, ivyInjury.getInjuries().get(2));
    }
    
}