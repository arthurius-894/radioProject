package ru.netology.radio;

public class Radio {

    private int countOfRadioStations;
    private int maxRadioStation;
    private int minRadioStation = 0;
    private int maxVolume = 100;
    private int minVolume = 0;
    private int currentRadioStationNumber;
    private int currentVolume = minVolume;


    public Radio(int countOfRadioStations) {
        this.countOfRadioStations = countOfRadioStations;
        this.maxRadioStation = countOfRadioStations - 1;
    }

    public Radio() {
        this.countOfRadioStations = 10;
        this.maxRadioStation = countOfRadioStations - 1;
    }

    public int getCountOfRadioStations() {
        return countOfRadioStations;
    }

    public int getMaxRadioStation() {
        return maxRadioStation;
    }

    public int getMinRadioStation() {
        return minRadioStation;
    }

    public int getMinVolume() {
        return minVolume;
    }

    public int getMaxVolume() {
        return maxVolume;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume > maxVolume) {
            return;
        }
        if (newCurrentVolume < minVolume) {
            return;
        }

        currentVolume = newCurrentVolume;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void increaseVolume() {
        int newCurrentVolume = currentVolume + 1;
        setCurrentVolume(newCurrentVolume);
    }

    public void decreaseVolume() {
        int newCurrentVolume = currentVolume - 1;
        setCurrentVolume(newCurrentVolume);
    }


    public void setCurrentRadioStationNumber(int newCurrentRadioStationNumber) {
        if (newCurrentRadioStationNumber < minRadioStation) {
            return;
        }
        if (newCurrentRadioStationNumber > maxRadioStation) {
            return;
        }
        currentRadioStationNumber = newCurrentRadioStationNumber;
    }

    public int getCurrentRadioStationNumber() {
        return currentRadioStationNumber;
    }

    public void next() {
        if (currentRadioStationNumber == maxRadioStation) {
            currentRadioStationNumber = minRadioStation;
        } else {
            currentRadioStationNumber++;
        }
    }

    public void prev() {
        if (currentRadioStationNumber == minRadioStation) {
            currentRadioStationNumber = maxRadioStation;
        } else {
            currentRadioStationNumber--;
        }
    }
}

