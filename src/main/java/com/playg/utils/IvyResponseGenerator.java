package main.java.com.playg.utils;

import main.java.com.playg.models.ivy.IvyInjury;

import java.util.List;

import static java.util.Arrays.asList;

public class IvyResponseGenerator {
    
    public static List<IvyInjury> buildIvyInjuriesResponse() {
        return asList(
                buildIvyInjury(Constants.BP_ARM, asList(Constants.INJ_BRUISE, Constants.INJ_CUT, Constants.INJ_SCRATCH)),
                buildIvyInjury(Constants.BP_EAR, asList(Constants.INJ_TEAR, Constants.INJ_BREAK, Constants.INJ_SPRAIN)),
                buildIvyInjury(Constants.BP_ARM, asList(Constants.INJ_TEAR, Constants.INJ_BREAK, Constants.INJ_SPRAIN)));
    }
    
    public static IvyInjury buildIvyInjury(final String bodyPart, final List<String> injuries) {
        return IvyInjury.builder()
                .ivyBodyPart(bodyPart)
                .ivyInjuries(injuries)
                .build();
    }
}