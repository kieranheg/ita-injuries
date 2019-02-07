package main.java.com.playg.models.ivy;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class IvyInjuryResponse {
    List<IvyInjury> ivyInjuries;
    
    @Override
    public String toString() {
        return "IvyInjuryResponse";
    }
}