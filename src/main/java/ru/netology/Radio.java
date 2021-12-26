package ru.netology;

public class Radio {
    private int currentVolume;
    private int currentRadioNumber;

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
        if (currentRadioNumber > 9){
            return;
        }
        this.currentRadioNumber = currentRadioNumber;
    }

    public void nextRadioNumber(){
        if (currentRadioNumber == 9){
            this.currentRadioNumber = 0;
        } else {
            this.currentRadioNumber++;
        }

    }

    public void prevRadioNumber(){
        if (currentRadioNumber == 0){
            this.currentRadioNumber = 9;
        } else {
            this.currentRadioNumber--;
        }

    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < 0) {
            return;
        }
        if (currentVolume > 10){
            return;
        }
        this.currentVolume = currentVolume;
    }

    public void increaseVolume() {
        if (currentVolume < 10) {
            currentVolume = currentVolume + 1;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
    }

}


