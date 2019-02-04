package main.java.com.playg.utils;

import main.java.com.playg.models.leela.LeelaInjury;

import java.util.List;

import static java.util.Arrays.asList;
import static main.java.com.playg.utils.Constants.*;

public class LeelaResponseGenerator {
    
    public static List<LeelaInjury> buildLeelaInjuries() {
        return asList(
                buildLeelaInjury(FNOL_Y, BODY_PART_100, asList(INJURY_131, INJURY_132, INJURY_133)),
                buildLeelaInjury(FNOL_N, BODY_PART_110, asList(INJURY_141, INJURY_142, INJURY_143)),
                buildLeelaInjury(FNOL_N, BODY_PART_100, asList(INJURY_141, INJURY_142, INJURY_143)));
    }
    
    public static LeelaInjury buildLeelaInjury(final String fnol, final String bodyPart, final List<String> injuries) {
        return LeelaInjury.builder()
                .fnol(fnol)
                .leelaBodyPart(bodyPart)
                .leelaInjuries(injuries)
                .build();
    }
}