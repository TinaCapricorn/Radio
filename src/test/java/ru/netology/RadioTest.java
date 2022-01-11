package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    Radio radio = new Radio(20);

    @Test
    void lessCountRadioNumber(){
        Radio lessRadio = new Radio(-12);
        int expected = 10;
        int actual = lessRadio.getCountRadioNumber();
        assertEquals(expected, actual);
    }

    @Test
    void middleRadioNumber() {
        radio.setCurrentRadioNumber(10);
        int expected = 10;
        int actual = radio.getCurrentRadioNumber();
        assertEquals(expected, actual);
    }

    @Test
    void maxRadioNumber() {
        radio.setCurrentRadioNumber(19);
        int expected = 19;
        int actual = radio.getCurrentRadioNumber();
        assertEquals(expected, actual);
    }

    @Test
    void minRadioNumber() {
        radio.setCurrentRadioNumber(0);
        int expected = 0;
        int actual = radio.getCurrentRadioNumber();
        assertEquals(expected, actual);
    }

    @Test
    void overRadioNumber() {
        radio.setCurrentRadioNumber(21);
        int expected = 0;
        int actual = radio.getCurrentRadioNumber();
        assertEquals(expected, actual);
    }

    @Test
    void lessRadioNumber() {
        radio.setCurrentRadioNumber(-2);
        int expected = 0;
        int actual = radio.getCurrentRadioNumber();
        assertEquals(expected, actual);
    }

    @Test
    void middleNextRadioNumber() {
        radio.setCurrentRadioNumber(12);
        radio.nextRadioNumber();
        int expected = 13;
        int actual = radio.getCurrentRadioNumber();
        assertEquals(expected, actual);
    }

    @Test
    void maxNextRadioNumber() {
        radio.setCurrentRadioNumber(19);
        radio.nextRadioNumber();
        int expected = 0;
        int actual = radio.getCurrentRadioNumber();
        assertEquals(expected, actual);
    }

    @Test
    void middlePrevRadioNumber() {
        radio.setCurrentRadioNumber(17);
        radio.prevRadioNumber();
        int expected = 16;
        int actual = radio.getCurrentRadioNumber();
        assertEquals(expected, actual);
    }

    @Test
    void minPrevRadioNumber() {
        radio.prevRadioNumber();
        int expected = 19;
        int actual = radio.getCurrentRadioNumber();
        assertEquals(expected, actual);
    }







    @Test
    void lessCurrentVolume() {
        radio.setCurrentVolume(-7);
        int expected = 25;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    void overCurrentVolume() {
        radio.setCurrentVolume(102);
        int expected = 25;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    void middleIncreaseVolume() {
        radio.setCurrentVolume(47);
        radio.increaseVolume();
        int expected = 48;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    void maxIncreaseVolume() {
        radio.setCurrentVolume(100);
        radio.increaseVolume();
        int expected = 100;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    void middleDecreaseVolume() {
        radio.setCurrentVolume(54);
        radio.decreaseVolume();
        int expected = 53;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    void minDecreaseVolume() {
        radio.setCurrentVolume(0);
        radio.decreaseVolume();
        int expected = 0;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

}