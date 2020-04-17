package com.hanvon.shoushida.ui.base;
import java.lang.ref.WeakReference;

public abstract class BasePresenter<V> {

    private WeakReference<V> reference;

    public void attachView(V view) {
        reference = new WeakReference<>(view);
    }

    protected V getView() {
        return reference.get();
    }

    public void detachView() {
        if (reference != null) {
            reference.clear();
            reference = null;
        }
    }
}
