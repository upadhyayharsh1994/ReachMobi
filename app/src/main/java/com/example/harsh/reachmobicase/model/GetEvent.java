package com.example.harsh.reachmobicase.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class GetEvent {
    @SerializedName("idEvent")
    @Expose
    private String idEvent;
    @SerializedName("strEvent")
    @Expose
    private String strEvent;
    @SerializedName("strEventAlternate")
    @Expose
    private String strEventAlternate;
    @SerializedName("strFilename")
    @Expose
    private String strFilename;
    @SerializedName("strSport")
    @Expose
    private String strSport;
    @SerializedName("idLeague")
    @Expose
    private String idLeague;
    @SerializedName("strLeague")
    @Expose
    private String strLeague;
    @SerializedName("intHomeScore")
    @Expose
    private String intHomeScore;
    @SerializedName("intRound")
    @Expose
    private String intRound;
    @SerializedName("intAwayScore")
    @Expose
    private String intAwayScore;
    @SerializedName("intSpectators")
    @Expose
    private Object intSpectators;
    @SerializedName("strHomeGoalDetails")
    @Expose
    private String strHomeGoalDetails;
    @SerializedName("strHomeLineupGoalkeeper")
    @Expose
    private String strHomeLineupGoalkeeper;
    @SerializedName("strHomeLineupDefense")
    @Expose
    private String strHomeLineupDefense;
    @SerializedName("strHomeLineupMidfield")
    @Expose
    private String strHomeLineupMidfield;
    @SerializedName("strHomeLineupForward")
    @Expose
    private String strHomeLineupForward;
    @SerializedName("strHomeLineupSubstitutes")
    @Expose
    private String strHomeLineupSubstitutes;
    @SerializedName("strHomeFormation")
    @Expose
    private Object strHomeFormation;
    @SerializedName("strAwayRedCards")
    @Expose
    private String strAwayRedCards;
    @SerializedName("strAwayYellowCards")
    @Expose
    private String strAwayYellowCards;
    @SerializedName("strAwayGoalDetails")
    @Expose
    private String strAwayGoalDetails;
    @SerializedName("strAwayLineupGoalkeeper")
    @Expose
    private String strAwayLineupGoalkeeper;
    @SerializedName("strAwayLineupDefense")
    @Expose
    private String strAwayLineupDefense;
    @SerializedName("strAwayLineupMidfield")
    @Expose
    private String strAwayLineupMidfield;
    @SerializedName("strAwayLineupForward")
    @Expose
    private String strAwayLineupForward;
    @SerializedName("strAwayLineupSubstitutes")
    @Expose
    private String strAwayLineupSubstitutes;
    @SerializedName("strAwayFormation")
    @Expose
    private Object strAwayFormation;
    @SerializedName("intHomeShots")
    @Expose
    private Object intHomeShots;
    @SerializedName("intAwayShots")
    @Expose
    private Object intAwayShots;
    @SerializedName("dateEvent")
    @Expose
    private String dateEvent;
    @SerializedName("dateEventLocal")
    @Expose
    private String dateEventLocal;
    @SerializedName("strDate")
    @Expose
    private String strDate;
    @SerializedName("strTime")
    @Expose
    private String strTime;
    @SerializedName("strTimeLocal")
    @Expose
    private String strTimeLocal;
    @SerializedName("strTVStation")
    @Expose
    private Object strTVStation;
    @SerializedName("idHomeTeam")
    @Expose
    private String idHomeTeam;
    @SerializedName("idAwayTeam")
    @Expose
    private String idAwayTeam;
    @SerializedName("strResult")
    @Expose
    private String strResult;
    @SerializedName("strCircuit")
    @Expose
    private Object strCircuit;
    @SerializedName("strCountry")
    @Expose
    private Object strCountry;
    @SerializedName("strCity")
    @Expose
    private Object strCity;
    @SerializedName("strPoster")
    @Expose
    private Object strPoster;
    @SerializedName("strFanart")
    @Expose
    private Object strFanart;
    @SerializedName("strThumb")
    @Expose
    private String strThumb;
    @SerializedName("strBanner")
    @Expose
    private Object strBanner;
    @SerializedName("strMap")
    @Expose
    private Object strMap;
    @SerializedName("strTweet1")
    @Expose
    private String strTweet1;
    @SerializedName("strTweet2")
    @Expose
    private String strTweet2;
    @SerializedName("strTweet3")
    @Expose
    private String strTweet3;
    @SerializedName("strVideo")
    @Expose
    private String strVideo;
    @SerializedName("strLocked")
    @Expose
    private String strLocked;

    public String getIdEvent() {
        return idEvent;
    }

    public void setIdEvent(String idEvent) {
        this.idEvent = idEvent;
    }

    public String getStrEvent() {
        return strEvent;
    }

    public void setStrEvent(String strEvent) {
        this.strEvent = strEvent;
    }

    public String getStrEventAlternate() {
        return strEventAlternate;
    }

    public void setStrEventAlternate(String strEventAlternate) {
        this.strEventAlternate = strEventAlternate;
    }

    public String getStrFilename() {
        return strFilename;
    }

    public void setStrFilename(String strFilename) {
        this.strFilename = strFilename;
    }

    public String getStrSport() {
        return strSport;
    }

    public void setStrSport(String strSport) {
        this.strSport = strSport;
    }

    public String getIdLeague() {
        return idLeague;
    }

    public void setIdLeague(String idLeague) {
        this.idLeague = idLeague;
    }

    public String getStrLeague() {
        return strLeague;
    }

    public void setStrLeague(String strLeague) {
        this.strLeague = strLeague;
    }

    public String getIntHomeScore() {
        return intHomeScore;
    }

    public void setIntHomeScore(String intHomeScore) {
        this.intHomeScore = intHomeScore;
    }

    public String getIntRound() {
        return intRound;
    }

    public void setIntRound(String intRound) {
        this.intRound = intRound;
    }

    public String getIntAwayScore() {
        return intAwayScore;
    }

    public void setIntAwayScore(String intAwayScore) {
        this.intAwayScore = intAwayScore;
    }

    public Object getIntSpectators() {
        return intSpectators;
    }

    public void setIntSpectators(Object intSpectators) {
        this.intSpectators = intSpectators;
    }

    public String getStrHomeGoalDetails() {
        return strHomeGoalDetails;
    }

    public void setStrHomeGoalDetails(String strHomeGoalDetails) {
        this.strHomeGoalDetails = strHomeGoalDetails;
    }

    public String getStrHomeLineupGoalkeeper() {
        return strHomeLineupGoalkeeper;
    }

    public void setStrHomeLineupGoalkeeper(String strHomeLineupGoalkeeper) {
        this.strHomeLineupGoalkeeper = strHomeLineupGoalkeeper;
    }

    public String getStrHomeLineupDefense() {
        return strHomeLineupDefense;
    }

    public void setStrHomeLineupDefense(String strHomeLineupDefense) {
        this.strHomeLineupDefense = strHomeLineupDefense;
    }

    public String getStrHomeLineupMidfield() {
        return strHomeLineupMidfield;
    }

    public void setStrHomeLineupMidfield(String strHomeLineupMidfield) {
        this.strHomeLineupMidfield = strHomeLineupMidfield;
    }

    public String getStrHomeLineupForward() {
        return strHomeLineupForward;
    }

    public void setStrHomeLineupForward(String strHomeLineupForward) {
        this.strHomeLineupForward = strHomeLineupForward;
    }

    public String getStrHomeLineupSubstitutes() {
        return strHomeLineupSubstitutes;
    }

    public void setStrHomeLineupSubstitutes(String strHomeLineupSubstitutes) {
        this.strHomeLineupSubstitutes = strHomeLineupSubstitutes;
    }

    public Object getStrHomeFormation() {
        return strHomeFormation;
    }

    public void setStrHomeFormation(Object strHomeFormation) {
        this.strHomeFormation = strHomeFormation;
    }

    public String getStrAwayRedCards() {
        return strAwayRedCards;
    }

    public void setStrAwayRedCards(String strAwayRedCards) {
        this.strAwayRedCards = strAwayRedCards;
    }

    public String getStrAwayYellowCards() {
        return strAwayYellowCards;
    }

    public void setStrAwayYellowCards(String strAwayYellowCards) {
        this.strAwayYellowCards = strAwayYellowCards;
    }

    public String getStrAwayGoalDetails() {
        return strAwayGoalDetails;
    }

    public void setStrAwayGoalDetails(String strAwayGoalDetails) {
        this.strAwayGoalDetails = strAwayGoalDetails;
    }

    public String getStrAwayLineupGoalkeeper() {
        return strAwayLineupGoalkeeper;
    }

    public void setStrAwayLineupGoalkeeper(String strAwayLineupGoalkeeper) {
        this.strAwayLineupGoalkeeper = strAwayLineupGoalkeeper;
    }

    public String getStrAwayLineupDefense() {
        return strAwayLineupDefense;
    }

    public void setStrAwayLineupDefense(String strAwayLineupDefense) {
        this.strAwayLineupDefense = strAwayLineupDefense;
    }

    public String getStrAwayLineupMidfield() {
        return strAwayLineupMidfield;
    }

    public void setStrAwayLineupMidfield(String strAwayLineupMidfield) {
        this.strAwayLineupMidfield = strAwayLineupMidfield;
    }

    public String getStrAwayLineupForward() {
        return strAwayLineupForward;
    }

    public void setStrAwayLineupForward(String strAwayLineupForward) {
        this.strAwayLineupForward = strAwayLineupForward;
    }

    public String getStrAwayLineupSubstitutes() {
        return strAwayLineupSubstitutes;
    }

    public void setStrAwayLineupSubstitutes(String strAwayLineupSubstitutes) {
        this.strAwayLineupSubstitutes = strAwayLineupSubstitutes;
    }

    public Object getStrAwayFormation() {
        return strAwayFormation;
    }

    public void setStrAwayFormation(Object strAwayFormation) {
        this.strAwayFormation = strAwayFormation;
    }

    public Object getIntHomeShots() {
        return intHomeShots;
    }

    public void setIntHomeShots(Object intHomeShots) {
        this.intHomeShots = intHomeShots;
    }

    public Object getIntAwayShots() {
        return intAwayShots;
    }

    public void setIntAwayShots(Object intAwayShots) {
        this.intAwayShots = intAwayShots;
    }

    public String getDateEvent() {
        return dateEvent;
    }

    public void setDateEvent(String dateEvent) {
        this.dateEvent = dateEvent;
    }

    public String getDateEventLocal() {
        return dateEventLocal;
    }

    public void setDateEventLocal(String dateEventLocal) {
        this.dateEventLocal = dateEventLocal;
    }

    public String getStrDate() {
        return strDate;
    }

    public void setStrDate(String strDate) {
        this.strDate = strDate;
    }

    public String getStrTime() {
        return strTime;
    }

    public void setStrTime(String strTime) {
        this.strTime = strTime;
    }

    public String getStrTimeLocal() {
        return strTimeLocal;
    }

    public void setStrTimeLocal(String strTimeLocal) {
        this.strTimeLocal = strTimeLocal;
    }

    public Object getStrTVStation() {
        return strTVStation;
    }

    public void setStrTVStation(Object strTVStation) {
        this.strTVStation = strTVStation;
    }

    public String getIdHomeTeam() {
        return idHomeTeam;
    }

    public void setIdHomeTeam(String idHomeTeam) {
        this.idHomeTeam = idHomeTeam;
    }

    public String getIdAwayTeam() {
        return idAwayTeam;
    }

    public void setIdAwayTeam(String idAwayTeam) {
        this.idAwayTeam = idAwayTeam;
    }

    public String getStrResult() {
        return strResult;
    }

    public void setStrResult(String strResult) {
        this.strResult = strResult;
    }

    public Object getStrCircuit() {
        return strCircuit;
    }

    public void setStrCircuit(Object strCircuit) {
        this.strCircuit = strCircuit;
    }

    public Object getStrCountry() {
        return strCountry;
    }

    public void setStrCountry(Object strCountry) {
        this.strCountry = strCountry;
    }

    public Object getStrCity() {
        return strCity;
    }

    public void setStrCity(Object strCity) {
        this.strCity = strCity;
    }

    public Object getStrPoster() {
        return strPoster;
    }

    public void setStrPoster(Object strPoster) {
        this.strPoster = strPoster;
    }

    public Object getStrFanart() {
        return strFanart;
    }

    public void setStrFanart(Object strFanart) {
        this.strFanart = strFanart;
    }

    public String getStrThumb() {
        return strThumb;
    }

    public void setStrThumb(String strThumb) {
        this.strThumb = strThumb;
    }

    public Object getStrBanner() {
        return strBanner;
    }

    public void setStrBanner(Object strBanner) {
        this.strBanner = strBanner;
    }

    public Object getStrMap() {
        return strMap;
    }

    public void setStrMap(Object strMap) {
        this.strMap = strMap;
    }

    public String getStrTweet1() {
        return strTweet1;
    }

    public void setStrTweet1(String strTweet1) {
        this.strTweet1 = strTweet1;
    }

    public String getStrTweet2() {
        return strTweet2;
    }

    public void setStrTweet2(String strTweet2) {
        this.strTweet2 = strTweet2;
    }

    public String getStrTweet3() {
        return strTweet3;
    }

    public void setStrTweet3(String strTweet3) {
        this.strTweet3 = strTweet3;
    }

    public String getStrVideo() {
        return strVideo;
    }

    public void setStrVideo(String strVideo) {
        this.strVideo = strVideo;
    }

    public String getStrLocked() {
        return strLocked;
    }

    public void setStrLocked(String strLocked) {
        this.strLocked = strLocked;
    }

}
