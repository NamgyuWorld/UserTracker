package com.namgyuworld.usertracker.model.info;

/**
 * Created by danielpark on 6/16/15.
 */
public class ApplicationInfo {

    private String packageName;
    private int versionCode;
    private String versionName;

    public String getPackageName() {
        return packageName;
    }

    public void setPackageName(String packageName) {
        this.packageName = packageName;
    }

    public int getVersionCode() {
        return versionCode;
    }

    public void setVersionCode(int versionCode) {
        this.versionCode = versionCode;
    }

    public String getVersionName() {
        return versionName;
    }

    public void setVersionName(String versionName) {
        this.versionName = versionName;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("packageName: ");
        stringBuilder.append(getPackageName());
        stringBuilder.append("\n");
        stringBuilder.append("versionCode: ");
        stringBuilder.append(getVersionCode());
        stringBuilder.append("\n");
        stringBuilder.append("versionName: ");
        stringBuilder.append(getVersionName());
        return stringBuilder.toString();
    }
}
