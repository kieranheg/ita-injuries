package main.java.com.playg.models.ivy;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class IvyInjury {
    String ivyBodyPart;
    List<String> ivyInjuries;
}