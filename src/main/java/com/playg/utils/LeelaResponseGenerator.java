package main.java.com.playg.utils;

import main.java.com.playg.interface_adapters.leela.LeelaInjuryImpl;

import java.util.List;

import static java.util.Arrays.asList;
import static main.java.com.playg.utils.Constants.*;

public class LeelaResponseGenerator {
    
    public static List<LeelaInjuryImpl> buildLeelaInjuriesResponseWithOnlyFnols() {
        return asList(
                buildLeelaInjury(FNOL_Y, Constants.BP_ARM, asList(Constants.INJ_BRUISE, Constants.INJ_CUT, Constants.INJ_SCRATCH)),
                buildLeelaInjury(FNOL_Y, Constants.BP_EAR, asList(Constants.INJ_TEAR, Constants.INJ_BREAK, Constants.INJ_SPRAIN)));
    }
    
    public static List<LeelaInjuryImpl> buildLeelaInjuriesResponseWithMixedFnols() {
        return asList(
                buildLeelaInjury(FNOL_Y, Constants.BP_ARM, asList(Constants.INJ_BRUISE, Constants.INJ_CUT, Constants.INJ_SCRATCH)),
                buildLeelaInjury(FNOL_N, Constants.BP_EAR, asList(Constants.INJ_TEAR, Constants.INJ_BREAK, Constants.INJ_SPRAIN)),
                buildLeelaInjury(FNOL_N, Constants.BP_ARM, asList(Constants.INJ_TEAR, Constants.INJ_BREAK, Constants.INJ_SPRAIN)));
    }
    
    public static LeelaInjuryImpl buildLeelaInjury(final String fnol, final String bodyPart, final List<String> injuries) {
        return LeelaInjuryImpl.builder()
                .fnol(fnol)
                .leelaBodyPart(bodyPart)
                .leelaInjuries(injuries)
                .build();
    }
}