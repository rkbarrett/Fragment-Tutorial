package com.msi.fragmentsession;

/**
 * Created by Kent on 4/21/2015.
 */
public class UserInfo {
    private String mName;
    private String mAddress;
    private String mPhoneNumber;

    public UserInfo(String name, String address, String phoneNumber) {
        mName = name;
        mAddress = address;
        mPhoneNumber = phoneNumber;
    }

    public String getName() {
        return mName;
    }

    public String getAddress() {
        return mAddress;
    }

    public String getPhoneNumber() {
        return mPhoneNumber;
    }
}
