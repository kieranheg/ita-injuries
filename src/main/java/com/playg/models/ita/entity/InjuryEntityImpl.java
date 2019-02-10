package main.java.com.playg.models.ita.entity;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Builder
@Data
public class InjuryEntityImpl implements InjuryEntity {
    boolean fnol;
    String injuryType;
    List<String> bodyParts;
    
    @Override
    public String toString() {
        return "InjuryEntityImpl";
    }
}
