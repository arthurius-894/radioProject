package ru.netology.radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    Radio radio = new Radio();

    @Test
    public void sholdCountRadioStation() {

        Radio radio = new Radio(15);

        int expected = 15;
        int actual = radio.getCountOfRadioStations();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void sholdMinRadioStation() {

        Radio radio = new Radio(10);

        int expected = 0;
        int actual = radio.getMinRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void sholdMaxRadioStation() {

        Radio radio = new Radio(10);

        int expected = 9;
        int actual = radio.getMaxRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolume() {

        radio.setCurrentVolume(15);

        int expected = 15;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolumeMoreMax() {

        radio.setCurrentVolume(radio.getMaxVolume());
        radio.setCurrentVolume(120);

        int expected = 100;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolumeLessMin() {

        radio.setCurrentVolume(radio.getMinVolume());
        radio.setCurrentVolume(-150);

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolume() {

        radio.setCurrentVolume(50);
        radio.increaseVolume();

        int expected = 51;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseVolume() {

        radio.setCurrentVolume(62);
        radio.decreaseVolume();

        int expected = 61;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseVolumeMoreThanMax() {

        radio.setCurrentVolume(radio.getMaxVolume());
        radio.increaseVolume();

        int expected = 100;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void decreaseVolumeLessThanMin() {

        radio.setCurrentVolume(radio.getMinVolume());
        radio.decreaseVolume();

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldSetCurrentRadioStationNumber() {

        radio.setCurrentRadioStationNumber(5);

        int expected = 5;
        int actual = radio.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCurrentRadioStationNumberMoreMax() {

        radio.setCurrentRadioStationNumber(15);

        int expected = 0;
        int actual = radio.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCurrentRadioStationNumberLessMin() {

        radio.setCurrentRadioStationNumber(-8);

        int expected = 0;
        int actual = radio.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseRadioStationNumber() {

        radio.next();

        int expected = 1;
        int actual = radio.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseRadioStationNumber() {

        radio.setCurrentRadioStationNumber(8);
        radio.prev();

        int expected = 7;
        int actual = radio.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseRadioStationNumberMoreMax() {

        radio.setCurrentRadioStationNumber(radio.getMaxRadioStation());
        radio.next();

        int expected = radio.getMinRadioStation();
        int actual = radio.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void decreaseRadioStationNumberLessThanMin() {

        radio.prev();

        int expected = radio.getMaxRadioStation();
        int actual = radio.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }
}