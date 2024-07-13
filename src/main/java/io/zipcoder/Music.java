package io.zipcoder;

import java.util.ArrayList;
import java.util.Arrays;

public class Music {

    private final String[] playList;

    public Music(String[] playList) {
        this.playList = playList;
    }

    public Integer selection(Integer startIndex, String selection) {
        ArrayList<String> musicSelections = new ArrayList<String>(Arrays.asList(this.playList));

        int forwardCt = Math.abs(musicSelections.indexOf(selection) - startIndex);

        int backwardCt = Math.abs((musicSelections.size() + startIndex) - musicSelections.lastIndexOf(selection));

        return Math.min(forwardCt, backwardCt);
    }
}