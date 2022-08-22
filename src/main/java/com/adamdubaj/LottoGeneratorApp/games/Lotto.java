package com.adamdubaj.LottoGeneratorApp.games;

import java.time.LocalDate;
import java.util.List;


public class Lotto extends Game{
    public Lotto(int id, List<Integer> numbers, LocalDate date) {
        super(id, numbers, date);
    }
}
