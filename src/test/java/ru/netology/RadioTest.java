package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    Radio radio = new Radio();

    @Test
    void middleRadioNumber() {
        radio.setCurrentRadioNumber(5);
        int expected = 5;
        int actual = radio.getCurrentRadioNumber();
        assertEquals(expected, actual);
    }

    @Test
    void maxRadioNumber() {
        radio.setCurrentRadioNumber(9);
        int expected = 9;
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
        radio.setCurrentRadioNumber(12);
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
        radio.setCurrentRadioNumber(2);
        radio.nextRadioNumber();
        int expected = 3;
        int actual = radio.getCurrentRadioNumber();
        assertEquals(expected, actual);
    }

    @Test
    void maxNextRadioNumber() {
        radio.setCurrentRadioNumber(9);
        radio.nextRadioNumber();
        int expected = 0;
        int actual = radio.getCurrentRadioNumber();
        assertEquals(expected, actual);
    }

    @Test
    void middlePrevRadioNumber() {
        radio.setCurrentRadioNumber(7);
        radio.prevRadioNumber();
        int expected = 6;
        int actual = radio.getCurrentRadioNumber();
        assertEquals(expected, actual);
    }

    @Test
    void minPrevRadioNumber() {
        radio.prevRadioNumber();
        int expected = 9;
        int actual = radio.getCurrentRadioNumber();
        assertEquals(expected, actual);
    }

    @Test
    void lessCurrentVolume() {
        radio.setCurrentVolume(-7);
        int expected = 0;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    void overCurrentVolume() {
        radio.setCurrentVolume(36);
        int expected = 0;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    void middleIncreaseVolume() {
        radio.setCurrentVolume(7);
        radio.increaseVolume();
        int expected = 8;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    void maxIncreaseVolume() {
        radio.setCurrentVolume(10);
        radio.increaseVolume();
        int expected = 10;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    void middleDecreaseVolume() {
        radio.setCurrentVolume(4);
        radio.decreaseVolume();
        int expected = 3;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    void minDecreaseVolume() {
        radio.decreaseVolume();
        int expected = 0;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

}