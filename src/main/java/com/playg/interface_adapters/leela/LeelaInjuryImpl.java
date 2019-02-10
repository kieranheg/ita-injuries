package main.java.com.playg.interface_adapters.leela;

import lombok.Builder;
import main.java.com.playg.interface_adapters.ExternalInjury;
import main.java.com.playg.models.ita.entity.InjuryEntity;

import java.util.List;

@Builder
public class LeelaInjuryImpl implements ExternalInjury<LeelaInjuryResponse> {
    
    private String fnol;
    private String leelaBodyPart;
    private List<String> leelaInjuries;
    
    public String getFnol() {
        return fnol;
    }
    
    @Override
    public String getBodyPart() {
        return leelaBodyPart;
    }
    
    @Override
    public List<String> getInjuries() {
        return leelaInjuries;
    }
    
    @Override
    public List<InjuryEntity> mapInjuriesToIta(LeelaInjuryResponse leelaInjuryResponse) {
        return null;
    }
    
    @Override
    public String toString() {
        return "LeelaInjuryImpl";
    }

}
