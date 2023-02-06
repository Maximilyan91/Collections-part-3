package Drivers;

import java.util.Objects;

public abstract class Driver {

    private final String fullName;
    private boolean hasDriverLicense;
    private int experience;

    public Driver(String fullName) {
        this.fullName = fullName;
    }

    public Driver(String fullName, boolean hasDriverLicense, int experience) {
        this.fullName = fullName;
        setHasDriverLicense(hasDriverLicense);
        this.experience = experience;
    }

    public String getFullName() {
        return fullName;
    }

    public boolean getHasDriverLicense() {
        return hasDriverLicense;
    }

    public void setHasDriverLicense(boolean hasDriverLicense) {
        this.hasDriverLicense = hasDriverLicense;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }


    @Override
    public String toString() {
        return "Водитель " + fullName;
    }

    abstract void startDriving();

    abstract void stopDriving();

    abstract void refuelTransport();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Driver driver = (Driver) o;
        return hasDriverLicense == driver.hasDriverLicense && experience == driver.experience && fullName.equals(driver.fullName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fullName, hasDriverLicense, experience);
    }
}


