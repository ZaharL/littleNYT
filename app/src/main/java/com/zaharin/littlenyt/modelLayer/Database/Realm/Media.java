package com.zaharin.littlenyt.modelLayer.Database.Realm;

import java.util.List;

import io.realm.RealmObject;

/**
 * Created by zah_arin on 2/6/18.
 */

public class Media extends RealmObject {
    public String type;
    public String subtype;
    public String caption;
    public String copyright;
    public int approvedForSyndication;
    public List<MediaMetadata> mediaMetadata = null;
}
