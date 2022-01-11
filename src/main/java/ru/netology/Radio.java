package ru.netology;

public class Radio {
    private int currentVolume = 25;
    private int maxVolume = 100;
    private int currentRadioNumber = 0;
    private int countRadioStation = 10;

    public Radio(int countRadioStation) {
        if (countRadioStation > 0) {
            this.countRadioStation = countRadioStation;
        }
    }

    public int getCountRadioNumber(){
        return this.countRadioStation;
    }


    private int getMaxRadioNumber(){
        return countRadioStation - 1;
    }

    public int getCurrentRadioNumber() {
        return currentRadioNumber;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }


    public void setCurrentRadioNumber(int currentRadioNumber) {
        if (currentRadioNumber < 0) {
            return;
        }
        if (currentRadioNumber > getMaxRadioNumber()){
            return;
        }
        this.currentRadioNumber = currentRadioNumber;
    }

    public void nextRadioNumber(){
        if (currentRadioNumber == getMaxRadioNumber()){
            this.currentRadioNumber = 0;
        } else {
            this.currentRadioNumber++;
        }

    }

    public void prevRadioNumber(){
        if (currentRadioNumber == 0){
            this.currentRadioNumber = getMaxRadioNumber();
        } else {
            this.currentRadioNumber--;
        }

    }






    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < 0) {
            return;
        }
        if (currentVolume > maxVolume){
            return;
        }
        this.currentVolume = currentVolume;
    }

    public void increaseVolume() {
        if (currentVolume < maxVolume) {
            currentVolume = currentVolume + 1;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
    }

}


