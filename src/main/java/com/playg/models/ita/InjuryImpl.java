package main.java.com.playg.models.ita;

import java.util.ArrayList;
import java.util.List;

public class InjuryImpl implements Injury {
    String injuryType;
    List<String> bodyParts;
    
    public InjuryImpl(String injuryType, List<String> bodyPart) {
        this.injuryType = injuryType;
        this.bodyParts = new ArrayList<>(bodyPart);
    }
    
    @Override
    public String getInjuryType() {
        return injuryType;
    }
    
    @Override
    public List<String> getBodyParts() {
        return bodyParts;
    }
    
    @Override
    public String toString() {
        return "InjuryImpl";
    }
}
