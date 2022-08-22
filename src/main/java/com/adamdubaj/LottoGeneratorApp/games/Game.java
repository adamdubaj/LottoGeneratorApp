package com.adamdubaj.LottoGeneratorApp.games;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;

@RequiredArgsConstructor
@Getter
@Setter
public abstract class Game {
    private final int id;
    private final List<Integer> numbers;
    private final LocalDate localDate;

    @Override
    public String toString() {
        return "id: " + this.id + " | date: " + this.localDate + " | numbers: " + numbers;
    }
}

