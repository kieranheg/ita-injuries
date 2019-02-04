package main.java.com.playg.models.ita;

import java.util.List;

public interface Injury {
    String getInjuryType();
    List<String> getBodyParts();
    boolean isFnol();
}
