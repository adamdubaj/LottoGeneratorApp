package com.adamdubaj.LottoGeneratorApp.backend.model;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDate;

@Entity
@RequiredArgsConstructor
@Getter
@Setter
public class Lotto{
    @Id
    private final int id;
    private final int n0;
    private final int n1;
    private final int n2;
    private final int n3;
    private final int n4;
    private final int n5;
    private final LocalDate localDate;

    @Override
    public String toString() {
        return "id: " + this.id + " | date: " + this.localDate + " | numbers: " +
                n0 + ", " +
                n1 + ", " +
                n2 + ", " +
                n3 + ", " +
                n4 + ", " +
                n5;
    }
}