package com.adamdubaj.LottoGeneratorApp.backend.model;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import javax.persistence.Id;
import java.time.LocalDate;
import java.util.List;

@RequiredArgsConstructor
@Getter
@Setter
public abstract class Game {
    @Id
    private final int id;
    private final List<Integer> numbers;
    private final LocalDate localDate;

    @Override
    public String toString() {
        return "id: " + this.id + " | date: " + this.localDate + " | numbers: " + numbers;
    }
}

