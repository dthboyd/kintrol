package de.thegrate.kintrol;

/**
 * Created by d037698 on 5/1/15.
 */
public interface KinosStatusChecker {
    public void checkDeviceStatus();

    public void checkForOperationStatus();

    public void checkVolume();

    public void checkInputProfile();
}
