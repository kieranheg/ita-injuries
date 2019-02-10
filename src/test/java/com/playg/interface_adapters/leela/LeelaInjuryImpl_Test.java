package test.java.com.playg.interface_adapters.leela;

import main.java.com.playg.interface_adapters.leela.LeelaInjuryImpl;
import org.junit.jupiter.api.Test;

import static java.util.Arrays.asList;
import static main.java.com.playg.utils.Constants.*;
import static main.java.com.playg.utils.LeelaResponseGenerator.buildLeelaInjury;
import static org.junit.jupiter.api.Assertions.assertEquals;

class LeelaInjuryImpl_Test {
    
    @Test
    public void createLeelaInjury() {
        LeelaInjuryImpl leelaInjury =
                buildLeelaInjury(FNOL_Y, BP_ARM, asList(INJ_BRUISE, INJ_CUT, INJ_SCRATCH));
    
        assertEquals(3, leelaInjury.getInjuries().size());
        assertEquals(FNOL_Y, leelaInjury.getFnol());
        assertEquals(BP_ARM, leelaInjury.getBodyPart());
        assertEquals(INJ_BRUISE, leelaInjury.getInjuries().get(0));
        assertEquals(INJ_CUT, leelaInjury.getInjuries().get(1));
        assertEquals(INJ_SCRATCH, leelaInjury.getInjuries().get(2));
    }
    
}