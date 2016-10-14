package com.feliperoriz.settingsexample;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v14.preference.SwitchPreference;
import android.support.v4.content.ContextCompat;
import android.support.v7.preference.PreferenceFragmentCompat;
import android.support.v7.preference.PreferenceScreen;
import android.view.View;

/**
 * Created by feliperoriz on 10/13/16.
 */

public class SettingsInboxFragment extends PreferenceFragmentCompat {

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        // Set the default white background in the view so as to avoid transparency
        view.setBackgroundColor(ContextCompat.getColor(getContext(), R.color.background_material_light));
    }

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
