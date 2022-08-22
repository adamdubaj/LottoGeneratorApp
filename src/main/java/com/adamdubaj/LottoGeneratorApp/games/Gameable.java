package com.adamdubaj.LottoGeneratorApp.games;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;

public interface Gameable {
    List<Integer> generate();
    List<Integer> getLastWonNumbers();
    Map<Integer, List> getLastWonNumbers(int numberOfLastGames);
    Map<Integer, List> geLastWonNumbers(int begin, int end);
    int getNumbersOfGames();
    int getnumbersOfGamesFrom(LocalDate localDate);
    List<Integer> getGameIds(List numbers);
}
