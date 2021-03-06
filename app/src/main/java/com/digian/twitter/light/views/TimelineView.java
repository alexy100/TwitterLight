package com.digian.twitter.light.views;

import android.widget.ListAdapter;

/**
 * Created by forrestal on 24/08/2015.
 * interface Presenter users to communicate with the view (fragment)
 */
public interface TimelineView {
    void createAdapter(ListAdapter adapter);
    void updateAdapter(ListAdapter adapter);
    void displayError(String string);
}
