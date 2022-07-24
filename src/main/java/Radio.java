public class Radio {
    private int stationQuantity;
    private int lastStation;
    private int stationNumber;
    private int volumeRange;


    public Radio() {
        this.stationQuantity = 10;
        this.lastStation = this.stationQuantity - 1;
    }
    public Radio(int stationQuantity) {
        if (stationQuantity > 0) {
            this.stationQuantity = stationQuantity;
        } else {
            this.stationQuantity = 10;
        }
        this.lastStation = this.stationQuantity - 1;
    }

    public void next() {
        if (stationNumber == lastStation) {
            stationNumber = 0;
        } else {
            stationNumber++;
        }
    }

    public void prev() {
        if (stationNumber == 0) {
            stationNumber = lastStation;
        } else {
            stationNumber--;
        }
    }

    public void setStationNumber(int newStationNumber) {
        if (newStationNumber < 0 || newStationNumber > lastStation) {
            return;
        }
        stationNumber = newStationNumber;
    }

    public int getStationNumber() {
        return stationNumber;
    }

    public void volumePlus() {
        if (volumeRange < 100) {
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

