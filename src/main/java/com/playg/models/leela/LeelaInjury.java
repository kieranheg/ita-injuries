package main.java.com.playg.models.leela;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class LeelaInjury {
    String fnol;
    String leelaBodyPart;
    List<String> leelaInjuries;
}
