public class Radio {
    private int stationNumber;
    private int volumeRange;

    public void next() {
        if (stationNumber == 9) {
            stationNumber = 0;
        } else {
            stationNumber++;
        }
    }

    public void prev() {
        if (stationNumber == 0) {
            stationNumber = 9;
        } else {
            stationNumber--;
        }
    }

    public void setStationNumber(int newStationNumber) {
        if (newStationNumber < 0 || newStationNumber > 9) {
            return;
        }
        stationNumber = newStationNumber;
    }

    public int getStationNumber() {
        return stationNumber;
    }

    public void volumePlus() {
        if (volumeRange < 10) {
            volumeRange++;
        }
    }

    public void volumeMinus() {
        if (volumeRange > 0) {
            volumeRange--;
        }
    }

    public int getVolumeRange() {
        return volumeRange;
    }
}

