package main.java.com.playg.interface_adapters.ivy;

import lombok.Builder;
import main.java.com.playg.interface_adapters.ExternalInjury;
import main.java.com.playg.models.ita.entity.InjuryEntity;

import java.util.List;

@Builder
public class IvyInjuryImpl implements ExternalInjury<IvyInjuryResponse> {
    private String ivyBodyPart;
    private List<String> ivyInjuries;
    
    @Override
    public String toString() {
        return "IvyInjuryImpl";
    }
    
    @Override
    public String getBodyPart() {
        return ivyBodyPart;
    }
    
    @Override
    public List<String> getInjuries() {
        return ivyInjuries;
    }
    
    @Override
    public List<InjuryEntity> mapInjuriesToIta(final IvyInjuryResponse ivyInjuryResponse) {
        return null;
    }
}