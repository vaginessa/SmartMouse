package ch.virt.smartphonemouse.ui;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;

import androidx.activity.result.ActivityResultLauncher;

public interface MainContext {
    void exitApp();
    void navigate(int element);
    ActivityResultLauncher<Intent> registerActivityForResult(ResultListener result);
    void toast(String content, int duration);
    void snack(String content, int duration);
    Resources getResources();
    Context getContext();
    void refresh();

}
