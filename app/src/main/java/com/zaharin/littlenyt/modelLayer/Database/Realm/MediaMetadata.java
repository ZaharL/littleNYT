package com.zaharin.littlenyt.modelLayer.Database.Realm;

import io.realm.RealmObject;

/**
 * Created by zah_arin on 2/6/18.
 */

public class MediaMetadata extends RealmObject {
    public String url;
    public String format;
    public int height;
    public int width;
}
