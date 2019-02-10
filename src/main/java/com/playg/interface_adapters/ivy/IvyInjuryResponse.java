package main.java.com.playg.interface_adapters.ivy;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class IvyInjuryResponse {
    List<IvyInjuryImpl> ivyInjuries;
    
    @Override
    public String toString() {
        return "IvyInjuryResponse";
    }
}