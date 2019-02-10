package main.java.com.playg.interface_adapters.leela;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class LeelaInjuryResponse {
    List<LeelaInjuryImpl> leelaInjuries;
    
    @Override
    public String toString() {
        return "LeelaInjuryResponse";
    }
}
