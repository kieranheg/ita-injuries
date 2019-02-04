package main.java.com.playg.utils;

import main.java.com.playg.models.leela.LeelaInjury;

import java.util.List;

import static java.util.Arrays.asList;
import static main.java.com.playg.utils.Constants.*;

public class LeelaResponseGenerator {
    
    public static List<LeelaInjury> buildLeelaInjuriesResponseWithOnlyFnols() {
        return asList(
                buildLeelaInjury(FNOL_Y, Constants.BP_ARM, asList(Constants.INJ_BRUISE, Constants.INJ_CUT, Constants.INJ_SCRATCH)),
                buildLeelaInjury(FNOL_Y, Constants.BP_EAR, asList(Constants.INJ_TEAR, Constants.INJ_BREAK, Constants.INJ_SPRAIN)));
    }
    
    public static List<LeelaInjury> buildLeelaInjuriesResponseWithMixedFnols() {
        return asList(
                buildLeelaInjury(FNOL_Y, Constants.BP_ARM, asList(Constants.INJ_BRUISE, Constants.INJ_CUT, Constants.INJ_SCRATCH)),
                buildLeelaInjury(FNOL_N, Constants.BP_EAR, asList(Constants.INJ_TEAR, Constants.INJ_BREAK, Constants.INJ_SPRAIN)),
                buildLeelaInjury(FNOL_N, Constants.BP_ARM, asList(Constants.INJ_TEAR, Constants.INJ_BREAK, Constants.INJ_SPRAIN)));
    }
    
    public static LeelaInjury buildLeelaInjury(final String fnol, final String bodyPart, final List<String> injuries) {
        return LeelaInjury.builder()
                .fnol(fnol)
                .leelaBodyPart(bodyPart)
                .leelaInjuries(injuries)
                .build();
    }
}