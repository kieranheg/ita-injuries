package main.java.com.playg.models.ita.entity;

import java.util.List;

public interface InjuryEntity {
    String getInjuryType();
    List<String> getBodyParts();
    boolean isFnol();
}
