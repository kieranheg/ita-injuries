package main.java.com.playg.utils;

import main.java.com.playg.interface_adapters.ivy.IvyInjuryImpl;

import java.util.List;

import static java.util.Arrays.asList;

public class IvyResponseGenerator {
    
    private IvyResponseGenerator() {}
    
    public static List<IvyInjuryImpl> buildIvyInjuriesResponse() {
        return asList(
                buildIvyInjury(Constants.BP_ARM, asList(Constants.INJ_BRUISE, Constants.INJ_CUT, Constants.INJ_SCRATCH)),
                buildIvyInjury(Constants.BP_EAR, asList(Constants.INJ_TEAR, Constants.INJ_BREAK, Constants.INJ_SPRAIN)),
                buildIvyInjury(Constants.BP_ARM, asList(Constants.INJ_TEAR, Constants.INJ_BREAK, Constants.INJ_SPRAIN)));
    }
    
    public static IvyInjuryImpl buildIvyInjury(final String bodyPart, final List<String> injuries) {
        return IvyInjuryImpl.builder()
                .ivyBodyPart(bodyPart)
                .ivyInjuries(injuries)
                .build();
    }
}