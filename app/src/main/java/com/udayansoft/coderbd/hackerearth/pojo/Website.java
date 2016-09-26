package com.udayansoft.coderbd.hackerearth.pojo;

import java.util.ArrayList;

/**
 * Created by Biswajit Debnath on 26-Sep-16.
 */

public class Website {
    private ArrayList<Contest> contests;
    private Integer quotaMax;
    private Integer quotaAvailable;

    public Website() {
        this.contests = new ArrayList<>();
    }

    public Website(ArrayList<Contest> contests, Integer quotaMax, Integer quotaAvailable) {
        this.contests = contests;
        this.quotaMax = quotaMax;
        this.quotaAvailable = quotaAvailable;
    }

    public ArrayList<Contest> getContests() {
        return contests;
    }

    public void setContests(ArrayList<Contest> contests) {
        this.contests = contests;
    }

    public Integer getQuotaMax() {
        return quotaMax;
    }

    public void setQuotaMax(Integer quotaMax) {
        this.quotaMax = quotaMax;
    }

    public Integer getQuotaAvailable() {
        return quotaAvailable;
    }

    public void setQuotaAvailable(Integer quotaAvailable) {
        this.quotaAvailable = quotaAvailable;
    }

    @Override
    public String toString() {
        return "Website{" +
                "contests=" + contests +
                ", quotaMax=" + quotaMax +
                ", quotaAvailable=" + quotaAvailable +
                '}';
    }
}
