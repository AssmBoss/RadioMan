import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void shouldIncreaseStation() {
        Radio receiver = new Radio();

        receiver.next();
        receiver.next();

        int expected = 2;
        int actual = receiver.getStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseStationNineToZero() {
        Radio receiver = new Radio();

        receiver.setStationNumber(9);
        receiver.next();

        int expected = 0;
        int actual = receiver.getStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseStation() {
        Radio receiver = new Radio();

        receiver.setStationNumber(9);
        receiver.prev();
        receiver.prev();

        int expected = 7;
        int actual = receiver.getStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseStationZeroToNine() {
        Radio receiver = new Radio();

        receiver.setStationNumber(0);
        receiver.prev();

        int expected = 9;
        int actual = receiver.getStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldRejectStationNumber() {
        Radio receiver = new Radio();

        receiver.setStationNumber(9);
        receiver.setStationNumber(11);
        receiver.setStationNumber(-1);

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

        for(int i = 0; i < 15; i++) {
            receiver.volumePlus();
        }

        int expected = 10;
        int actual = receiver.getVolumeRange();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseVolume() {
        Radio receiver = new Radio();

        for(int i = 0; i < 5; i++) {
            receiver.volumePlus();
        }
        receiver.volumeMinus();

        int expected = 4;
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

