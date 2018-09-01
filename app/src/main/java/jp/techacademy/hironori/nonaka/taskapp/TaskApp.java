package jp.techacademy.hironori.nonaka.taskapp;

import android.app.Application;

import io.realm.Realm;


//このクラスをメインフェスタの<aplication>に記述するとocCreate()が呼び出されるときにこのクラスも呼び出される
public class TaskApp extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        //レルムを初期化
        //特別な設定を施さずにデフォルトで使用する場合はこのような処理を行う
        Realm.init(this);
    }
}