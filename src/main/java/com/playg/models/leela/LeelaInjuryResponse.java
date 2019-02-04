package main.java.com.playg.models.leela;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class LeelaInjuryResponse {
    List<LeelaInjury> leelaInjuries;
    
    @Override
    public String toString() {
        return "LeelaInjuryResponse";
    }
}
