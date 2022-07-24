import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void shouldIncreaseStation() {
        Radio receiver = new Radio(20);

        receiver.next();
        receiver.next();

        int expected = 2;
        int actual = receiver.getStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseStationMaxToZero() {
        Radio receiver = new Radio(30);

        receiver.setStationNumber(29);
        receiver.next();

        int expected = 0;
        int actual = receiver.getStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseStation() {
        Radio receiver = new Radio(200);

        receiver.setStationNumber(199);
        receiver.prev();
        receiver.prev();

        int expected = 197;
        int actual = receiver.getStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseStationZeroToMax() {
        Radio receiver = new Radio(1000);

        receiver.setStationNumber(0);
        receiver.prev();

        int expected = 999;
        int actual = receiver.getStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldRejectInvalidStationNumber() {
        Radio receiver = new Radio(20);

        receiver.setStationNumber(9);
        receiver.setStationNumber(20);
        receiver.setStationNumber(-1);

        int expected = 9;
        int actual = receiver.getStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldChangeIncorrectStationQuanrityToTen() {
        Radio receiver = new Radio(-1);

        receiver.setStationNumber(0);
        receiver.prev();

        int expected = 9;
        int actual = receiver.getStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldVoidConstructorCorrectSet() {
        Radio receiver = new Radio();

        receiver.setStationNumber(0);
        receiver.prev();

        int expected = 9;
        int actual = receiver.getStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolume() {
        Radio receiver = new Radio();

        receiver.volumePlus();
        receiver.volumePlus();

        int expected = 2;
        int actual = receiver.getVolumeRange();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldStopIncreaseVolume() {
        Radio receiver = new Radio();

        for(int i = 0; i < 150; i++) {
            receiver.volumePlus();
        }

        int expected = 100;
        int actual = receiver.getVolumeRange();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseVolume() {
        Radio receiver = new Radio();

        for(int i = 0; i < 50; i++) {
            receiver.volumePlus();
        }
        receiver.volumeMinus();

        int expected = 49;
        int actual = receiver.getVolumeRange();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldStopDecreaseVolume() {
        Radio receiver = new Radio();

        receiver.volumeMinus();

        int expected = 0;
        int actual = receiver.getVolumeRange();

        Assertions.assertEquals(expected, actual);
    }

}

