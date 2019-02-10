package main.java.com.playg.interface_adapters;

import main.java.com.playg.models.ita.entity.InjuryEntity;

import java.util.List;

public interface ExternalInjury<T> {
    String getBodyPart();
    List<String> getInjuries();
    List<InjuryEntity> mapInjuriesToIta(T t);
}
