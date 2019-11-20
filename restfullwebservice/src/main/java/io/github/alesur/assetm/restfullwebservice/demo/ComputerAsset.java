package io.github.alesur.assetm.restfullwebservice.demo;

public class ComputerAsset {

    private long id;
    private String site;
    private String serialNumber;
    private String computerName;
    private String description;
    private String operatingSystem;
    private String osVersion;
    private String deviceType;
    private String manufacturer;

    public ComputerAsset(long id, String site, String serialNumber, String computerName, String description, String operatingSystem, String osVersion, String deviceType, String manufacturer) {
        this.id = id;
        this.site = site;
        this.serialNumber = serialNumber;
        this.computerName = computerName;
        this.description = description;
        this.operatingSystem = operatingSystem;
        this.osVersion = osVersion;
        this.deviceType = deviceType;
        this.manufacturer = manufacturer;

    }

    public String getSite() {
        return site;
    }

    public void setSite(String site) {
        this.site = site;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getComputerName() {
        return computerName;
    }

    public void setComputerName(String computerName) {
        this.computerName = computerName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    public String getOsVersion() {
        return osVersion;
    }

    public void setOsVersion(String osVersion) {
        this.osVersion = osVersion;
    }

    public String getDeviceType() {
        return deviceType;
    }

    public void setDeviceType(String deviceType) {
        this.deviceType = deviceType;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }
}
