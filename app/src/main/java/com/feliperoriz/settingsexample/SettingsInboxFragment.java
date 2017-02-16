package com.feliperoriz.settingsexample;

import android.os.Bundle;
import android.support.v14.preference.SwitchPreference;
import android.support.v7.preference.PreferenceFragmentCompat;
import android.support.v7.preference.PreferenceScreen;

public class SettingsInboxFragment extends PreferenceFragmentCompat {

    @Override
    public void onCreatePreferences(Bundle savedInstanceState, String rootKey) {
        setPreferencesFromResource(R.xml.settings_inbox, rootKey);
        addNewSwitch();
    }

    private void addNewSwitch() {
        PreferenceScreen root = getPreferenceScreen();
        SwitchPreference switchPreference = new SwitchPreference(root.getContext());
        switchPreference.setTitle("Toggle");
        switchPreference.setPersistent(false);
        root.addPreference(switchPreference);
    }
}
