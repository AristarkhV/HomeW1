package com.company;
public class FootballMatch extends Service {
    public int MatchForecast(int firstRealScore, int secondRealScore, int firstForecastScore, int secondForecastScore) {
        return ((firstRealScore == firstForecastScore && secondRealScore == secondForecastScore)) ? 2 :
                ((firstRealScore > secondRealScore && firstForecastScore >= secondForecastScore)
                        || (firstRealScore < secondRealScore && firstForecastScore < secondForecastScore)
                        || (firstRealScore == secondRealScore && firstForecastScore == secondForecastScore)) ? 1 : 0;
    }
}