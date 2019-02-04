package main.java.com.playg.models.ita;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Builder
@Data
public class InjuryImpl implements Injury {
    boolean fnol;
    String injuryType;
    List<String> bodyParts;
    
    @Override
    public String toString() {
        return "InjuryImpl";
    }
}
