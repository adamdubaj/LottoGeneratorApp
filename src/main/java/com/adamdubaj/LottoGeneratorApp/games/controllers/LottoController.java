package com.adamdubaj.LottoGeneratorApp.games.controllers;

import com.adamdubaj.LottoGeneratorApp.games.Gameable;
import com.adamdubaj.LottoGeneratorApp.games.Lotto;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class LottoController implements Gameable {

    public List<Lotto> scrap(String url, int timeOut){
        Document document = null;
        List<Lotto> result = new ArrayList<>();
        Integer id;
        LocalDate localDate;
        try{
            document = Jsoup.connect(url).timeout(timeOut).get();
            Elements elements = document.select("#list_of_last_drawings_wyniki_lotto > div > ul");
            for (Element e: elements) {
                ArrayList<Integer> tempList = new ArrayList<>(6);
                id = Integer.valueOf(e.select("li").get(0).text().replace(".", ""));
                localDate = LocalDate.parse(e.select("li").get(1).text(), DateTimeFormatter.ofPattern("dd-MM-yyyy"));
                tempList.add(Integer.valueOf(e.select("li").get(2).text()));
                tempList.add(Integer.valueOf(e.select("li").get(3).text()));
                tempList.add(Integer.valueOf(e.select("li").get(4).text()));
                tempList.add(Integer.valueOf(e.select("li").get(5).text()));
                tempList.add(Integer.valueOf(e.select("li").get(6).text()));
                tempList.add(Integer.valueOf(e.select("li").get(7).text()));
                result.add(new Lotto(id, tempList, localDate));
            }

        } catch (IOException e){
            e.printStackTrace();
        }
        return result;
    }

    @Override
    public List<Integer> generate() {
        return null;
    }

    @Override
    public List<Integer> getLastWonNumbers() {
        return null;
    }

    @Override
    public Map<Integer, List> getLastWonNumbers(int numberOfLastGames) {
        return null;
    }

    @Override
    public Map<Integer, List> geLastWonNumbers(int begin, int end) {
        return null;
    }

    @Override
    public int getNumbersOfGames() {
        return 0;
    }

    @Override
    public int getnumbersOfGamesFrom(LocalDate localDate) {
        return 0;
    }

    @Override
    public List<Integer> getGameIds(List numbers) {
        return null;
    }
}
